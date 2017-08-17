package com.harmony.wenguang.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.harmony.wenguang.dao.FormtableMainDao;
import com.harmony.wenguang.dao.WgDocumentsDao;
import com.harmony.wenguang.dao.dataobject.FormtableMain2DO;
import com.harmony.wenguang.dao.dataobject.WgDocumentsDO;
import com.harmony.wenguang.support.CommonUtils;
import com.harmony.wenguang.support.FileTransformUtils;
import com.harmony.wenguang.support.LocalCache;

@Controller
@RequestMapping("/documents/")
public class DocumentsController {
    @Resource
    HttpServletRequest request;
    @Resource
    WgDocumentsDao     wgDocumentsDao;
    @Resource
    FormtableMainDao   formtableMainDao;
    
    static List<String> picSuffixs = Arrays.asList("jpg","png","gif","jpeg");
    @RequestMapping("/get.do")
    public String doc(HttpServletResponse response) {
        String docName = request.getParameter("docName");
        String docid = request.getParameter("docid");
        String cacheKey = "get_doc_111111111_";
        if (docName != null) {
            cacheKey += docName;
        } else {
            cacheKey += docid;
        }
        OutputStream os = null;
        try {
            WgDocumentsDO dd = LocalCache.get(cacheKey);
            if (dd == null) {
                WgDocumentsDO example = new WgDocumentsDO();
                example.setDocName(docName != null ? docName : docid);
                List<WgDocumentsDO> list = wgDocumentsDao.selectByExample(example);
                if (list == null || list.size() == 0) {
                    Integer requestId = CommonUtils.parseInt(docName, null);
                    Long longDocid = CommonUtils.parseLong(docid, null);
                    FileTransformUtils.transform(longDocid, requestId);
                    list = wgDocumentsDao.selectByExample(example);
                    if (list == null || list.size() == 0) {
                        return "404";
                    }
                }
                dd = list.get(0);
                if (dd != null) {
                    LocalCache.cache(cacheKey, dd);
                    System.out.println("--------- get document from db------------");
                }
            }
            if (dd.getDocContent() == null || dd.getDocContent().length() == 0) {
                return "404";
            }
            os = response.getOutputStream();
            if ("html".equals(dd.getDocType())) {
                response.setContentType("text/html");
                response.setCharacterEncoding("utf-8");
                os.write(dd.getDocContent().getBytes("utf-8"));
            } else if (picSuffixs.contains(dd.getDocType())) {
                response.setContentType("image/pjpeg");
                os.write(Base64.decodeBase64(dd.getDocContent()));
            } else if ("txt".equals(dd.getDocType())) {
                response.setContentType("text/plain");
                response.setCharacterEncoding("utf-8");
                os.write(Base64.decodeBase64(dd.getDocContent()));
            } else {
                String docType = dd.getDocType();
                response.setContentType("application/octet-stream");
                response.addHeader(
                        "Content-Disposition",
                        "attachment;fileName=" + CommonUtils.encodeurl(dd.getDocName())
                                + (CommonUtils.blank(docType) ? "" : ("." + dd.getDocType())));
                os.write(Base64.decodeBase64(dd.getDocContent()));
            }
            return null;
        } catch (Exception ex) {
            ex.printStackTrace();
            return "something err";
        } finally {
            IOUtils.closeQuietly(os);
        }
    }

    @RequestMapping("/fujian.do")
    public String fujian(HttpServletResponse response) throws Exception, IOException {
        OutputStream os = null;
        try {
            Long docid = CommonUtils.parseLong(request.getParameter("docid"), null);
            if (docid == null) {
                return null;
            }

            FormtableMain2DO mainDO = new FormtableMain2DO();
            mainDO.setId(docid);
            List<FormtableMain2DO> list = formtableMainDao.selectByExample(mainDO);
            if (list == null || list.size() == 0) {
                return null;
            }
            FormtableMain2DO detail = list.get(0);
            String docType = CommonUtils.getFileSuffix(detail.getFjbt());
            os = response.getOutputStream();
            if ("html".equals(docType)) {
                response.setContentType("text/html");
                response.setCharacterEncoding("utf-8");
                os.write(detail.getFjInputStream().getBytes("utf-8"));
            } else if (picSuffixs.contains(docType)) {
                response.setContentType("image/pjpeg");
                os.write(Base64.decodeBase64(detail.getFjInputStream()));
            } else if ("txt".equals(docType)) {
                response.setContentType("text/plain");
                response.setCharacterEncoding("utf-8");
                os.write(Base64.decodeBase64(detail.getFjInputStream()));
            } else {
                String fjname = detail.getFjbt() ;
                response.setContentType("application/octet-stream");
                response.addHeader("Content-Disposition",
                        "attachment;fileName=" + CommonUtils.encodeurl(fjname));
                os.write(Base64.decodeBase64(detail.getFjInputStream()));
            }
        } catch (Exception ex) {
            response.setContentType("text/html");
            response.setCharacterEncoding("utf-8");
            os.write("系统异常".getBytes("utf-8"));
        } finally {
            IOUtils.closeQuietly(os);
        }
        return null;
    }
}

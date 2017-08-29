<!-- 近期信息公开页面，用于呈现近期公开的信息 -using-->
<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="zh_CN" lang="zh_CN">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>上海市文化广播影视管理局 上海市文物局</title>
<script type="text/javascript" id="ABT" src="http://wgj.sh.gov.cn/images/wg2015/script/ABT/ABT.js"></script>
<link rel="stylesheet" type="text/css" href="http://wgj.sh.gov.cn/images/wg2015/styles/public.css" />
<link rel="stylesheet" type="text/css" href="http://wgj.sh.gov.cn/images/wg2015/styles/mainFrame.css" />
<link rel="stylesheet" type="text/css" href="http://wgj.sh.gov.cn/images/wg2015/styles/modules.css" />
<link rel="stylesheet" type="text/css" href="http://wgj.sh.gov.cn/images/wg2015/styles/style_zfxxgk6.css" />
</head>

<body>
<div id="skip"><a href="#content" title="跳转到主要内容区域" accesskey="2">跳转到主要内容区域</a></div>
<div id="container">
    <div id="header">
        <div id="header_top">
            <div class="pageCenter">
                <h1 id="logo"><img src="http://wgj.sh.gov.cn/images/wg2015/images/mf_headerLogo.gif" alt="上海市文化广播影视管理局 上海市文物局" title="上海市文化广播影视管理局 上海市文物局" /></h1>
                <ul id="quickLink">
                    <li><a href="http://wgj.sh.gov.cn/" title="简体">简体</a></li>
                    <li><a href="http://big5.eastday.com:82/gate/big5/wgj.eastday.com/" title="繁体">繁体</a></li>
                    <li><a href="http://hz.eastday.com/wgjc/report.aspx" title="纠错">纠错</a></li>
                    <li><a href="javascript:ABT.show()" title="无障碍浏览工具">无障碍浏览工具</a></li>
                </ul>
                <ul id="mainnav">
                    <li><a href="http://wgj.sh.gov.cn/node2/n2029/index.html" target="_parent" title="首页">首页</a></li>
                    <li><a href="http://wgj.sh.gov.cn/node2/n2029/n2030/index.html" target="_parent" title="要闻动态">要闻动态</a></li>
                    <li class="navSelect"><a href="http://wgj.sh.gov.cn/node2/n2029/n2031/index.html" target="_parent" title="政府信息公开">政府信息公开</a></li>
                    <li><a href="http://wsbs.wgj.sh.gov.cn/shwgj_zwdt/core/web/welcome/index!all.action" target="_parent" title="网上政务大厅">网上政务大厅</a></li>
                    <li><a href="http://wgj.sh.gov.cn/node2/n2029/n2032/index.html" target="_parent" title="政民互动">政民互动</a></li>
                    <li><a href="http://wgj.sh.gov.cn/node2/n2029/n2033/index.html" target="_parent" title="公众服务">公众服务</a></li>
                    <li><a href="http://wgj.sh.gov.cn/node2/n2029/n2034/index.html" target="_parent" title="走进文广">走进文广</a></li>
                </ul>
                <div class="clear"></div>
            </div>
        </div>
        <div id="header_bottom">
            <div class="pageCenter">
                <h2 id="subTitle"><img src="http://wgj.sh.gov.cn/images/wg2015/images/mf_subTitle.gif" alt="网上政务大厅" title="网上政务大厅" /></h2>
                <iframe id="mainSearchFrame" src="http://wgj.sh.gov.cn/node2/n2029/n2158/n2187/index.html" frameborder="0" scrolling="no" marginwidth="0" marginheight="0" title="搜索"></iframe>
                <div class="clear"></div>
            </div>
        </div>
    </div>
    <div id="main">
        <div id="mainTop">
            <div class="pageCenter">
                <div id="breadcrumbNav">
                    <ul>
                        <li><a href="http://wgj.sh.gov.cn/node2/n2029/index.html" target="_blank" title="首页">首页</a></li>
                        <li><a href="http://wgj.sh.gov.cn/node2/n2029/n2031/index.html" target="_parent" title="政府信息公开">政府信息公开</a></li>
                        <li>近期信息公开</li>
                    </ul>
                </div>
                <iframe id="subSearchFrame" src="http://wgj.sh.gov.cn/node2/n2029/n2158/n2188/index.html" frameborder="0" scrolling="no" marginwidth="0" marginheight="0" title="本栏检索"></iframe>
                <div class="clear"></div>
            </div>
        </div>
        <div class="pageCenter" id="content">
            <div id="maincontent">
               <h2 class="rsPublicTitle">近期信息公开</h2>
                <ul class="publist2">
                	<c:forEach items="${docList}" var="doc">
                    	<li><a target="__blank" href="/busi/docshow.do?docid=${doc.id }&ejml=${doc.xxgkejml}&yjml=${doc.xxgkyjml}">${doc.zwbt }</a><span class="pubtime">${doc.yfrq}</span></li>
                	</c:forEach>
                </ul>
                <ul id="changepage">
                	<c:if test="${not empty docList }">
                	<a id="prev" href="/entrance/info_disclosure.do?pageNo=${curPage==1?1:(curPage-1)}">&lt;&lt;</a>
					<span id="nums">
					<c:forEach begin="${beginPage }" end="${endPage }" var="v">
						<c:if test="${v == curPage }">
							<a style="border: 0px;"> ${v}</a>
						</c:if>
						<c:if test="${not (v == curPage) }">
							<a href="/entrance/info_disclosure.do?pageNo=${v}"> ${v } </a>
						</c:if>
					</c:forEach>
	                </span>
	                <a id="next" href="/entrance/info_disclosure.do?pageNo=${curPage==totalPage?totalPage:(curPage+1)}">&gt;&gt;</a>
                </c:if>
                <c:if test="${empty docList}">
					<div id="empty">未找到相关记录，请检查输入的文字是否有误或更换关键字</div>
				</c:if>             						
                </ul>
            </div>
            <div id="rightsidebar">
                <iframe id="xxgk_gkml" src="/entrance/index2.do" frameborder="0" scrolling="no" marginwidth="0" marginheight="0" title="信息公开目录"></iframe>
                <iframe id="xxgk_gkjs" src="/entrance/index3.do" frameborder="0" scrolling="no" marginwidth="0" marginheight="0" title="信息公开检索"></iframe>
                <iframe id="xxgk_zcjd" src="http://wgj.sh.gov.cn/node2/n2029/n2031/n2075/index_K566.html" frameborder="0" scrolling="no" marginwidth="0" marginheight="0" title="政策解读"></iframe>
            </div>
            <div class="clear"></div>
        </div>
    </div>
<iframe marginwidth="0" marginheight="0" src="http://wgj.sh.gov.cn/node2/n2029/n2158/n2177/index.html" frameborder="0" width="100%" scrolling="no" height="131"></iframe>

</div>
</body>
</html>
<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="zh_CN" lang="zh_CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>上海市文化广播影视管理局 上海市文物局</title>
<script type="text/javascript" id="ABT" src="http://wgj.sh.gov.cn/images/wg2015/script/ABT/ABT.js"></script>
<script type="text/javascript" src="http://wgj.sh.gov.cn/images/wg2015/script/openTag.js"></script>
<link rel="stylesheet" type="text/css" href="/static/css/public.css" />
<link rel="stylesheet" type="text/css" href="/static/css/mainFrame.css" />
<link rel="stylesheet" type="text/css" href="/static/css/modules.css" />
<link rel="stylesheet" type="text/css" href="/static/css/style_zfxxgk2.css" />
</head>

<body>
<div id="skip"><a href="#content" title="跳转到主要内容区域" accesskey="2">跳转到主要内容区域</a></div>
<div id="container">
    <div id="header">
        <div id="header_top">
            <div class="pageCenter">
                <div class="clear"></div>
            </div>
        </div>
        <div id="header_bottom">
            <div class="pageCenter">
                <div class="clear"></div>
            </div>
        </div>
    </div>
    <div id="main">
        <div id="mainTop">
            <div class="pageCenter">
                <div id="breadcrumbNav">
                    <ul>
                        <li><a href="http://wgj.sh.gov.cn/node2/n2029/index.html" target="_parent" title="首页">首页</a></li>
                    </ul>
                </div>
                <div class="clear"></div>
            </div>
        </div>
        <div class="pageCenter" id="content">
            <div id="maincontent">
                <div id="box_jjxxgk">
                    <a href="http://wgj.sh.gov.cn/node2/n2029/n2031/n2062/index.html" target="_parent" title="近期信息公开"><h3 class="pubh3_3">近期信息公开</h3></a>
                    <ul class="publist1">
				    	<li><a  href="/wg/docid/${docList[0].id }" target="_blank" title="${docList[0].zwbt }">${docList[0].zwbt }</a>
					   		<span class="pubtime">${docList[0].yfrq }</span>
					   	</li>
					   	<li><a  href="/wg/docid/${docList[1].id }" target="_blank" title="${docList[1].zwbt }">${docList[1].zwbt }</a>
					   		<span class="pubtime">${docList[1].yfrq }</span>
					   	</li>
					   	<li><a  href="/wg/docid/${docList[2].id }" target="_blank" title="${docList[2].zwbt }">${docList[2].zwbt }</a>
					   		<span class="pubtime">${docList[2].yfrq }</span>
					   	</li>
			     	</ul>
                </div>
                <div id="box_zbxx" class="main_zhaobgg">
                    <h3 class="pubh3_3" id="title_zhaobgg"><a href="http://wgj.sh.gov.cn/node2/n2029/n2031/n2085/n2086/index.html" target="_parent" title="综合政务" onmouseover="openTag('box_zbxx','main_zhaobgg')" onfocus="openTag('box_zbxx','main_zhaobgg')">综合政务</a></h3>
                    <div class="pubcontent3" id="content_zhaobgg">
                    <ul class="publist1">
                    <c:forEach items="${docList2}" var="doc">
					   <li><a class="btn-line" href="/wg/docid/${doc.id }" target="_blank" title="${doc.zwbt }">${doc.zwbt }</a>
					   <span class="pubtime">${doc.yfrq }</span>
					   </li>
				    </c:forEach>
                    </ul>
                    </div>
                    <h3 class="pubh3_3" id="title_zhongbgg"><a href="http://wgj.sh.gov.cn/node2/n2029/n2031/n2085/n2087/index.html" target="_parent" title="民政社区" onmouseover="openTag('box_zbxx','main_zhongbgg')" onfocus="openTag('box_zbxx','main_zhongbgg')">民政社区</a></h3>
                    <div class="pubcontent3" id="content_zhongbgg">
                        <ul class="publist1">
                    <c:forEach items="${docList3}" var="doc">
					   <li><a  class="btn-line" href="/wg/docid/${doc.id }" target="_blank" title="${doc.zwbt }">${doc.zwbt }</a>
					   <span class="pubtime">${doc.yfrq }</span>
					   </li>
				    </c:forEach>
                        </ul>
                    </div>
                </div>
                <div id="box_zcxx" class="main_zcfg">
                    <h3 class="pubh3_3" id="title_zcfg"><a href="http://wgj.sh.gov.cn/node2/n2029/n2031/n2064/index.html" target="_parent" title="财政金融审计" onmouseover="openTag('box_zcxx','main_zcfg')" onfocus="openTag('box_zcxx','main_zcfg')">财政金融审计</a></h3>
                    <div class="pubcontent3" id="content_zcfg">
                        <ul class="publist1">
                    <c:forEach items="${docList4}" var="doc">
					   <li><a  class="btn-line" href="/wg/docid/${doc.id }" target="_blank" title="${doc.zwbt }">${doc.zwbt }</a>
					   <span class="pubtime">${doc.yfrq }</span>
					   </li>
				    </c:forEach>
                        </ul>
                    </div>
                    <h3 class="pubh3_3" id="title_zcjd"><a href="http://wgj.sh.gov.cn/node2/n2029/n2031/n2075/index.html" target="_parent" title="国土资源能源" onmouseover="openTag('box_zcxx','main_zcjd')" onfocus="openTag('box_zcxx','main_zcjd')">国土资源能源</a></h3>
                    <div class="pubcontent3" id="content_zcjd">
                        <ul class="publist1">
                    <c:forEach items="${docList5}" var="doc">
					   <li><a  class="btn-line" href="/wg/docid/${doc.id }" target="_blank" title="${doc.zwbt }">${doc.zwbt }</a>
					   <span class="pubtime">${doc.yfrq }</span>
					   </li>
				    </c:forEach>
                        </ul>
                    </div>
                </div>
                <div id="box_cwxx" class="main_cwgk">
                    <h3 class="pubh3_3" id="title_cwgk"><a href="http://wgj.sh.gov.cn/node2/n2029/n2031/n2076/index.html"target="_parent" title="劳动人事监察" onmouseover="openTag('box_cwxx','main_cwgk')" onfocus="openTag('box_cwxx','main_cwgk')">劳动人事监察</a></h3>
                    <div class="pubcontent3" id="content_cwgk">
                        <ul class="publist1">
                    <c:forEach items="${docList6}" var="doc">
					   <li><a  class="btn-line" href="/wg/docid/${doc.id }" target="_blank" title="${doc.zwbt }">${doc.zwbt }</a>
					   <span class="pubtime">${doc.yfrq }</span>
					   </li>
				    </c:forEach>
                        </ul>
                    </div>
                    <h3 class="pubh3_3" id="title_ggzj"><a href="http://wgj.sh.gov.cn/node2/n2029/n2031/n2150/index.html" target="_parent" title="公安安全司法" onmouseover="openTag('box_cwxx','main_ggzj')" onfocus="openTag('box_cwxx','main_ggzj')">公安安全司法</a></h3>
                    <div class="pubcontent3" id="content_ggzj">
                        <ul class="publist1">
                    <c:forEach items="${docList7}" var="doc">
					   <li><a  class="btn-line" href="/wg/docid/${doc.id }" target="_blank" title="${doc.zwbt }">${doc.zwbt }</a>
					   <span class="pubtime">${doc.yfrq }</span>
					   </li>
				    </c:forEach>
                        </ul>
                    </div>
                </div>
            </div>
            <div id="rightsidebar">
                <iframe id="xxgk_gkml" src="/entrance/index2.do" frameborder="0" scrolling="no" marginwidth="0" marginheight="0" title="信息公开目录"></iframe>
                <iframe id="xxgk_gkjs" src="/entrance/index3.do" frameborder="0" scrolling="no" marginwidth="0" marginheight="0" title="信息公开检索"></iframe>
                <iframe id="xxgk_ztlm" src="http://wgj.sh.gov.cn/node2/n2029/n2158/n2192/index.html" frameborder="0" scrolling="no" marginwidth="0" marginheight="0" title="专题栏目"></iframe>
            </div>
            <div class="clear"></div>
        </div>
    </div>
<iframe marginwidth="0" marginheight="0" src="http://wgj.sh.gov.cn/node2/n2029/n2158/n2177/index.html" frameborder="0" width="100%" scrolling="no" height="131"></iframe>

</div>
</body>
</html>
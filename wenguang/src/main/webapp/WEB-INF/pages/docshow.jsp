<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=gb2312"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh">
<head>
<meta charset="gb2312">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
<meta name="renderer" content="webkit">
<title>市长、副市长工作分工</title>
<meta name="keywords" content="中国上海 上海市政府 市长、副市长工作分工">
<meta name="description" content="中国上海" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="author" content="author,email address">
<link rel="shortcut icon" href="http://www.shanghai.gov.cn//newshanghai/img/ico/favicon.png">
</head>
<body onload="initJSHelperEvent();" class="">
    
 <div id="accessNull"></div>
<!-- min CSS -->
 <link rel="stylesheet" type="text/css" href="http://www.shanghai.gov.cn//newshanghai/css/ETUI.min.css">
<style> 
#skip {overflow: hidden;width: 0px;height: 0px;}
</style>

<link href="http://www.shanghai.gov.cn//newshanghai/css/owl/owl.carousel.css" rel="stylesheet" media="screen">
<link href="http://www.shanghai.gov.cn//newshanghai/js/owl/owl.theme.css" rel="stylesheet">
<link href="http://www.shanghai.gov.cn//newshanghai/css/style.css" rel="stylesheet">
<link href="http://www.shanghai.gov.cn//newshanghai/css/sh-responsive.css" rel="stylesheet">
<!-- Fav and touch icons -->
<link rel="apple-touch-icon-precomposed" sizes="144x144" href="http://www.shanghai.gov.cn//newshanghai/img/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114" href="http://www.shanghai.gov.cn//newshanghai/img/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72" href="http://www.shanghai.gov.cn//newshanghai/img/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed" href="http://www.shanghai.gov.cn//newshanghai/img/ico/apple-touch-icon-57-precomposed.png">
<link rel="shortcut icon" href="http://www.shanghai.gov.cn//newshanghai/img/ico/favicon.png">
<!-- 工具条 -->
<link href="http://www.shanghai.gov.cn/jhelper_V2.0/jhelper_tool_style.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="http://www.shanghai.gov.cn//newshanghai/js/jquery-1.7.2.min.js"></script> 
<style>
img{border:none;}
li{list-style:none;}
h1,h2,h3,h4,h5,h6{
	font-size:12px;
	line-height:16px;
	font-weight:bold;
}
ul,
ol {
  padding: 0;
  margin: 0;
}
a:link{color:#333;text-decoration:none;}
a:visited{color:#333;text-decoration:none;}
a:hover{color:#333;text-decoration:underline;}
.clear,div#skip{
	clear:both;
	height:0px;
	font-size:0px;
	line-height:0px;
	overflow:hidden;
}
.clear{clear:both;}
</style>
<link rel="stylesheet" type="text/css" href="/static/css/mainFrame.css" />
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

<div id="container">
  <div id="header" class="navbar MainNav no-margin-bottom"> 
  </div>
  <div class="container">
     <div class="row-fluid">
        <div class="span8 no-margin-left">
        	<!-- 一级目录名称 -->
            <div class="page-header-1"><h4><a title="${yjmlData.yjmlmc }">${yjmlData.yjmlmc }</a></h4></div>
	        <!-- 文件列表 -->
	        <div class="row-fluid">
			     <iframe width="100%" height="100%" align="center" frameborder="0" scrolling="auto" style="border: 1px;"
			      id="cwin" name="cwin" onload="Javascript:SetCwinHeight()"
			      src="/wg/docid/${docid }"></iframe>
	       </div>
		</div>
		<div class="span4"></div>
		<div class="span4">
			<!-- 一级目录 -->
			<ul class="nav nav-list arrowNav margin-bottom20">
				<c:forEach items="${menu1List }" var="menu">
					<li onclick=""><a href="/busi/docindex.do?yjml=${menu.id }" title="${menu.yjmlmc }" ><span>${menu.yjmlmc }</span></a></li>
				</c:forEach>
			</ul>
		</div>
	  </div>
   </div>
	<iframe marginwidth="0" marginheight="0" src="http://wgj.sh.gov.cn/node2/n2029/n2158/n2177/index.html" frameborder="0" width="100%" scrolling="no" height="131"></iframe>
</div>
</body>
</html>
<
<script type="text/javascript">
	function SetCwinHeight() {
		var cwin = document.getElementById("cwin");
		if (document.getElementById) {
			if (cwin && !window.opera) {
				if (cwin.contentDocument
						&& cwin.contentDocument.body.offsetHeight)
					cwin.height = cwin.contentDocument.body.offsetHeight + 200;
				else if (cwin.Document && cwin.Document.body.scrollHeight)
					cwin.height = cwin.Document.body.scrollHeight + 200;
			}
		}
	}
</script>

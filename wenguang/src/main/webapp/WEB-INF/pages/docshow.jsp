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
<!-- <link rel="stylesheet" type="text/css" href="/static/css/hello.css" /> -->
<style type="text/css">
*{margin:0px;padding:0px;}
.body {
	background: gray;
}
div.pageCenter{
	width:1000px;
	margin:0px auto;
}
a:link{color:#333;text-decoration:none;}
a:visited{color:#333;text-decoration:none;}
a:hover{color:#333;text-decoration:underline;}

div#breadcrumbNav{
	float:left;
	width:600px;
	padding-left:10px;
}
div#breadcrumbNav ul{
	float:left;
	width:100%;
	padding:7px 0px;
	overflow:hidden;
}
div#breadcrumbNav ul li{
	float:left;
	margin-left:-19px;
	padding:0px 28px 0px 19px;
	background:url(http://wgj.sh.gov.cn/images/wg2015/images/mf_breadcrumbNavBg.gif) no-repeat left 2px;
	white-space:nowrap;
	color:#333;
}


</style>
</head>
<body onload="initJSHelperEvent();" class="">
    <div id="breadcrumbNav">
        <ul>
            <li><a href="/entrance/main.do" target="_blank" title="首页">首页</a></li>
            <li><em class="abtFlag">信息公开</em></li>
        </ul>
    </div>
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
			     <iframe width="100%" height="100%" align="center" frameborder="0" scrolling="auto" style="border: solid 1px;"
			      id="cwin" name="cwin" onload="Javascript:SetCwinHeight()"
			      src="http://localhost/wg/docid/${docid }"></iframe>
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
					cwin.height = cwin.contentDocument.body.offsetHeight;
				else if (cwin.Document && cwin.Document.body.scrollHeight)
					cwin.height = cwin.Document.body.scrollHeight;
			}
		}
	}
</script>

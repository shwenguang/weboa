<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<html>
<head>
<style type="text/css">
@charset "utf-8";

body, div, ul, ol, li {
	margin: 0;
	padding: 0;
	font-style: normal;
	font: 14px/22px "\5B8B\4F53", Arial, Helvetica, sans-serif
}

ol, ul, li {
	list-style: none
}

body {
	color: #CECECE;
	background: #FFF
}

.clear {
	clear: both;
	height: 1px;
	width: 100%;
	overflow: hidden;
	margin-top: -1px
}

a {
	color: #343434;
	text-decoration: none
}

a:hover {
	color: #BA2636;
	text-decoration: underline
}

ul.news {
	margin-left: 60px;
	width: 600px
}

ul.news li {
	height: 28px;
	line-height: 28px;
	text-indent: 10px;
	width: 100%;
	overflow: hidden;
}

h3 {
    display: block;
    font-size: 1.17em;
    -webkit-margin-before: 1em;
    -webkit-margin-after: 1em;
    -webkit-margin-start: 0px;
    -webkit-margin-end: 0px;
    margin-left: 30px;
    margin-top: 30px;
    width:200px;
    text-align:center;
}
</style>
</head>
<body>
	<h3>文件列表</h3>
	<ul class="news">
		<c:forEach var="item" items="${doclist }" varStatus="vs">
			<li>
				<span style="width: 30px; position: relative;"><b><em>${vs.index + 1 }</em></b> </span>
				<span style="width: 2000px;position: relative;"><a href="${item.url }">${item.name }</a></span>
				<span style="width: 200px;position: relative;">${item.zs }</span>
			</li>
		</c:forEach>
	</ul>
</body>
</html>


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
	width: 200px;
	text-align: center;
}
</style>
</head>
<body>
	<h3>文件列表</h3>
	<div id="app">
		<ul class="news">
			<li v-for="doc in docs">
				<span style="width: 30px; position: relative;"><b><em>111</em></b></span>
				<span style="width: 2000px; position: relative;"><a href="#">{{doc.name}}</a></span>
				<span style="width:200px; position: relative;"> 2017-01-01 </span>
			</li>
		</ul>
	</div>
	<script src="//vuejs.org/js/vue.min.js"></script>
	<script src="//libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
	<script src="//unpkg.com/axios/dist/axios.min.js"></script>
	<script type="text/javascript">
		var data = {
			docs:[]
		}
		function hello(p) {
			axios.get("/busi/querydocs.do", {
				params : {
					code : p.code
				}
			}).then(function(res) {
				data.docs = res.data;
			})
		}
		var vm = new Vue({
			el : "#app",
			data : data
		})
	</script>
</body>
</html>
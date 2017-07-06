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
}
</style>
</head>
<body>
	<div id="app">
		<h3>> {{m1}} > {{m2}} </h3>
		<ul class="news">
			<li v-for="doc in docs">
				<span style="width: 30px; position: relative;"><b><em>{{doc.rowid}}</em></b></span>
				<span style="width: 2000px; position: relative;"><a v-bind:href="doc.url" target="view_window">{{doc.name}}</a></span>
				<span style="width:200px; position: relative;"> 2017-01-01 </span>
			</li>
		</ul>
	</div>
	<script src="//vuejs.org/js/vue.min.js"></script>
	<script src="//libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
	<script src="//unpkg.com/axios/dist/axios.min.js"></script>
	<script type="text/javascript">
		var data = {
			paramCode:'文件列表',
			m1:'所有',
			m2:'所有',
			docs:[
				{name:"测试测试AAAAAAAAA",url:"/wg/reqid/1", rowid:1},
				{name:"测试测试BBBBBBBBB",url:"/wg/reqid/2", rowid:2},
				{name:"测试测试CCCCCCCCC",url:"/wg/reqid/3", rowid:3},
				{name:"测试测试DDDDDDDDD",url:"/wg/reqid/4", rowid:4},
				{name:"测试测试EEEEEEEEE",url:"/wg/reqid/5", rowid:5},
				{name:"测试测试FFFFFFFFF",url:"/wg/reqid/6", rowid:6},
				{name:"测试测试GGGGGGGGG",url:"/wg/reqid/7", rowid:7},
				{name:"测试测试HHHHHHHHH",url:"/wg/reqid/8", rowid:8}
			]
		}
		function hello(p) {
			data.paramCode = p.code;
			data.m1 = p.m1;
			data.m2 = p.m2;
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

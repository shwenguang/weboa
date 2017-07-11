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
				<span style="width:200px; position: relative;"> {{doc.zs}} </span>
			</li>
		</ul>
	</div>
	<script src="//vuejs.org/js/vue.min.js"></script>
	<script src="//libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
	<script src="//unpkg.com/axios/dist/axios.min.js"></script>
	<script type="text/javascript">
		var data = {
			paramCode:'文件列表',
			m1:'',
			m2:'',
			docs:[
				
			]
		}
		function doBusiness(p) {
			data.paramCode = p.code;
			data.m1 = p.m1;
			data.m2 = p.m2;
			axios.get("/busi/querydocs.do", {
				params : {
					code : p.code,
					yjmlid:p.yjmlid,
					ejmlid:p.ejmlid,
					yjmlmc:p.m1,
					ejmlmc:p.m2
				}
			}).then(function(res) {
				data.docs = res.data;
			})
		}
		var vm = new Vue({
			el : "#app",
			data : data,
			created:function(){
				doBusiness({});//初始化时查询全部文档
				this.m1 = "全部"
				this.m2 = "全部文档"
			}
		})
	</script>
</body>
</html>

<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>jQuery点击展开收缩树形菜单</title>
	<style type="text/css">
	*{margin: 0;padding: 0}
	body{font-size: 12px;font-family: "宋体","微软雅黑";}
	ul,li{list-style: none;}
	a:link,a:visited{text-decoration: none;color: #fff;}
	.list{width: 210px;border-bottom:solid 1px #316a91;margin:40px auto 0 auto;}
	.list ul li{background-color:#ff5a00; border:solid 1px #316a91; border-bottom:0;}
	.list ul li a{padding-left: 10px;color: #fff; font-size:12px; display: block; font-weight:bold; height:36px;line-height: 36px;position: relative;
	}
	.list ul li .inactive{ background:url(images/off.png) no-repeat 184px center;}
	.list ul li .inactives{background:url(images/on.png) no-repeat 184px center;} 
	.list ul li ul{display: none;}
	.list ul li ul li { border-left:0; border-right:0; background-color:#6196bb; border-color:#467ca2;}
	.list ul li ul li ul{display: none;}
	.list ul li ul li a{ padding-left:20px;}
	.list ul li ul li ul li { background-color:#d6e6f1; border-color:#6196bb; }
	.last{ background-color:#d6e6f1; border-color:#6196bb; }
	.list ul li ul li ul li a{ color:#316a91; padding-left:30px;}
	</style>
	<script type="text/javascript"  src="/static/js/jquery-1.8.2.js"></script>
	<script type="text/javascript">
	$(document).ready(function() {
		$('.inactive').click(function(){
			if($(this).siblings('ul').css('display')=='none'){
				$(this).addClass('inactives');
				$(this).siblings('ul').slideDown(100).children('li');
			}else{
				$(this).removeClass('inactives');
				$(this).siblings('ul').slideUp(100);
			}
			return null;
		});
		
		$("a[code]").click(function(){
			self.parent.frames["rightFrame"].doBusiness({
				code:$(this).attr("code"),
				m1:$(this).attr("m1"),
				m2:$(this).attr("m2"),
				yjmlid:$(this).attr("yjmlid"),
				ejmlid:$(this).attr("ejmlid")
			})
		})
	});
	
	
	</script>
</head>
<body>
	<div class="list">
		<ul class="yiji">
			<c:forEach items="${menuList }" var="menu">
			<li>
				<a href="#" class="inactive active">${menu.name }</a>
				<ul>
					<c:forEach items="${menu.subs }" var="subMenu">
						<li><a href="#" code="sub" m1="${menu.name }" m2="${subMenu.name }" yjmlid="${subMenu.yjmlid }" ejmlid="${subMenu.ejmlid }">${subMenu.name }</a></li>
					</c:forEach>
				</ul>
			</li>
			</c:forEach>
<!-- 			<li><a href="#" class="inactive active">组织机构简介</a> -->
<!-- 				<ul> -->
<!-- 					<li><a href="#">上海市人民政府</a></li> -->
<!-- 					<li><a href="#">上海市人民政府办公厅</a></li> -->
<!-- 					<li><a href="#">上海市人民政府组成部门</a></li> -->
<!-- 					<li><a href="#">上海市人民政府直属机构</a></li> -->
<!-- 					<li><a href="#">其他</a></li> -->
<!-- 				</ul> -->
<!-- 			</li> -->
			
			
<!-- 			<li><a href="#" class="inactive">目录二</a> -->
<!-- 				<ul style="display: none"> -->
<!-- 					<li><a href="#" class="inactive active">子目录1</a> -->
<!-- 						<ul> -->
<!-- 							<li><a href="#" code="aaaa">AAAA</a></li> -->
<!-- 							<li><a href="#" code="bbbb">BBBB</a></li> -->
<!-- 							<li><a href="#" code="cccc">CCCC</a></li> -->
<!-- 						</ul> -->
<!-- 					</li>  -->
<!-- 					<li><a href="#" class="inactive active">子目录2</a>    -->
<!-- 						<ul> -->
<!-- 							<li><a href="#" code="aaa">AAAAA</a></li> -->
<!-- 							<li><a href="#" code="bbb">BBBBB</a></li> -->
<!-- 							<li><a href="#" code="ccc">CCCCC</a></li> -->
<!-- 							<li><a href="#" code="ddd">DDDDD</a></li> -->
<!-- 							<li><a href="#" code="eee">EEEEE</a></li> -->
<!-- 						</ul> -->
<!-- 					</li> -->
<!-- 					<li class="last"><a href="#">子目录3</a></li> -->
<!-- 				</ul> -->
<!-- 			</li> -->
		</ul>
	</div>
</body>
</html>
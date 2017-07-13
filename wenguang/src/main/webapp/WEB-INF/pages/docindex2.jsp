<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
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
<div id="container">
<!-- min CSS -->
<link rel="stylesheet" type="text/css" href="http://www.shanghai.gov.cn//newshanghai/css/ETUI.min.css">
<!--[if lte IE 6]>
<link rel="stylesheet" type="text/css" href="http://www.shanghai.gov.cn//newshanghai/css/ETUI-ie6.css">
<![endif]-->
<!--[if lte IE 7]>
<link rel="stylesheet" type="text/css" href="http://www.shanghai.gov.cn//newshanghai/css/ie.css">
<link rel="stylesheet" href="http://www.shanghai.gov.cn//newshanghai/css/fontello-ie7.css">
<![endif]-->
<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
<script src="http://www.shanghai.gov.cn//newshanghai/js/html5shiv.min.js"></script>
<![endif]-->
<!-- Custom CSS -->
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

<noscript>
不能读取jquery
</noscript>
<script src="http://www.shanghai.gov.cn/jhelper_V2.0/zgsh/jhelper_config.js" charset="gb2312"></script>
<noscript>
不能读取工具条配置
</noscript>
<script src="http://www.shanghai.gov.cn/jhelper_V2.0/jhelper_2.0.js" charset="gb2312"></script>
<noscript>
不能读取工具条
</noscript>
<!-- /工具条 -->
<script type="text/javascript" src="/newshanghai/js/jquery-1.7.2.min.js"></script> 

 
  <div id="header" class="navbar MainNav no-margin-bottom"> 
<div id="skip"><a id="accesshelp" title="新窗口打开无障碍操作说明页面" href="http://www.shanghai.gov.cn/shanghai/shuoming/shuoming.html#div0" target="_blank">无障碍操作说明</a>
<a href="javascript:createNodeDiv('mainNav', '已定位到网站导航');" title="跳转到网站导航区">跳转到网站导航区</a><a href="javascript:createNodeDiv('main', '已定位到主要内容区域');" title="跳转到主要内容区域">跳转到主要内容区域</a></div>
    <div class="navbar-inner">
      <div class="container">
        <div class="brand">
                    <script>
if(location.hostname == "big5.shanghai.gov.cn"){

    document.write("<a href=\"http://big5.shanghai.gov.cn/gate/big5/www.shanghai.gov.cn\" title=\"中国上海\" alt=\"*\"><img src=\"http://www.shanghai.gov.cn//newshanghai/img/big5/logo-hd.png\" class=\"hdlogo logo\"></a><a href=\"ht"+"tp://big5.shanghai.gov.cn/gate/big5/www.shanghai.gov.cn\" title=\"中国上海\" alt=\"*\"><img src=\"http://www.shanghai.gov.cn//newshanghai/img/big5/logo-sm.png\" class=\"smlogo logo pngFix\"></a>");
    }else
{
        document.write("<a href=\"http://www.shanghai.gov.cn\" alt=\"*\" title=\"中国上海\" ><img src=\"http://www.shanghai.gov.cn//newshanghai/img/logo-hd.png\" class=\"hdlogo logo\"></a><a href=\"http://www.shanghai.gov.cn\" alt=\"*\"><img src=\"http://www.shanghai.gov.cn//newshanghai/img/logo-sm.png\"  title=\"中国上海\"  class=\"smlogo logo pngFix\"></a>");
        }
</script>

          
          
          <a class="brandLink margin-left10" href="javascript:;" onclick="toggleToolBar()" title="无障碍浏览工具">无障碍</a>
          <script>
if(location.hostname == "big5.shanghai.gov.cn"){

    document.write("<a  class=\"brandLink\" href=\"ht"+"tp://www.shanghai.gov.cn\" title=\"简体\">简体</a>");
    }else
{
        document.write("<a  class=\"brandLink\" href=\"http://big5.shanghai.gov.cn/gate/big5/www.shanghai.gov.cn\" title=\"繁體\">繁體</a>");}
</script>

          
          <a class="brandLink no-margin-right" href="http://www.shanghai.gov.cn/shanghai/node27118/index.html">English</a>
        </div>
        <a data-toggle="offcanvas" data-target="#myNavmenu" data-canvas="#container" data-placement="right" class="btn-link btn-navbar">导航</a>
        <div class="nav-collapse collapse navbar-responsive-collapse MainNavBar-responsive-collapse">
          <ul  id="mainNav" class="nav">
          <li><a href="/" class="margin-left10">首页</a></li>
          <li id="nav01"><a href="/nw2/nw2314/nw2315/index.html">要闻动态</a></li>
          <li id="nav02"><a href="/nw2/nw2314/nw2319/index.html">政府信息公开</a></li>
          <li id="nav03"><a href="http://zwdt.sh.gov.cn/zwdt/">网上政务大厅</a></li>
          <li id="nav04"><a href="/nw2/nw2314/nw38605/index.html">政民互动</a></li>
          <li id="nav05"><a href="/nw2/nw2314/nw2315/nw17239/index.html">公众服务</a></li>
          <li id="nav06"><a href="/nw2/nw2314/nw2318/index.html" class="no-margin-right">走进上海</a></li>
        </ul>
        </div>
      </div>
    </div>
  </div>
  <nav id="myNavmenu" class="navmenu navmenu-default navmenu-fixed-right offcanvas" role="navigation">
  <ul class="nav navmenu-nav">
    <li><a href="/">首页</a></li>
    <li id="nav01"><a href="/nw2/nw2314/nw2315/index.html">要闻动态</a></li>
    <li id="nav02"><a href="/nw2/nw2314/nw2319/index.html">政府信息公开</a></li>
    <li id="nav03"><a href="http://zwdt.sh.gov.cn/zwdt/">网上政务大厅</a></li>
    <li id="nav04"><a href="/nw2/nw2314/nw38605/index.html">政民互动</a></li>
    <li id="nav05"><a href="/nw2/nw2314/nw2315/nw17239/index.html">公众服务</a></li>
    <li id="nav06"><a href="/nw2/nw2314/nw2318/index.html">走进上海</a></li>
  </ul>
  </nav>
   <div  class="row-fluid ChiefHall">
      <div class="container">
      

                <div class="control-group">
            
              
<script type="text/javascript" src="/newshanghai/js/autocomplete/jquery-ui-1.8.13.custom.min.js"></script>
<link href="/newshanghai/js/autocomplete/jquery-ui-1.8.13.custom.css" rel="stylesheet" type="text/css">
<form class="form-horizontal margin-bottom5" accept-charset="utf-8" method="post" action="http://zwdt.sh.gov.cn/zwdtSW/search/pre.do"
         			id="entireform" name="entireform"  target="_blank"  onsubmit="document.charset='utf-8'">

<label class="control-label" style="display:none">网上政务大厅</label>
            <div class="controls1" >
            
<div class="zwdt-search">
</div>
	        </div>
</form>
              <script>
$(".control-label").attr("style","");

</script>
                     </div>
                      
        
      </div>
    </div>
  <div >
<script>
$("li[id='nav02']").attr("class","active");
</script>
		<div class="container">
			<div class="row-fluid">
				<div class="span8 no-margin-left">
					<div class="page-header-1">
						<h4><a title="${yjmlData.yjmlmc }">${yjmlData.yjmlmc }</a></h4>
					</div>
                                 
    <div class="well" style="padding:15px;">
	<ul class="coleft iconli triangleIcon triangleIcon-2 no-margin">
		<c:forEach items="${menu2List }" var="menu2">
			<li><a class="btn-line"  href="/busi/docindex.do?yjml=${menu2.yjmlmc }&ejml=${menu2.id }"  title="${menu2.ejmlmc }">${menu2.ejmlmc }</a></li>
		</c:forEach>
<!-- 		<li><a  class="btn-line" href="/nw2/nw2314/nw2319/nw11494/nw12328/index.html" title="市政府及其工作机构的领导名单">市政府及其工作机构的领导名单</a></li> -->
<!-- 		<li><a class="btn-line"  href="/nw2/nw2314/nw2319/nw2405/index.html"  title="市政府工作机构及其主要职责">市政府工作机构及其主要职责</a></li> -->
<!-- 		<li><a  class="btn-line" href="/nw2/nw2314/nw2319/nw11494/nw18958/index.html" title="市长、副市长工作分工"><span style="color:#F00">市长、副市长工作分工</span></a></li> -->
<!-- 		<li><a  class="btn-line" href="/nw2/nw2314/nw2319/nw11494/nw18959/index.html" title="市政府秘书长、副秘书长工作分工">市政府秘书长、副秘书长工作分工</a></li> -->
<!-- 		<li><a  class="btn-line" href="/nw2/nw2314/nw2319/nw11494/nw12654/index.html" title="市政府规章">市政府规章</a></li> -->
<!-- 		<li><a  class="btn-line" href="/nw2/nw2314/nw2319/nw11494/nw12331/index.html" title="市政府工作规则及其它规范性文件">市政府工作规则及其它规范性文件</a></li> -->
<!-- 		<li><a  class="btn-line" href="/nw2/nw2314/nw2319/nw11494/nw12661/index.html" title="市政府重点工作">市政府重点工作</a></li> -->
<!-- 		<li><a  class="btn-line" href="/nw2/nw2314/nw2319/nw11494/nw12330/index.html" title="市政府提交市人大及其常委会审议的各类报告">市政府提交市人大及其常委会审议的各类报告</a></li> -->
<!-- 		<li><a class="btn-line"  href="/nw2/nw2314/nw2319/nw11494/nw12333/index.html"  title="市政府重要会议的主要内容"> 市政府重要会议的主要内容</a></li> -->
<!-- 		<li><a  class="btn-line" href="/nw2/nw2314/nw2319/nw11494/nw12335/index.html" title="关于本市经济和社会发展的主要数据">关于本市经济和社会发展的主要数据</a></li> -->
<!-- 		<li><a class="btn-line"  href="/nw2/nw2314/nw2319/nw11498/index.html"  title="市政府实事项目"> 市政府实事项目</a></li> -->
<!-- 		<li><a class="btn-line"  href="/nw2/nw2314/nw2319/nw11494/nw12664/index.html"  title="市政府人事任免"> 市政府人事任免</a></li> -->
<!-- 	    <li class="col50"><a class="btn-line  no-margin"   target="_blank" href="/nw2/nw2314/nw2319/nw10800/index.html"  title="市政府文件"> 市政府文件</a></li> -->
<!-- 		<li class="col50"><a class="btn-line  no-margin"   target="_blank" href="/nw2/nw2314/nw2319/nw22396/nw22401/index.html"  title="规划计划"> 规划计划</a></li> -->
<!-- 		<li class="col50"><a class="btn-line  no-margin"   target="_blank" href="/nw2/nw2314/nw2319/nw18462/index.html"  title="统计数据"> 统计数据</a></li> -->
<!-- 		<li class="col50"><a class="btn-line  no-margin"   target="_blank" href="/nw2/nw2314/nw2319/nw10908/nw12622/index.html"  title="信访接待"> 信访接待</a></li> -->
<!-- 		<li class="col50"><a class="btn-line  no-margin"   target="_blank" href="/nw2/nw2314/nw2319/nw38628/index.html"  title="公共权力"> 公共权力</a></li> -->
<!-- 		<li class="col50"><a class="btn-line  no-margin"   target="_blank" href="/nw2/nw2314/nw2319/nw38625/index.html"  title="公共资金"> 公共资金</a></li>	 -->
<!-- 		<li class="col50"><a class="btn-line  no-margin"   target="_blank" href="/nw2/nw2314/nw2319/nw22409/index.html"  title="重点领域"> 重点领域</a></li>	 -->
<!-- 		<li class="col50"><a class="btn-line  no-margin"   target="_blank" href="/nw2/nw2314/nw11175/index.html"  title="市人大代表建议和提案办理"> 市人大代表建议和政协提案办理</a></li>	 -->
<!-- 		<li class="col50"><a class="btn-line  no-margin"    target="_blank" href="/nw2/nw2314/nw2319/nw41893/index.html"  title="政策解读"> 政策解读</a></li>																			 -->
	</ul>
	</div>		               
	

	<div class="row-fluid">
		<div class="span8 no-margin-left">
			<div class="page-header-1">
				<c:if test="${empty ejmlData.ejmlmc }">
					<h4><a title="文件列表">文件列表</a></h4>
				</c:if>
				<c:if test="${not empty ejmlData.ejmlmc }">
					<h4><a title="${ejmlData.ejmlmc }">${ejmlData.ejmlmc }</a></h4>
				</c:if>
			</div>
			<ul class="uli14 pageList">
				<c:forEach items="${docList }" var="doc">
					<li>
						<a  class="btn-line" href="/wg/docid/${doc.id }" target="_blank" title="${doc.zwbt }">
							${doc.zwbt }
						</a>
					</li>
				</c:forEach>
<!-- 				<li><a  class="btn-line" href="/nw2/nw2314/nw2319/nw22421/u26aw52126.html" target="_blank" title="市政府办公厅关于印发2017年上海市政务公开工作要点的通知"> -->
<!-- 						市政府办公厅关于印发2017年上海市政务公开工作要点的通知</a> -->
<!-- 				</li> -->
<!-- 				<li><a  class="btn-line" href="/nw2/nw2314/nw2319/nw22421/u26aw47538.html" target="_blank" title="市政府办公厅关于印发2016年上海市政务公开工作要点的通知"> -->
<!-- 						市政府办公厅关于印发2016年上海市政务公开工作要点的通知</a> -->
<!-- 				</li> -->
			</ul>
		</div>
	</div>
					

	
				</div>
				<div class="span4">
					<ul class="nav nav-list arrowNav margin-bottom20">
							<script>
							
							</script>
							<c:forEach items="${menu1List }" var="menu">
							<li onclick=""><a href="/busi/docindex.do?yjml=${menu.id }" title="${menu.yjmlmc }" ><span>${menu.yjmlmc }</span></a></li>
							</c:forEach>
<!-- 						<li id="fg" onclick="changeColor('fg')"><a href="/nw2/nw2314/nw2319/nw11494/nw18958/index.html" title="市政府领导分工" ><span>市政府领导分工</span></a></li> -->
<!-- 						<li id="xw" onclick="changeColor('xw')"><a href="/nw2/nw2314/nw9819/index.html" title="市政府新闻发布" target="_blank"><span>市政府新闻发布</span></a></li> -->
<!-- 						<li id="gg" onclick="changeColor('gg')"><a href="/nw2/nw2314/nw2319/nw2404/index.html" title="市政府公报" ><span>市政府公报</span></a></li> -->
<!-- 						<li id="wj" onclick="changeColor('wj')"><a href="/nw2/nw2314/nw2319/nw41149/index.html" title="行政规范性文件" ><span>行政规范性文件</span></a></li> -->
<!-- 						<li id="zd" onclick="changeColor('zd')"><a href="/nw2/nw2314/nw2319/nw22421/index.html" title="政府信息公开依据"  ><span>政府信息公开依据</span></a></li> -->
<!-- 						<li id="zn" onclick="changeColor('zn')"><a href="/nw2/nw2314/nw2319/nw11495/index.html" title="政府信息公开指南"  ><span>政府信息公开指南</span></a></li> -->
<!-- 						<li id="ml" onclick="changeColor('ml')"><a href="/nw2/nw2314/nw2319/nw11494/index.html" title="政府信息公开目录"  ><span>政府信息公开目录</span></a></li> -->
<!-- 						<li id="nb" onclick="changeColor('nb')"><a href="/nw2/nw2314/nw2319/nw14868/index.html" title="政府信息公开年报" ><span>政府信息公开年报</span></a></li> -->
<!-- 						<li id="yjx" onclick="changeColor('yjx')"><a href="/nw2/nw2314/nw2319/nw39186/nw39188/index.html" title="市政府信息公开监督保障" ><span>市政府信息公开监督保障</span></a></li> -->
<!-- 						<li id="qx" onclick="changeColor('qx')"><a href="/nw2/nw2314/nw2319/nw38674/index.html" title="市政府部门与区政府信息公开" ><span>市政府部门与区政府信息公开</span></a></li> -->
<!-- 						<li class="margin-top10"><a href="http://xxgk.sh.gov.cn/infoopen/open/portal_index.jsp" class="red text-center no-margin-bottom" title="依申请公开"><span>依申请公开</span></a></li> -->
					</ul>
					<div class="page-header-1">
							<h4><a  title="工作机构">工作机构</a></h4>
						</div>
						<ul class="uli14 pageList no-margin">
						<li>部门名称：上海市人民政府办公厅<p class="no-margin-bottom" style="text-indent:5em;">政务公开办公室</li>
						<li>联系地址：人民大道200号</li>
						<li>邮政编码：200003</li>
						<li>咨询电话：021-63582606</li>
						<li>电子邮箱：xxgkyjx@shanghai.gov.cn</li>
							</ul>
				</div>
			
				</div>
			</div>
		</div>
	</div>
	
</div>

<style>
#_span_jiucuo img{
height:44px;
}
</style>
<div id="footer" class="row-fluid margin-top10" >
  <div class="container">
    <div class="footlogo"> 
    <script>
if(location.hostname == "big5.shanghai.gov.cn"){

    document.write("<img src=\"http://www.shanghai.gov.cn//newshanghai/img/big5/color-logo-hd.png\" alt=\"\">");
        }else
{
       document.write("<img src=\"http://www.shanghai.gov.cn//newshanghai/img/color-logo-hd.png\" alt=\"\">");
        }
</script>

    
    
      <h4>上海市人民政府<br/>
        <small>地址：人民大道200号　邮政编码：200003　电话：23111111</small></h4>
    </div>
    <div class="pull-right sign"> 
  
 <script>
if(location.hostname == "big5.shanghai.gov.cn"){

    document.write("<a href=\"ht"+"tp://bszs.conac.cn/sitename?method=show&id=08E61FB166710F06E053012819AC1E62\" alt=\"*\" target=\"_blank\" title=\"党政机关\"  ><img src=\"http://www.shanghai.gov.cn//newshanghai/img/copyright/red.png\" ></a>");
    }else
{
        document.write("<a href=\"http://bszs.conac.cn/sitename?method=show&id=08E61FB166710F06E053012819AC1E62\" alt=\"*\" target=\"_blank\" title=\"党政机关\"  ><img src=\"http://www.shanghai.gov.cn//newshanghai/img/copyright/red.png\" ></a>");
        }
</script>

 
<script id="_jiucuo_" sitecode='3100000044' src='http://pucha.kaipuyun.cn/exposure/jiucuo.js'></script>
    
  
   
       <script>
if(location.hostname == "big5.shanghai.gov.cn"){

    document.write("<a href=\"ht"+"tp://net.china.com.cn/index.htm\" alt=\"*\" target=\"_blank\" title=\"上海市互联网举报平台\"  class=\"\"><img src=\"http://www.shanghai.gov.cn//newshanghai/img/big5/footIcon06.png\" alt=\"*\" ></a>");
    }else
{
        document.write("<a href=\"http://net.china.com.cn/index.htm\" alt=\"*\" target=\"_blank\" title=\"上海市互联网举报平台\"  class=\"\"><img src=\"http://www.shanghai.gov.cn//newshanghai/img/copyright/footIcon06.png\" alt=\"*\" ></a>");
        }
</script>
    
       <script>
if(location.hostname == "big5.shanghai.gov.cn"){

    document.write("<a href=\"ht"+"tp://www.miibeian.gov.cn\" alt=\"*\" target=\"_blank\" title=\"沪ICP备12004267\"  class=\"\"><img src=\"http://www.shanghai.gov.cn//newshanghai/img/big5/foot.jpg\" alt=\"*\" ></a>");
    }else
{
        document.write("<a href=\"http://www.miibeian.gov.cn\" alt=\"*\" target=\"_blank\" title=\"沪ICP备12004267\"  class=\"\"><img src=\"http://www.shanghai.gov.cn//newshanghai/img/copyright/foot.jpg\" alt=\"*\" ></a>");
        }
</script>
 
  </div>
</div>

<!--Main JS--> 

<!-- <script type="text/javascript" src="/newshanghai/js/jquery-1.7.2.min.js"></script> --> 
<script type="text/javascript" src="/newshanghai/js/ETUI.min.js"></script> 
<!--[if lte IE 6]>
<script type="text/javascript" src="/newshanghai/js/ETUI-ie.js"></script>
<script type="text/javascript" src="/newshanghai/js/DD_belatedPNG-min.js"></script>
<![endif]--> 
<a id="hash" data-toggle="modal" tabindex="-1"  href="#myModal"></a>
<div id="myModal"  class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-header no-border">
    <button type="button" id="closets" class="close" data-dismiss="modal" aria-hidden="true">×</button>
  </div>
  <div class="modal-body text-center margin-top30 margin-bottom20">
    <p class="f18">您访问的链接即将离开“中国上海”门户网站 是否继续？</p>
	<p id="outurl" style="display:none"></p>
  </div>
  <div class="modal-footer">
    <button class="btn" data-dismiss="modal" aria-hidden="true">放弃</button>
    <button class="btn btn-danger" onclick="window.open(outurl.innerText);document.getElementById('closets').click();">继续访问</button>
  </div>
</div>

<script type="text/javascript">

    function showmore(id,objtype,pagesize){
    $('#pageList').prop('outerHTML', '<iframe src="http://service.shanghai.gov.cn/pagemore/iframePagerIndex_'+id+'_'+objtype+'_'+pagesize+'.html?page=11"  id="frame_content" name="frame_content" width="100%" height="346px" scrolling="no" frameborder="0" title=""></iframe>');
    }

</script>

</body>
</html>
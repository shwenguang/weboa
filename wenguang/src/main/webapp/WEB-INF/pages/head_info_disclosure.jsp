<!-- 近期信息公开 简要页面，供文广局政府信息公开页面调用 -using-->
<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="zh_CN" lang="zh_CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>上海市文化广播影视管理局 上海市文物局</title>
<link rel="stylesheet" type="text/css" href="/static/css/public.css" />
<link rel="stylesheet" type="text/css" href="/static/css/mainFrame.css" />
<link rel="stylesheet" type="text/css" href="/static/css/modules.css" />
<link rel="stylesheet" type="text/css" href="/static/css/style_zfxxgk2.css" />
</head>
<body>
 	<div id="maincontent">
       <div id="box_jjxxgk">
         <a href="/entrance/info_disclosure.do" target="_parent" title="近期信息公开"><h3 class="pubh3_3">近期信息公开</h3></a>
         <ul class="publist1">
			<li>
				<a target="__blank" href="/busi/docshow.do?docid=${docList[0].id }&ejml=${docList[0].xxgkejml}&yjml=${docList[0].xxgkyjml}">${docList[0].zwbt }</a>
				<span class="pubtime">${docList[0].yfrq}</span>
			</li>
			<li>
				<a target="__blank" href="/busi/docshow.do?docid=${docList[1].id }&ejml=${docList[1].xxgkejml}&yjml=${docList[1].xxgkyjml}">${docList[1].zwbt }</a>
				<span class="pubtime">${docList[1].yfrq}</span>
			</li>
			<li>
				<a target="__blank" href="/busi/docshow.do?docid=${docList[2].id }&ejml=${docList[2].xxgkejml}&yjml=${docList[2].xxgkyjml}">${docList[2].zwbt }</a>
				<span class="pubtime">${docList[2].yfrq}</span>
			</li>
		</ul>
         </div>
  </div>
</body>
</html>
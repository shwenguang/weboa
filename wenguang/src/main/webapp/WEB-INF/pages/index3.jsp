<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh_CN" lang="zh_CN" xml:lang="zh_CN" xmlns="http://www.w3.org/1999/xhtml"><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上海市文化广播影视管理局 上海市文物局</title>
<link href="/static/css/public.css" rel="stylesheet" type="text/css">
<link href="/static/css/xxgk_gkjs.css" rel="stylesheet" type="text/css">
<script src="/static/js/formValue.js" type="text/javascript"></script>
<script src="/static/js/laydate.js" type="text/javascript"></script>
<link href="http://wgj.sh.gov.cn/images/wg2015/laydate/need/laydate.css" rel="stylesheet" type="text/css">
<link id="LayDateSkin" href="http://wgj.sh.gov.cn/images/wg2015/laydate/skins/default/laydate.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
function getName(){
var keyword=document.getElementById("keyword").value;
var infoname=document.getElementById("infoname").value;
if(infoname!=""&&infoname!="信息名称"){
 document.getElementById("infoname").name = "q";
}
else if(keyword!=""&&keyword!="关键字"){
 document.getElementById("keyword").name = "q";
}
}

</script>
</head>

<body>
<form id="gkjsForm" action="http://searchgov1.eastday.com/searchwgj_new/search" method="post" target="_blank">
    <h2>信息公开检索</h2>
    <div class="formRow">
        <label>日期</label>
        <input name="st" title="开始时间" class="inputClass1" id="bsdtime2" onfocus="formValue.cd(this)" onblur="formValue.rd(this)" type="text" value="2007-01-01">
        <label>至</label>
        <input name="et" title="结束时间" class="inputClass1" id="bedtime2" onfocus="formValue.cd(this)" onblur="formValue.rd(this)" type="text" value="2015-05-01">
        <script type="text/javascript">
        function GetCurrentDateTime() {
    var d = new Date();
    var year = d.getFullYear();
    var month = d.getMonth() + 1;
    var date = d.getDate();
    var week = d.getDay();
    var hours = d.getHours();
    var minutes = d.getMinutes();
    var seconds = d.getSeconds();
    var ms = d.getMilliseconds();
    var curDateTime = year;
    if (month > 9)
        curDateTime = curDateTime + "-" + month;
    else
        curDateTime = curDateTime + "-0" + month;
    if (date > 9)
        curDateTime = curDateTime + "-" + date ;
    else
        curDateTime = curDateTime + "-0" + date ;
    curDateTime = curDateTime ;
    return curDateTime;
}

document.getElementById("bedtime2").value=GetCurrentDateTime();

</script>
    </div>
    <div class="formRow">
        <label class="labelClass1">索取号</label>
        <input name="m1" title="索取号" class="inputClass2" onfocus="formValue.cd(this)" onblur="formValue.rd(this)" type="text">
        <label class="labelClass2">发布机构</label>
        <input name="m4" title="发布机构" class="inputClass3" onfocus="formValue.cd(this)" onblur="formValue.rd(this)" type="text">
    </div>
    <div class="formRow">
        <label class="labelClass2">信息名称</label>
        <input title="信息名称" class="inputClass4" id="infoname" onfocus="formValue.cd(this)" onblur="formValue.rd(this)" type="text">
        <label class="labelClass2">文件编号</label>
        <input name="m3" title="文件编号" class="inputClass3" onfocus="formValue.cd(this)" onblur="formValue.rd(this)" type="text">
    </div>
    <div class="formRow">
        <label class="labelClass3">公开类别</label>
        <select name="select1" class="form_e" id="select1" onchange="swapOptions(this.value);" select="">
                                          <option value="类别" selected="">公开类别</option>
                                          <option value="政策法规">政策法规</option>
                                          <option value="文广业务">文广业务</option>
                                          <option value="计划规划与研究">计划规划与研究</option>
                                          <option value="机构职能">机构职能</option>
                                        </select>
        
    </div>
    <script language="javascript">
function swapOptions(the_array_name)
{
    var oOptions;
    oOptions = window.document.form1.select2.options;
    while (oOptions.length > 0) {
        oOptions.remove(0);
    }
    
    if (the_array_name == '文广业务') {
        oOptions.add(new Option("类别", "类别"));
        oOptions.add(new Option("娱乐市场", "娱乐市场"));
        oOptions.add(new Option("演出市场", "演出市场"));
        oOptions.add(new Option("音像市场", "音像市场"));
        oOptions.add(new Option("互联网上网服务", "互联网上网服务"));
        oOptions.add(new Option("美术展览", "美术展览"));
        oOptions.add(new Option("群众文化", "群众文化"));
        oOptions.add(new Option("广播影视卫星", "广播影视卫星"));
        oOptions.add(new Option("网络信息", "网络信息"));    
} else if (the_array_name == '计划规划与研究') {
        oOptions.add(new Option("类别", "类别"));
        oOptions.add(new Option("规划计划", "规划计划"));
        oOptions.add(new Option("调研报告", "调研报告"));    
    }
    if (the_array_name == '政策法规') {
        oOptions.add(new Option("类别", "类别"));
        oOptions.add(new Option("国务院行政法规", "国务院行政法规"));
        oOptions.add(new Option("国务院部门规章", "国务院部门规章"));
        oOptions.add(new Option("国务院部门规章性文件", "国务院部门规章性文件"));
        oOptions.add(new Option("上海市地方法规", "上海市地方法规"));
        oOptions.add(new Option("上海市政府规章", "上海市政府规章"));
        oOptions.add(new Option("规范性文件", "规范性文件"));    
    }else if (the_array_name == '机构职能') {
        oOptions.add(new Option("类别", "类别"));
        oOptions.add(new Option("机构概况", "机构概况"));
        oOptions.add(new Option("机构领导", "机构领导"));
        oOptions.add(new Option("机构设置", "机构设置"));    
    }
 if (the_array_name == '类别') {
        oOptions.add(new Option("类别", ""));
    }   
    
    return;
}
function input_onkeydown() {
var srcElement = window.event.srcElement; 
if(srcElement.tagName=="INPUT"||srcElement.tagName=="SELECT"){ 
window.event.keyCode ==13;
}
}
                        </script>
    <div class="formRow">
        <label class="labelClass2">关键词</label>
        <input title="关键词" class="inputClass5" id="keyword" onfocus="formValue.cd(this)" onblur="formValue.rd(this)" type="text">
    </div>
    <div class="clear"></div>
    <input title="查询" id="submitButton" type="submit" value="查询">
</form>

</body></html>
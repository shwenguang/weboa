<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><script language="JavaScript">
function button_focus(button_name){
	var obj = eval("document.all." + button_name);
	obj.className = "button_focus";
	
}
function button_blur(button_name){
	var obj = eval("document.all." + button_name);
	obj.className = "button_blur";
}

</script>
<script type="text/javascript"  src="/static/js/jquery-1.8.2.js"></script>
<title>申请公开</title>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<link href="http:\\211.144.122.242\WeGovPlatform\style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="http:\\211.144.122.242\WeGovPlatform\script\gongyong.js"></script>
<script language="JavaScript" src="http:\\211.144.122.242\WeGovPlatform\script\validate.js"></script>
<script language="JavaScript" src="http:\\211.144.122.242\WeGovPlatform\script\app.js"></script>
<script language="javascript" src="http://211.144.122.242/infoopen/script/calendar.js"></script>
<script language="javascript" src="http://211.144.122.242/infoopen/script/check.js"></script>
<script language="javascript" src="http://211.144.122.242/infoopen/script/communal.js"></script>
<script language="javascript" src="http://211.144.122.242/infoopen/script/ysqgk.js"></script>
<style>
<!--
body {font-size:12px;font-family: "宋体";
scrollbar-face-color:#FFFFFF;
scrollbar-highlight-color:#FFFFFF;
scrollbar-3dlight-color:#C0C0C0;
scrollbar-darkshadow-color:#C0C0C0;
scrollbar-shadow-color:#C0C0C0;
scrollbar-arrow-color:#575757;
scrollbar-track-color:#FFFFFF;}

.text1 { border:1px solid #CCC;  }
.text2 {  border-color: black black #000000; border-top-width: 0px; border-right-width: 0px; border-bottom-width: 0px; border-left-width: 0px;font-family: "??ì?"}
.border1 {  border-color: black #000000 black black; border-top-width: 0px; border-right-width: 1px; border-bottom-width: 0px; border-left-width: 0px}
.border2 {  border-top-width: 0px; border-right-width: 0px; border-bottom-width: 0px; border-left-width: 0px}
.border3 {  border-color: black #000000; border-top-width: 0px; border-right-width: 1px; border-bottom-width: 0px; border-left-width: 1px}
.border4 {  border-top-width: 0px; border-right-width: 0px; border-bottom-width: 0px; border-left-width: 0px}
.table_xxzx { border-collapse:collapse;}
.table_xxzx td { height:14px; line-height:14px; padding:5px 1px;border:1px solid #999;font-size:12px; }
.table_red {background:#ffeeee; border:1px solid #e70000;font-size:12px;}
.table_blue {background:#e8f2f8; border:1px solid #7bade0;font-size:12px;}
.table_hui {background:#f8f8f8;font-size:12px;}
.table_fff {background:#fff;font-size:12px;}
.btn_s {
	BORDER-BOTTOM: #fee6b6 1px solid; TEXT-ALIGN: center; BORDER-LEFT: #fee6b6 1px solid; LINE-HEIGHT: 23px; WIDTH: 52px; DISPLAY: inline; BACKGROUND: url(../images/bj_03.jpg) repeat-x; FLOAT: left; HEIGHT: 23px; COLOR: #c80000; MARGIN-LEFT: 80px; CLEAR: both; BORDER-TOP: #fee6b6 1px solid; FONT-WEIGHT: bold; BORDER-RIGHT: #fee6b6 1px solid
}
-->
</style>
</head>
<body>
<table width="100%" height="100%" id="doing_alert" style="z-index:2;position:absolute;display:none;">
<tbody><tr><td></td></tr>
<tr><td width="30%"></td>
	<td width="40%" height="45" align="center" bgcolor="#ccccff">程序执行中，请稍候......</td>
	<td width="30%"></td></tr>
<tr><td></td></tr>
</tbody></table>
<script language="JavaScript">
function doing(){
	window.doing_alert.style.display='block';
}
function undoing(){
	window.doing_alert.style.display='none';
}

</script>




<form name="form1" action="open_login_add1.jsp" method="post">

  <table width="600" align="center" border="0" cellspacing="0" cellpadding="0">
<!--
    <tr>
      <td align="center" height="40" valign="top" style="line-height:40px; font-size:12px;">信息公开申请表</td>
    </tr>
 <TR>          
 	<TD align=middle><FONT  color=#e70000>＊</FONT>&nbsp;为必填项&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A class=text-1    href="http://www.sh.gov.cn/js/zfxxgksqb.doc">（点击下载表格）</A>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A             class=text-1             href="http://www.sh.gov.cn/shanghai/node2314/node12713/userobject21ai50737.html">（点击查看上海市人民政府办公厅依申请公开政府信息工作流程图）</A></TD></TR>
 -->
 <tbody><tr>
<td align="center" valign="bottom">

<font face="宋体" size="2">注：公民、法人选择其一填写即可；<font color="#e70000">*</font>&nbsp;为必填项。</font>
<table id="input_table" width="600" class="table_xxzx" style="border:1px solid #e70000;" border="0" cellspacing="0" cellpadding="0">
  <tbody><tr></tr>
        <tr align="center">
   
    <td width="4%" class="table_red" rowspan="11">申<br>请<br>人<br>信<br>息</td>
    <td width="18%" class="table_fff" rowspan="5">公民</td>
    <td width="12%" align="center" class="table_hui"><font color="#e70000">*</font>姓名</td>
    <td width="28%" align="left" class="table_fff"><input name="indv_name" class="text1" type="text" maxlength="100" value=""></td>
    <td width="11%" align="center" class="table_hui"><font color="#e70000">*</font>工作单位</td>
    <td width="27%" align="left" class="table_fff"><input name="indv_company" class="text1" type="text" maxlength="100" value=""></td>
  </tr>
  <tr> 
    <td align="center" class="table_hui"><font color="#e70000">*</font>证件名称</td>
    <td class="table_fff"><input name="indv_cert_type" class="text1" type="text" maxlength="18" value=""></td>
    <td align="center" class="table_hui"><font color="#e70000">*</font>证件号码</td>
    <td class="table_fff"><input name="indv_cert_num" class="text1" type="text" maxlength="18" value=""></td>
  </tr>
  <tr> 
    <td align="center" class="table_hui"><font color="#e70000">*</font>联系电话</td>
    <td class="table_fff"><input name="indv_link_number" class="text1" type="text" maxlength="100" value=""></td>
    <td align="center" class="table_hui"><font color="#e70000">*</font>邮政编码</td>
    <td class="table_fff"><input name="indv_post_code" class="text1" type="text" maxlength="6" value=""></td>
  </tr>
  <tr> 
    <td align="center" class="table_hui"><font color="#e70000">*</font>联系地址</td>
    <td class="table_fff" colspan="3"><input name="indv_address" class="text1" type="text" maxlength="200" value=""></td>
  </tr>
  <tr> 
    <td align="center" class="table_hui">电子邮箱</td>
    <td class="table_fff" colspan="3"><input name="indv_email" class="text1" type="text" maxlength="200" value=""></td>
  </tr>
  <tr> 
    <td align="center" class="table_fff" rowspan="5">法人/其它组织</td>
    <td align="center" class="table_hui"><font color="#e70000">*</font>名称</td>
    <td class="table_fff"><input name="org_name" class="text1" type="text" maxlength="100" value=""></td>
    <td align="center" class="table_hui"><font color="#e70000">*</font>组织机构代码</td>
    <td class="table_fff"><input name="org_code" class="text1" type="text" maxlength="100" value=""></td>
  </tr>
  <tr> 
    <td align="center" class="table_hui"><font color="#e70000">*</font>法人代表</td>
    <td class="table_fff"><input name="org_legal_person" class="text1" type="text" maxlength="100" value=""></td>
    <td align="center" class="table_hui"><font color="#e70000">*</font>联系人<br>姓名</td>
    <td class="table_fff"><input name="org_link_man" class="text1" type="text" maxlength="100" value=""></td>
  </tr>
  <tr> 
    <td align="center" class="table_hui"><font color="#e70000">*</font>联系人电话</td>
    <td class="table_fff"><input name="org_link_number" class="text1" type="text" maxlength="100" value=""></td>
    <td align="center" class="table_hui"><font color="#e70000">*</font>邮政编码</td>
    <td class="table_fff"><input name="org_post_code" class="text1" type="text" maxlength="6" value=""></td>
  </tr>
  <tr> 
    <td align="center" class="table_hui"><font color="#e70000">*</font>联系地址</td>
    <td class="table_fff" colspan="3"><input name="org_address" class="text1" type="text" size="30" maxlength="200" value=""></td>
  </tr>
  <tr> 
    <td align="center" class="table_hui">电子邮箱</td>
    <td class="table_fff" colspan="3"><input name="org_email" class="text1" type="text" size="30" maxlength="200" value=""></td>
  </tr>
  <tr> 
    <td align="center" class="table_hui" colspan="1">申请时间</td>
    <td class="table_fff" colspan="4"><input name="apply_date" class="text1" type="text" readonly="" value="${today }">
  </td></tr>
  <tr> 
    <td width="4%" height="150" align="center" class="table_red" rowspan="7">所<br>需<br>信<br>息<br>情<br>况</td>
    <td width="18%" height="45" align="center" class="table_hui" rowspan="1">政府信息公开<br>义务机关(机构)<br>名称</td>
    <td class="table_fff" colspan="8"><input name="info_of_gov" align="left" class="text1" type="text" size="30" readonly="" value="上海市文化广播影视管理局(上海市文广局)"></td>
  </tr>
  <tr>
    <td width="18%" height="*" align="center" class="table_hui" rowspan="1"><font color="#e70000">*</font>所需信息的<br>内容描述<br>（名称、文号或<br>其他特征描述）</td>
    <td class="table_fff" colspan="5">
	<textarea name="info_descriptor" class="text1" rows="4" cols="40"></textarea>
	</td>
  </tr>
  <tr>
    	<td width="18%" align="center" class="table_hui" rowspan="1" hight="*">获取政府信息的<br>方式</td>
  	<td align="left" class="table_fff" colspan="4">
  	<input name="get_info_way" style="border:none;" type="radio" value="邮寄">邮寄
  	<input name="get_info_way" style="border:none;" type="radio" value="传真">传真
  	<input name="get_info_way" style="border:none;" type="radio" value="递送">递送
  	<input name="get_info_way" style="border:none;" type="radio" value="当面领取">当面领取
  	<input name="get_info_way" style="border:none;" type="radio" value="现场查阅">现场查阅
  	<input name="get_info_way" style="border:none;" type="radio" value="电子邮件">电子邮件
  	
  	</td>
  </tr>
   <tr> 
    <td width="18%" height="*" align="center" class="table_hui" rowspan="1">政府信息的<br>载体形式</td>
    <td align="left" class="table_fff" colspan="4">
   	<input name="get_info_media" style="border:none;" type="radio" value="纸质文本">纸质文本
  	<input name="get_info_media" style="border:none;" type="radio" value="光盘">光盘
  	
  	<input name="get_info_media" style="border:none;" type="radio" value="磁盘">磁盘
  	
    </td> 
  </tr>
  <tr> 
    <td width="18%" height="*" align="center" class="table_hui" rowspan="2">所需政府信息的<br>用途</td>
    <td class="table_fff" colspan="4">
    类型：<br>
    <input name="info_usage" style="border:none;" type="checkbox" value="自身生产的需要">自身生产的需要
  	<input name="info_usage" style="border:none;" type="checkbox" value="自身生活的需要">自身生活的需要<br>
  	<input name="info_usage" style="border:none;" type="checkbox" value="自身科研的需要">自身科研的需要
  	<input name="info_usage" style="border:none;" type="checkbox" value="查验自身信息">查验自身信息
    </td>
  </tr>
  <tr>
  	<td align="left" class="table_fff" colspan="4">
  		<textarea name="info_usage_remark" class="text1" rows="4" cols="40"></textarea>
  	</td>
  </tr>
  <tr>
  <td width="18%" height="*" align="center" class="table_hui" rowspan="1">需要减免费用</td>
  	<td align="left" class="table_fff" colspan="4">
  		需申请免除收费,主要理由：<br>
  		<input name="derate_expenses_reason" style="border:none;" type="checkbox" value="属于农村五保供养对象">属于农村五保供养对象<br>
  		<input name="derate_expenses_reason" style="border:none;" type="checkbox" value="属于城乡居民最低生活保障对象">属于城乡居民最低生活保障对象<br>
  		<input name="derate_expenses_reason" style="border:none;" type="checkbox" value="属于领取国家抚恤补助的优抚对象">属于领取国家抚恤补助的优抚对象<br>
  		<input name="derate_expenses_reason" style="border:none;" type="checkbox" value="确有其他经济困难的">确有其他经济困难的<br>
  	</td>
  </tr>
  
 </tbody></table></td>
    </tr>
    <tr>
      <td height="30" align="center" valign="middle">
      
	<table align="center" cellspacing="10">
          <tbody><tr align="center">

          	<td>

<a onmouseover="button_focus('bt_submit');" onmouseout="button_blur('bt_submit');" onclick="add(this);" onfocus="button_focus('bt_submit');" onblur="button_blur('bt_submit');" href="JavaScript:void(0);">
<table width="52" class="button_blur" id="bt_submit" style="cursor:hand;" border="1" cellspacing="1" cellpadding="0">
<tbody><tr align="center"><td style="font-size:9pt;padding-top:2;" bordercolor="White">提 交</td></tr>
</tbody></table>
</a>
</td>
          </tr>
	</tbody></table>
      </td>
    </tr>
  </tbody></table>
 <input name="op" type="hidden" value="">
  <input name="stOrgInfoId" type="hidden" value="INFOOPEN_UNITCODE_0042">
  <input name="style" type="hidden" value="">
  <input name="fromUrl" type="hidden" value="">
</form>



<script language="javascript">
//判断页面输入是否有效
function winClose(){
	window.close();
}
function saveValue(){
	if(check()){//&&confirm("确定要提交吗?")
		if(form1.applyContent.value.length>500)
			alert('所需信息的内容描述不可超过500字！');
		else if(form1.applyUse.value.length>300)
			alert('所需政府信息的用途不可超过300字！');
		else if(confirm("确定要提交吗?")){
			doing();
			form1.op.value="Save";
			allElementDisabled();
			this.form1.submit();
		}
	}
} 	
function add(b){
// 	if($(b).attr("had_submit")){
// 		alert("请勿重复提交")
// 		return;
// 	}
	//空字段校验
	var check = {};
	$(["indv_name","indv_company","indv_cert_type","indv_cert_num","indv_link_number","indv_post_code","indv_address"])
	.each(function(){
		var isempty = $("#input_table").find("[name="+this+"]").val()=='';
		if(isempty){
			check.indv_has_empty = true;
			return false;//中断each
		}
	})
	$("#input_table")
	.find("[name=org_name],[name=org_code],[name=org_legal_person],[name=org_link_man],[name=org_post_code],[name=org_address]")
	.each(function(){
		if($(this).val()==''){
			check.org_has_empty=true;
			return false;
		}
	})
	;
	if(check.indv_has_empty && check.org_has_empty){
		alert("公民信息和法人信息必须输入一个")
		return;
	}
	var data = {};
	$("#input_table").find("input,select").each(function(){
		if(!$(this).attr("name")){
			return;
		}
		if($(this).is("input[type=checkbox]")){
			if($(this).is(":checked")){
				if(data[$(this).attr("name")]){
					data[$(this).attr("name")] = data[$(this).attr("name")]+","+$(this).val()
				}else{
					data[$(this).attr("name")] = $(this).val()
				}
			}
		}else if($(this).is("input[type=radio]")){
			if($(this).is(":checked")){
				data[$(this).attr("name")] = $(this).val()
			}
		}else if($(this).is("input")){
			data[$(this).attr("name")] = $(this).val()
		}
	});
	console.log(data)
	$.ajax({
		url:"/info/disclosure/insert.do",
		data:data,
		success:function(r){
			if(r.result == "success"){
				$(b).attr("had_submit","true")
			}
			alert(r.message)
		},
		error:function(r){
			alert("系统异常，请稍后")
		}
	})
}

function reset(){
	$("#input_table").find("input,select,textarea")
	.not(':button, :submit, :reset, :hidden')
	.val('')
	.removeAttr('checked') 
	.removeAttr('selected');
}
if(window.opener!=null && window.opener.submitForm!=null && window.opener.submitForm.applyContent!=null )   
	form1.applyContent.value = window.opener.submitForm.applyContent.value;
	
</script>

</body>
</html>
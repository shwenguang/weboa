<!-- 该页面用于呈现main.jsp页面的右侧搜索栏的搜索结果 -->
<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>文广</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link href="./css/css.css" rel="stylesheet" type="text/css" />
<link rel="StyleSheet" href="http://searchgov1.eastday.com/searchwgj_new//css/tree.css" type="text/css" />
<link rel="StyleSheet" href="http://searchgov1.eastday.com/searchwgj_new//css/search.css" type="text/css" />
</head>
<body background="http://searchgov1.eastday.com/searchwgj_new//images/pagebk.gif" leftmargin="0" topmargin="0">
	<center>
		<!-- 检索集合 Begin-->
		<table cellspacing="0" cellpadding="0" width="100%">
			<tr>
				<td valign="top" bgcolor="#ffffff"><table cellspacing="0"
						cellpadding="0" width="768">
						<tbody>
							<tr>
								<td bgcolor="#EAEAEA" height="2" colspan="3"></td>
							</tr>
							<tr class="12pixblack">
								<td><img src="http://searchgov1.eastday.com/searchwgj_new//images/js7.gif" /></td>
								<td><div id="info">共${totalRows }项，当前第${curPage }页/共${totalPage }页</div></td>
							</tr>
						</tbody>
					</table>
					<table cellspacing="0" cellpadding="0" width="100%"
						bgcolor="#EFEFEF">
						<tbody>
							<tr>
								<td height="33" width="106" class="12pixblack" align="right"><font
									color="#497E00"><b>索取号 </b></font>&nbsp;&nbsp;&nbsp;<font
									color="#ADAEAD">|</font></td>
								<td width="152" class="12pixblack" align="right"><font
									color="#497E00"><b>信息名称 </b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font
									color="#ADAEAD">|</font></td>
								<td width="188" class="12pixblack" align="right"><font
									color="#497E00"><b>内容描述 </b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font
									color="#ADAEAD">|</font></td>
								<td width="95" class="12pixblack" align="right"><font
									color="#497E00"><b>产生日期 </b></font>&nbsp;<font color="#ADAEAD">|</font></td>
								<td width="129" class="12pixblack" align="right"><font
									color="#497E00"><b>文件编号 </b></font>&nbsp;&nbsp;&nbsp;<font
									color="#ADAEAD">|</font></td>
								<td width="108" class="12pixblack" align="center"><font
									color="#497E00"><b>发布机构</b></font></td>
							</tr>
							<tr>
								<td height="1" colspan="6" bgcolor="#ffffff"></td>
							</tr>
							<tr>
								<td height="1" colspan="6" bgcolor="#D6D3D6"></td>
							</tr>
							<tr>
								<td height="3" colspan="6" bgcolor="#EFEBEF"></td>
							</tr>
						</tbody>
					</table>
					<table id="items" cellspacing="0" cellpadding="0" width="100%">
						<c:forEach items="${docList}" var="doc">
						<tr>
							<td colspan="19" bgcolor="#D3EDFF" height="2"></td>
						</tr>
						<tr class="resultItem">
							<td width="26" align="center" height="25"><img
								src="http://searchgov1.eastday.com/searchwgj_new/images/js5.gif" /></td>
							<td width="1" bgcolor="#EFEFEF"><img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="1" /></td>
							<td width="3"><img src="./images/blank.gif" width="3" /></td>
							<td width="71" class="12pixblack" valign="top"><img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="3" /> <img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="3" /></td>
							<td width="1" bgcolor="#EFEFEF"><img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="1" /></td>
							<td width="5" bgcolor="#FFFEEA"><img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="5" /></td>
							<td width="147" class="12pixblack" bgcolor="#FFFEEA" valign="top"><img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="3" /><a
								href="/busi/docshow.do?docid=${doc.id }&ejml=${doc.xxgkejml}&yjml=${doc.xxgkyjml}">${doc.zwbt }</a><img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="3" /></td>
							<td width="1" bgcolor="#EFEFEF"><img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="1" /></td>
							<td width="5"><img src="./images/blank.gif" width="5" /></td>
							<td width="181" class="12pixblack" valign="top"><img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="3" /> <img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="3" /></td>
							<td width="1" bgcolor="#EFEFEF"><img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="1" /></td>
							<td width="5" bgcolor="#FFFEEA"><img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="2" /></td>
							<td width="89" align="center" class="12pixblack"
								bgcolor="#FFFEEA" valign="top"><img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="3" /> 2015年11月21日 <img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="3" /></td>
							<td width="1" bgcolor="#EFEFEF"><img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="1" /></td>
							<td width="5"><img src="./images/blank.gif" width="2" /></td>
							<td width="123" align="center" class="12pixblack" valign="top"><img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="3" /> <img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="3" /></td>
							<td width="1" bgcolor="#EFEFEF"><img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="1" /></td>
							<td width="5" bgcolor="#FFFEEA"><img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="2" /></td>
							<td width="105" class="12pixblack" bgcolor="#FFFEEA" valign="top"><img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="3" /> <img
								src="http://searchgov1.eastday.com/searchwgj_new/images/blank.gif" width="3" /></td>
						</tr>
						<tr>
							<td colspan="19" bgcolor="#EFEFEF" height="1"></td>
						</tr>
						<tr>
							<td colspan="19" bgcolor="#EFEFEF" height="1"></td>
						</tr>
						</c:forEach>
					</table></td>
			</tr>
		</table>
		<!-- 检索集合 End-->
		<!-- pager-->
		<div id="pages">
				<c:if test="${not empty docList }">
					<a id="first" href="${queryStr }&pageNo=1">第一页 </a>
					<a id="prev" href="${queryStr }&pageNo=${curPage==1?1:(curPage-1)}">上一页 </a>
					<span id="nums">
					<c:forEach begin="${beginPage }" end="${endPage }" var="v">
						<c:if test="${v == curPage }">
						[<a class="Current"> ${v } </a>]
						</c:if>
						<c:if test="${not (v == curPage) }">
						[<a href="${queryStr }&pageNo=${v}"> ${v } </a>]
						</c:if>
					</c:forEach>
	                </span>
	                <a id="next" href="${queryStr }&pageNo=${curPage==totalPage?totalPage:(curPage+1)}">下一页 </a>
	                <a id="last" href="${queryStr }&pageNo=${totalPage}">最后一页</a>
                </c:if>
                <c:if test="${empty docList}">
					<div id="empty">未找到相关记录，请检查输入的文字是否有误或更换关键字</div>
				</c:if>
        </div>
		<div id="empty"></div>
		<table width="1000" border="0" cellspacing="0" cellpadding="0">
			<tbody>
				<tr>
					<td height="7" align="center" valign="middle" bgcolor="#FFFFFF"></td>
				</tr>
				<tr>
					<td height="97" align="center" valign="middle" bgcolor="E3DCB6"><img
						src="http://searchgov1.eastday.com/searchwgj_new//images/icp.gif" width="218" height="84" /></td>
				</tr>
			</tbody>
		</table>
	</center>
</body>
</html>
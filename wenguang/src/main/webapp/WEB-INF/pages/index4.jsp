<!-- 该页面用于呈现main.jsp页面的右侧搜索栏的搜索结果 -->
<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
		<title>文广</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<link href="http://searchgov1.eastday.com/searchwgj_new/css/css.css" rel="stylesheet" type="text/css">
		<link href="http://searchgov1.eastday.com/searchwgj_new/css/tree.css" rel="StyleSheet" type="text/css">
		<link href="http://searchgov1.eastday.com/searchwgj_new/css/search.css" rel="StyleSheet" type="text/css">
	</head>
	<body background="http://searchgov1.eastday.com/searchwgj_new/images/pagebk.gif" topmargin="0" leftmargin="0">
		<center>
			<table width="100%" cellspacing="0" cellpadding="0">
				<tbody>
					<tr>
						<td valign="top" bgcolor="#ffffff">
							<table width="768" cellspacing="0" cellpadding="0">
								<tbody>
									<tr>
										<td height="2" bgcolor="#eaeaea" colspan="3">
										</td>
									</tr>
								<tr class="12pixblack">
									<td>
										<img src="http://searchgov1.eastday.com/searchwgj_new/images/js7.gif">
									</td>
									<td>
										<div id="info">共${totalRows }项，当前第${curPage }页/共${totalPage }页</div>
									</td>
								</tr>
								</tbody>
							</table>
							<table width="100%" bgcolor="#efefef" cellspacing="0" cellpadding="0">
								<thead>
									<tr>
										<td width="106" height="33" align="right" class="12pixblack">
											<font color="#497e00">
												<b>索取号</b>
											</font>&nbsp;&nbsp;&nbsp;
											<font color="#adaead">|</font>
										</td>
										<td width="152" align="right" class="12pixblack">
											<font color="#497e00"><b>信息名称</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<font color="#adaead">|</font>
										</td>
										<td width="188" align="right" class="12pixblack">
											<font color="#497e00"><b>内容描述</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<font color="#adaead">|</font>
										</td>
										<td width="95" align="right" class="12pixblack">
											<font color="#497e00"><b>产生日期 </b></font>&nbsp;
											<font color="#adaead">|</font>
										</td>
										<td width="129" align="right" class="12pixblack">
											<font color="#497e00"><b>文件编号</b></font>&nbsp;&nbsp;&nbsp;
											<font color="#adaead">|</font>
										</td>
										<td width="108" align="center" class="12pixblack">
											<font color="#497e00"><b>发布机构</b></font>
										</td>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${docList}" var="doc">
									<tr>
										<td width="106" height="33" align="right" >
											${doc.callNumber }
										</td>
										<td width="152" align="right">
											<a href="/wg/docid/${doc.id }" target="content">${doc.zwbt }</a>
										</td>
										<td width="188" align="right">
											${doc.contentDescription}
										</td>
										<td width="95" align="right">
											${doc.yfrq }
										</td>
										<td width="129" align="right">
											
										</td>
										<td width="108" align="center">
											${doc.fwdw }
										</td>
									</tr>
									</c:forEach>
								</tbody>
							</table>
						</td>
					</tr>
				</tbody>
				<tfoot>
				</tfoot>
			</table>
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
	</center>
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tbody>
					<tr>
						<td height="7" align="center" valign="middle" bgcolor="#ffffff"></td>
					</tr>
					<tr>
						<td height="97" align="center" valign="middle" bgcolor="#e3dcb6">
						<img width="218" height="84" src="http://searchgov1.eastday.com/searchwgj_new/images/icp.gif">
					</td>
				</tr>
			</tbody>
	</table>
</body>
</html>
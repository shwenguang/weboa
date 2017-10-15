<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- saved from url=(0041)https://ecms.eastday.com/wdcmbs/Main.aspx -->
<html xmlns="http://www.w3.org/1999/xhtml"
	class=" ext-strict x-viewport">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
	<title>WDCM V5.8版</title>
	<link href="/static/css/bg-ext-all.css" rel="stylesheet" type="text/css"></link>
	<link href="/static/css/bg-style.css" rel="stylesheet" type="text/css"></link>
	<link rel="stylesheet" type="text/css" href="/static/css/bg-xtheme-blue.css"></link>
<style type="text/css">
.user {
	background: url(image/user.png) no-repeat 1px 2px;
}

.key {
	background: url(image/key.png) no-repeat 1px 2px;
}

.dbkey {
	background: url(image/dbkey.png) no-repeat 1px 2px;
}

.name {
	background: url(image/book.png) no-repeat 1px 2px;
}

.type {
	background: url(image/layout.png) no-repeat 1px 2px;
}

.cnn {
	background: url(image/dbcnn.png) no-repeat 1px 2px;
}

.user, .key, .name, .type, .cnn, .dbkey {
	background-color: #FFFFFF;
	padding-left: 20px;
	font-weight: bold;
	color: #000033;
}

.btn-remove {
	background: url(image/delete.png) no-repeat !important;
	border: none;
	cursor: pointer;
	width: 19px;
	height: 16px;
}

.btn-add {
	background: url(image/active.png) no-repeat !important;
	border: none;
	cursor: pointer;
	width: 19px;
	height: 16px;
}

.btn-del {
	background: url(image/forbid.png) no-repeat !important;
	border: none;
	cursor: pointer;
	width: 19px;
	height: 16px;
}
</style>
</head>
<script type="text/javascript" src="/static/js/vue.js"></script>
<script type="text/javascript" src="/static/js/axios.min.js"></script>
<script type="text/javascript" src="/static/js/jquery-1.8.2.js"></script>
<body class="  ext-webkit ext-chrome x-border-layout-ct" id="ext-gen8">
<div id="app">
	<div id="north"
		style="position: absolute; height: 66px; left: 0px; top: 0px; width: 1422px; background-image: url(https://ecms.eastday.com/wdcmbs/image/skin/01.jpg);"
		class=" x-border-panel">
		<div id="myTime"
			style="width: 244px; height: 19px; float: right; left: -13px; position: relative; top: 35px; font-size: 12px; color: #ffffff; z-index: 101;">现在时刻：16:20:47
			2017年10月10日 星期二</div>
		<div id="UserName"
			style="width: 237px; height: 19px; float: right; left: 223px; position: relative; top: 11px; font-size: 12px; color: #ffffff; z-index: 101;">
			欢迎您 zd|&nbsp;<a href="javascript:changeUser();">修改用户</a>&nbsp;|&nbsp;<a
				href="javascript:loginout();">退出</a>&nbsp;|
		</div>
	</div>
	<div id="south"
		style="color: red; font-style: normal; font-variant: normal; font-weight: normal; font-stretch: normal; font-size: 12px; line-height: normal; font-family: tahoma, arial, sans-serif, 宋体; position: absolute; height: 20px; left: 0px; top: 930px; width: 1422px;"
		align="center" class=" x-border-panel">
		@copyright<a href="http://eastday.com/" target="_blank">上海东方网股份有限公司</a>--WDCM
		V5.8版&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:ShowViewPlay();">播放向导</a>
	</div>
	<div id="ext-comp-1104" class=" x-tab-panel x-border-panel"
		style="padding: 0px 5px; left: 196px; top: 66px; width: 1210px;">
		<div class="x-tab-panel-header x-unselectable" id="ext-gen18"
			style="width: 1208px;">
			<div class="x-tab-strip-wrap" id="ext-gen21" style="width: 1208px;">
				<ul class="x-tab-strip x-tab-strip-top" id="ext-gen23">
					<li class=" x-tab-with-icon x-tab-strip-active"
						id="ext-comp-1104__center-main-panel"><a
						class="x-tab-strip-close" id="ext-gen26"></a><a
						class="x-tab-right"
						href="https://ecms.eastday.com/wdcmbs/Main.aspx#" id="ext-gen27"><em
							class="x-tab-left"><span class="x-tab-strip-inner"><span
									class="x-tab-strip-text house">内容列表</span></span></em></a></li>
					<li class="x-tab-edge" id="ext-gen24"><span
						class="x-tab-strip-text">&nbsp;</span></li>
					<div class="x-clear" id="ext-gen25"></div>
				</ul>
			</div>
			<div class="x-tab-strip-spacer" id="ext-gen22"></div>
		</div>
		<div class="x-tab-panel-bwrap" id="ext-gen19">
			<div class="x-tab-panel-body x-tab-panel-body-top" id="ext-gen20"
				style="width: 1208px; height: 832px;">
				<div id="center-main-panel" class=" x-panel x-panel-noborder"
					style="width: 1208px;">
					<div class="x-panel-bwrap" id="ext-gen28">
						<div
							class="x-panel-body x-panel-body-noheader x-panel-body-noborder x-border-layout-ct"
							id="ext-gen29" style="width: 1208px; height: 832px;">
							<div id="center-preview"
								class=" x-panel x-panel-noborder x-border-panel"
								style="left: 0px; top: 0px; width: 1208px;">
								<div class="x-panel-bwrap" id="ext-gen31">
									<div
										class="x-panel-body x-panel-body-noheader x-panel-body-noborder"
										id="ext-gen32" style="width: 1208px; height: 832px;">
										<div id="mccenter_grid_list"
											class=" x-panel x-panel-noborder x-grid-panel"
											style="width: 1208px;">
											<div class="x-panel-bwrap " id="ext-gen46">
												<div
													class="x-panel-tbar x-panel-tbar-noheader x-panel-tbar-noborder"
													id="ext-gen47" style="width: 1208px;">
													<div id="ext-comp-1067"
														class="x-toolbar x-small-editor x-toolbar-layout-ct"
														style="width: 1204px;">
														<table cellspacing="0" class="x-toolbar-ct">
															<tbody>
																<tr>
																	<td class="x-toolbar-left" align="left"><table
																			cellspacing="0">
																			<tbody>
																				<tr class="x-toolbar-left-row">
																					<td class="x-toolbar-cell" id="ext-gen69"><span
																						class="xtb-sep" id="ext-gen70"></span></td>
																					<td class="x-toolbar-cell" id="ext-gen71"><table
																							id="ext-comp-1069" cellspacing="0"
																							class="x-btn   x-btn-text-icon"
																							style="width: auto;">
																							<tbody class="x-btn-small x-btn-icon-small-left">
																								<tr>
																									<td class="x-btn-tl"><i>&nbsp;</i></td>
																									<td class="x-btn-tc"></td>
																									<td class="x-btn-tr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-ml"><i>&nbsp;</i></td>
																									<td class="x-btn-mc"><em
																										class="x-btn-split" unselectable="on"><button
																												type="button" id="ext-gen72"
																												class=" x-btn-text add">添加</button></em></td>
																									<td class="x-btn-mr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-bl"><i>&nbsp;</i></td>
																									<td class="x-btn-bc"></td>
																									<td class="x-btn-br"><i>&nbsp;</i></td>
																								</tr>
																							</tbody>
																						</table></td>
																					<td class="x-toolbar-cell" id="ext-gen73"><span
																						class="xtb-sep" id="ext-gen74"></span></td>
																					<td class="x-toolbar-cell" id="ext-gen75"><table
																							id="ext-comp-1072" cellspacing="0"
																							class="x-btn   x-btn-text-icon"
																							style="width: auto;">
																							<tbody class="x-btn-small x-btn-icon-small-left">
																								<tr>
																									<td class="x-btn-tl"><i>&nbsp;</i></td>
																									<td class="x-btn-tc"></td>
																									<td class="x-btn-tr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-ml"><i>&nbsp;</i></td>
																									<td class="x-btn-mc"><em class=""
																										unselectable="on"><button type="button"
																												id="ext-gen76" class=" x-btn-text edit">编辑</button></em></td>
																									<td class="x-btn-mr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-bl"><i>&nbsp;</i></td>
																									<td class="x-btn-bc"></td>
																									<td class="x-btn-br"><i>&nbsp;</i></td>
																								</tr>
																							</tbody>
																						</table></td>
																					<td class="x-toolbar-cell" id="ext-gen77"><span
																						class="xtb-sep" id="ext-gen78"></span></td>
																					<td class="x-toolbar-cell" id="ext-gen79"><table
																							id="ext-comp-1074" cellspacing="0"
																							class="x-btn   x-btn-text-icon"
																							style="width: auto;">
																							<tbody class="x-btn-small x-btn-icon-small-left">
																								<tr>
																									<td class="x-btn-tl"><i>&nbsp;</i></td>
																									<td class="x-btn-tc"></td>
																									<td class="x-btn-tr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-ml"><i>&nbsp;</i></td>
																									<td class="x-btn-mc"><em class=""
																										unselectable="on"><button type="button"
																												id="ext-gen80" class=" x-btn-text del">删除</button></em></td>
																									<td class="x-btn-mr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-bl"><i>&nbsp;</i></td>
																									<td class="x-btn-bc"></td>
																									<td class="x-btn-br"><i>&nbsp;</i></td>
																								</tr>
																							</tbody>
																						</table></td>
																					<td class="x-toolbar-cell" id="ext-gen81"><span
																						class="xtb-sep" id="ext-gen82"></span></td>
																					<td class="x-toolbar-cell" id="ext-gen83"><table
																							id="ext-comp-1076" cellspacing="0"
																							class="x-btn   x-btn-text-icon"
																							style="width: auto;">
																							<tbody class="x-btn-small x-btn-icon-small-left">
																								<tr>
																									<td class="x-btn-tl"><i>&nbsp;</i></td>
																									<td class="x-btn-tc"></td>
																									<td class="x-btn-tr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-ml"><i>&nbsp;</i></td>
																									<td class="x-btn-mc"><em class=""
																										unselectable="on"><button type="button"
																												id="ext-gen84" class=" x-btn-text rec">回收站</button></em></td>
																									<td class="x-btn-mr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-bl"><i>&nbsp;</i></td>
																									<td class="x-btn-bc"></td>
																									<td class="x-btn-br"><i>&nbsp;</i></td>
																								</tr>
																							</tbody>
																						</table></td>
																					<td class="x-toolbar-cell" id="ext-gen85"><span
																						class="xtb-sep" id="ext-gen86"></span></td>
																					<td class="x-toolbar-cell" id="ext-gen87"><table
																							id="mc-selected-obj" cellspacing="0"
																							class="x-btn   x-btn-text-icon"
																							style="width: auto;">
																							<tbody class="x-btn-small x-btn-icon-small-left">
																								<tr>
																									<td class="x-btn-tl"><i>&nbsp;</i></td>
																									<td class="x-btn-tc"></td>
																									<td class="x-btn-tr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-ml"><i>&nbsp;</i></td>
																									<td class="x-btn-mc"><em
																										class="x-btn-split" unselectable="on"><button
																												type="button" id="ext-gen88"
																												class=" x-btn-text table">稿件</button></em></td>
																									<td class="x-btn-mr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-bl"><i>&nbsp;</i></td>
																									<td class="x-btn-bc"></td>
																									<td class="x-btn-br"><i>&nbsp;</i></td>
																								</tr>
																							</tbody>
																						</table></td>
																					<td class="x-toolbar-cell" id="ext-gen89"><span
																						class="xtb-sep" id="ext-gen90"></span></td>
																					<td class="x-toolbar-cell" id="ext-gen91"><table
																							id="ext-comp-1079" cellspacing="0"
																							class="x-btn   x-btn-text-icon "
																							style="width: auto;">
																							<tbody class="x-btn-small x-btn-icon-small-left">
																								<tr>
																									<td class="x-btn-tl"><i>&nbsp;</i></td>
																									<td class="x-btn-tc"></td>
																									<td class="x-btn-tr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-ml"><i>&nbsp;</i></td>
																									<td class="x-btn-mc"><em
																										class="x-btn-split" unselectable="on"><button
																												type="button" id="ext-gen92"
																												class=" x-btn-text preview-hide">版式</button></em></td>
																									<td class="x-btn-mr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-bl"><i>&nbsp;</i></td>
																									<td class="x-btn-bc"></td>
																									<td class="x-btn-br"><i>&nbsp;</i></td>
																								</tr>
																							</tbody>
																						</table></td>
																					<td class="x-toolbar-cell" id="ext-gen93"><span
																						class="xtb-sep" id="ext-gen94"></span></td>
																					<td class="x-toolbar-cell" id="ext-gen95"><table
																							id="ext-comp-1084" cellspacing="0"
																							class="x-btn   x-btn-text-icon"
																							style="width: auto;">
																							<tbody class="x-btn-small x-btn-icon-small-left">
																								<tr>
																									<td class="x-btn-tl"><i>&nbsp;</i></td>
																									<td class="x-btn-tc"></td>
																									<td class="x-btn-tr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-ml"><i>&nbsp;</i></td>
																									<td class="x-btn-mc"><em class=""
																										unselectable="on"><button type="button"
																												id="ext-gen96"
																												class=" x-btn-text text_list_numbers">稿件调整</button></em></td>
																									<td class="x-btn-mr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-bl"><i>&nbsp;</i></td>
																									<td class="x-btn-bc"></td>
																									<td class="x-btn-br"><i>&nbsp;</i></td>
																								</tr>
																							</tbody>
																						</table></td>
																					<td class="x-toolbar-cell" id="ext-gen97"><span
																						class="xtb-sep" id="ext-gen98"></span></td>
																				</tr>
																			</tbody>
																		</table></td>
																	<td class="x-toolbar-right" align="right"><table
																			cellspacing="0" class="x-toolbar-right-ct">
																			<tbody>
																				<tr>
																					<td><table cellspacing="0">
																							<tbody>
																								<tr class="x-toolbar-right-row">
																									<td class="x-toolbar-cell" id="ext-gen99"><div
																											class="xtb-text" id="ext-comp-1086">
																											<b>搜索:</b>
																										</div></td>
																									<td class="x-toolbar-cell" id="ext-gen100"><div
																											class="xtb-spacer" style="" id="ext-gen101"></div></td>
																									<td class="x-toolbar-cell" id="ext-gen102"><input
																										type="text" size="20" autocomplete="off"
																										id="message" name="message"
																										class=" x-form-text x-form-field x-form-empty-field"
																										style="width: 172px;"></td>
																									<td class="x-toolbar-cell" id="ext-gen103"><span
																										class="xtb-sep" id="ext-gen104"></span></td>
																									<td class="x-toolbar-cell" id="ext-gen105"><table
																											id="ext-comp-1089" cellspacing="0"
																											class="x-btn   x-btn-text-icon"
																											style="width: auto;">
																											<tbody
																												class="x-btn-small x-btn-icon-small-left">
																												<tr>
																													<td class="x-btn-tl"><i>&nbsp;</i></td>
																													<td class="x-btn-tc"></td>
																													<td class="x-btn-tr"><i>&nbsp;</i></td>
																												</tr>
																												<tr>
																													<td class="x-btn-ml"><i>&nbsp;</i></td>
																													<td class="x-btn-mc"><em
																														class="x-btn-split" unselectable="on"><button
																																type="button" id="ext-gen106"
																																class=" x-btn-text search">高级搜索</button></em></td>
																													<td class="x-btn-mr"><i>&nbsp;</i></td>
																												</tr>
																												<tr>
																													<td class="x-btn-bl"><i>&nbsp;</i></td>
																													<td class="x-btn-bc"></td>
																													<td class="x-btn-br"><i>&nbsp;</i></td>
																												</tr>
																											</tbody>
																										</table></td>
																									<td class="x-toolbar-cell" id="ext-gen107"><input
																										type="hidden" size="20" autocomplete="off"
																										id="selId" name="selId"
																										class=" x-form-hidden x-form-field"></td>
																									<td class="x-toolbar-cell" id="ext-gen108"><input
																										type="hidden" size="20" autocomplete="off"
																										id="node_authority" name="node_authority"
																										class=" x-form-hidden x-form-field"
																										value="2095"></td>
																								</tr>
																							</tbody>
																						</table></td>
																					<td><table cellspacing="0">
																							<tbody>
																								<tr class="x-toolbar-extras-row"></tr>
																							</tbody>
																						</table></td>
																				</tr>
																			</tbody>
																		</table></td>
																</tr>
															</tbody>
														</table>
													</div>
												</div>
												<div
													class="x-panel-body x-panel-body-noheader x-panel-body-noborder"
													id="ext-gen48" style="width: 1208px; height: 777px;">
													<div class="x-grid3" hidefocus="true" id="ext-gen53"
														style="width: 1208px; height: 777px;">
														<div class="x-grid3-viewport" id="ext-gen54">
															<div class="x-grid3-header" id="ext-gen55">
																<div class="x-grid3-header-inner" id="ext-gen61"
																	style="width: 1208px;">
																	<div class="x-grid3-header-offset"
																		style="width: 1201px;">
																		<table border="0" cellspacing="0" cellpadding="0"
																			style="width: 1180px;">
																			<thead>
																				<tr class="x-grid3-hd-row">
																					<td
																						class="x-grid3-hd x-grid3-cell x-grid3-td-checker x-grid3-cell-first "
																						style="width: 20px; display: none;"><div
																							class="x-grid3-hd-inner x-grid3-hd-checker"
																							unselectable="on" style="">
																							<a class="x-grid3-hd-btn"
																								href="https://ecms.eastday.com/wdcmbs/Main.aspx#"></a>
																							<div class="x-grid3-hd-checker">&nbsp;</div>
																							<img class="x-grid3-sort-icon"
																								src="/static/images/s.gif">
																						</div></td>
																					<td
																						class="x-grid3-hd x-grid3-cell x-grid3-td-numberer "
																						style="width: 28px;"><div
																							class="x-grid3-hd-inner x-grid3-hd-numberer"
																							unselectable="on" style="">
																							<a class="x-grid3-hd-btn"
																								href="https://ecms.eastday.com/wdcmbs/Main.aspx#"></a><img
																								class="x-grid3-sort-icon" src="/static/images/s.gif">
																						</div></td>
																					<td class="x-grid3-hd x-grid3-cell x-grid3-td-2 "
																						style="width: 297px;"><div
																							class="x-grid3-hd-inner x-grid3-hd-2"
																							unselectable="on" style="">
																							<a class="x-grid3-hd-btn"
																								href="https://ecms.eastday.com/wdcmbs/Main.aspx#"></a>标题<img
																								class="x-grid3-sort-icon" src="/static/images/s.gif">
																						</div></td>
																					<td class="x-grid3-hd x-grid3-cell x-grid3-td-3 "
																						style="width: 118px;"><div
																							class="x-grid3-hd-inner x-grid3-hd-3"
																							unselectable="on" style="">
																							<a class="x-grid3-hd-btn"
																								href="https://ecms.eastday.com/wdcmbs/Main.aspx#"
																								id="ext-gen321" style="height: 22px;"></a>签发状态<img
																								class="x-grid3-sort-icon" src="/static/images/s.gif">
																						</div></td>
																					<td class="x-grid3-hd x-grid3-cell x-grid3-td-4 "
																						style="width: 118px;"><div
																							class="x-grid3-hd-inner x-grid3-hd-4"
																							unselectable="on" style="">
																							<a class="x-grid3-hd-btn"
																								href="https://ecms.eastday.com/wdcmbs/Main.aspx#"
																								id="ext-gen322" style="height: 22px;"></a>审核状态<img
																								class="x-grid3-sort-icon" src="/static/images/s.gif">
																						</div></td>
																					<td class="x-grid3-hd x-grid3-cell x-grid3-td-5 "
																						style="width: 118px;"><div
																							class="x-grid3-hd-inner x-grid3-hd-5"
																							unselectable="on" style="">
																							<a class="x-grid3-hd-btn"
																								href="https://ecms.eastday.com/wdcmbs/Main.aspx#"></a>对象类别<img
																								class="x-grid3-sort-icon" src="/static/images/s.gif">
																						</div></td>
																					<td class="x-grid3-hd x-grid3-cell x-grid3-td-6 "
																						style="width: 118px;"><div
																							class="x-grid3-hd-inner x-grid3-hd-6"
																							unselectable="on" style="">
																							<a class="x-grid3-hd-btn"
																								href="https://ecms.eastday.com/wdcmbs/Main.aspx#"></a>修改人<img
																								class="x-grid3-sort-icon" src="/static/images/s.gif">
																						</div></td>
																					<td class="x-grid3-hd x-grid3-cell x-grid3-td-7 "
																						style="width: 118px;"><div
																							class="x-grid3-hd-inner x-grid3-hd-7"
																							unselectable="on" style="">
																							<a class="x-grid3-hd-btn"
																								href="https://ecms.eastday.com/wdcmbs/Main.aspx#"></a>创建时间<img
																								class="x-grid3-sort-icon" src="/static/images/s.gif">
																						</div></td>
																					<td class="x-grid3-hd x-grid3-cell x-grid3-td-8 "
																						style="width: 118px;"><div
																							class="x-grid3-hd-inner x-grid3-hd-8"
																							unselectable="on" style="">
																							<a class="x-grid3-hd-btn"
																								href="https://ecms.eastday.com/wdcmbs/Main.aspx#"></a>修改时间<img
																								class="x-grid3-sort-icon" src="/static/images/s.gif">
																						</div></td>
																					<td class="x-grid3-hd x-grid3-cell x-grid3-td-9 "
																						style="width: 40px; display: none;"><div
																							class="x-grid3-hd-inner x-grid3-hd-9"
																							unselectable="on" style="">
																							<a class="x-grid3-hd-btn"
																								href="https://ecms.eastday.com/wdcmbs/Main.aspx#"></a>报送栏目<img
																								class="x-grid3-sort-icon" src="/static/images/s.gif">
																						</div></td>
																					<td class="x-grid3-hd x-grid3-cell x-grid3-td-10 "
																						style="width: 40px; display: none;"><div
																							class="x-grid3-hd-inner x-grid3-hd-10"
																							unselectable="on" style="">
																							<a class="x-grid3-hd-btn"
																								href="https://ecms.eastday.com/wdcmbs/Main.aspx#"></a>报送部门<img
																								class="x-grid3-sort-icon" src="/static/images/s.gif">
																						</div></td>
																					<td class="x-grid3-hd x-grid3-cell x-grid3-td-11 "
																						style="width: 118px;"><div
																							class="x-grid3-hd-inner x-grid3-hd-11"
																							unselectable="on" style="">
																							<a class="x-grid3-hd-btn"
																								href="https://ecms.eastday.com/wdcmbs/Main.aspx#"></a>创建人<img
																								class="x-grid3-sort-icon" src="/static/images/s.gif">
																						</div></td>
																					<td
																						class="x-grid3-hd x-grid3-cell x-grid3-td-12 x-grid3-cell-last "
																						style="width: 29px;"><div
																							class="x-grid3-hd-inner x-grid3-hd-12"
																							unselectable="on" style="">
																							<a class="x-grid3-hd-btn"
																								href="https://ecms.eastday.com/wdcmbs/Main.aspx#"></a>推荐状态<img
																								class="x-grid3-sort-icon" src="/static/images/s.gif">
																						</div></td>
																				</tr>
																			</thead>
																		</table>
																	</div>
																</div>
																<div class="x-clear"></div>
															</div>
															<div class="x-grid3-scroller" id="ext-gen56"
																style="overflow-x: ; width: 1208px; height: 753px;">
																<div class="x-grid3-body" style="width: 1180px;"
																	id="ext-gen57">
																	<div class="x-grid3-row " style="width: 1180px;">
																		<table class="x-grid3-row-table" border="0"
																			cellspacing="0" cellpadding="0"
																			style="width: 1180px;">
																			<tbody>
																				<tr>
																					<td
																						class="x-grid3-col x-grid3-cell x-grid3-td-checker x-grid3-cell-first "
																						style="width: 20px; display: none;" tabindex="0"><div
																							class="x-grid3-cell-inner x-grid3-col-checker"
																							unselectable="on">
																							<div class="x-grid3-row-checker">&nbsp;</div>
																						</div></td>
																					<td
																						class="x-grid3-col x-grid3-cell x-grid3-td-numberer "
																						style="width: 28px;" tabindex="0"><div
																							class="x-grid3-cell-inner x-grid3-col-numberer"
																							unselectable="on">3</div></td>
																					<td class="x-grid3-col x-grid3-cell x-grid3-td-2 "
																						style="width: 297px;" tabindex="0"><div
																							class="x-grid3-cell-inner x-grid3-col-2"
																							unselectable="on" ext:qtitle="文件标题"
																							ext:qtip="张翔版画作品展”在文化馆民间文化展示馆开幕">张翔版画作品展”在文化馆民间文化展示馆开幕</div></td>
																					<td class="x-grid3-col x-grid3-cell x-grid3-td-3 "
																						style="width: 118px;" tabindex="0"><div
																							class="x-grid3-cell-inner x-grid3-col-3"
																							unselectable="on">
																							<font font-size="12"><font><img
																									src="lb_files/qian1.png" border="0"></font>&nbsp;新编</font>
																						</div></td>
																					<td class="x-grid3-col x-grid3-cell x-grid3-td-4 "
																						style="width: 118px;" tabindex="0"><div
																							class="x-grid3-cell-inner x-grid3-col-4"
																							unselectable="on">
																							<font font-size="12"><font><img
																									src="lb_files/audit1.png" border="0"></font>&nbsp;未审</font>
																						</div></td>
																					<td class="x-grid3-col x-grid3-cell x-grid3-td-5 "
																						style="width: 118px;" tabindex="0"><div
																							class="x-grid3-cell-inner x-grid3-col-5"
																							unselectable="on">稿件</div></td>
																					<td class="x-grid3-col x-grid3-cell x-grid3-td-6 "
																						style="width: 118px;" tabindex="0"><div
																							class="x-grid3-cell-inner x-grid3-col-6"
																							unselectable="on">wgj2</div></td>
																					<td class="x-grid3-col x-grid3-cell x-grid3-td-7 "
																						style="width: 118px;" tabindex="0"><div
																							class="x-grid3-cell-inner x-grid3-col-7"
																							unselectable="on">2014/05/22 15:15:00</div></td>
																					<td class="x-grid3-col x-grid3-cell x-grid3-td-8 "
																						style="width: 118px;" tabindex="0"><div
																							class="x-grid3-cell-inner x-grid3-col-8"
																							unselectable="on">2014/05/22 15:15:00</div></td>
																					<td class="x-grid3-col x-grid3-cell x-grid3-td-9 "
																						style="width: 40px; display: none;" tabindex="0"><div
																							class="x-grid3-cell-inner x-grid3-col-9"
																							unselectable="on" ext:qtitle="文件标题" ext:qtip="">&nbsp;</div></td>
																					<td class="x-grid3-col x-grid3-cell x-grid3-td-10 "
																						style="width: 40px; display: none;" tabindex="0"><div
																							class="x-grid3-cell-inner x-grid3-col-10"
																							unselectable="on" ext:qtitle="文件标题" ext:qtip="">&nbsp;</div></td>
																					<td class="x-grid3-col x-grid3-cell x-grid3-td-11 "
																						style="width: 118px;" tabindex="0"><div
																							class="x-grid3-cell-inner x-grid3-col-11"
																							unselectable="on">wgj2</div></td>
																					<td
																						class="x-grid3-col x-grid3-cell x-grid3-td-12 x-grid3-cell-last "
																						style="width: 29px;" tabindex="0"><div
																							class="x-grid3-cell-inner x-grid3-col-12"
																							unselectable="on">&nbsp;</div></td>
																				</tr>
																				<tr class="x-grid3-row-body-tr" style="">
																					<td colspan="13" class="x-grid3-body-cell"
																						tabindex="0" hidefocus="on"><div
																							class="x-grid3-row-body"></div></td>
																				</tr>
																			</tbody>
																		</table>
																	</div>
																</div>
																<a href="https://ecms.eastday.com/wdcmbs/Main.aspx#"
																	class="x-grid3-focus" tabindex="-1" id="ext-gen58"
																	style="left: 1px; top: 1px;"></a>
															</div>
														</div>
														<div class="x-grid3-resize-marker" id="ext-gen59">&nbsp;</div>
														<div class="x-grid3-resize-proxy" id="ext-gen60">&nbsp;</div>
													</div>
												</div>
												<div class="x-panel-bbar x-panel-bbar-noborder"
													id="ext-gen49" style="width: 1208px;">
													<div id="ext-comp-1044"
														class="x-toolbar x-small-editor x-toolbar-layout-ct"
														style="width: 1204px;">
														<table cellspacing="0" class="x-toolbar-ct">
															<tbody>
																<tr>
																	<td class="x-toolbar-left" align="left"><table
																			cellspacing="0">
																			<tbody>
																				<tr class="x-toolbar-left-row">
																					<td class="x-toolbar-cell" id="ext-gen109"><table
																							id="ext-comp-1045" cellspacing="0"
																							class="x-btn   x-btn-icon x-item-disabled">
																							<tbody class="x-btn-small x-btn-icon-small-left">
																								<tr>
																									<td class="x-btn-tl"><i>&nbsp;</i></td>
																									<td class="x-btn-tc"></td>
																									<td class="x-btn-tr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-ml"><i>&nbsp;</i></td>
																									<td class="x-btn-mc"><em class=""
																										unselectable="on"><button type="button"
																												id="ext-gen110"
																												class=" x-btn-text x-tbar-page-first">&nbsp;</button></em></td>
																									<td class="x-btn-mr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-bl"><i>&nbsp;</i></td>
																									<td class="x-btn-bc"></td>
																									<td class="x-btn-br"><i>&nbsp;</i></td>
																								</tr>
																							</tbody>
																						</table></td>
																					<td class="x-toolbar-cell" id="ext-gen111"><table
																							id="ext-comp-1046" cellspacing="0"
																							class="x-btn   x-btn-icon x-item-disabled">
																							<tbody class="x-btn-small x-btn-icon-small-left">
																								<tr>
																									<td class="x-btn-tl"><i>&nbsp;</i></td>
																									<td class="x-btn-tc"></td>
																									<td class="x-btn-tr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-ml"><i>&nbsp;</i></td>
																									<td class="x-btn-mc"><em class=""
																										unselectable="on"><button type="button"
																												id="ext-gen112"
																												class=" x-btn-text x-tbar-page-prev">&nbsp;</button></em></td>
																									<td class="x-btn-mr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-bl"><i>&nbsp;</i></td>
																									<td class="x-btn-bc"></td>
																									<td class="x-btn-br"><i>&nbsp;</i></td>
																								</tr>
																							</tbody>
																						</table></td>
																					<td class="x-toolbar-cell" id="ext-gen113"><span
																						class="xtb-sep" id="ext-gen114"></span></td>
																					<td class="x-toolbar-cell" id="ext-gen115"><div
																							class="xtb-text" id="ext-comp-1054">第</div></td>
																					<td class="x-toolbar-cell" id="ext-gen116"><input
																						type="text" size="20" autocomplete="off"
																						id="ext-comp-1047"
																						class=" x-form-text x-form-field x-form-num-field x-tbar-page-number"
																						title=""></td>
																					<td class="x-toolbar-cell" id="ext-gen117"><div
																							class="xtb-text" id="ext-comp-1048">页 共1页</div></td>
																					<td class="x-toolbar-cell" id="ext-gen118"><span
																						class="xtb-sep" id="ext-gen119"></span></td>
																					<td class="x-toolbar-cell" id="ext-gen120"><table
																							id="ext-comp-1049" cellspacing="0"
																							class="x-btn   x-btn-icon x-item-disabled">
																							<tbody class="x-btn-small x-btn-icon-small-left">
																								<tr>
																									<td class="x-btn-tl"><i>&nbsp;</i></td>
																									<td class="x-btn-tc"></td>
																									<td class="x-btn-tr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-ml"><i>&nbsp;</i></td>
																									<td class="x-btn-mc"><em class=""
																										unselectable="on"><button type="button"
																												id="ext-gen121"
																												class=" x-btn-text x-tbar-page-next">&nbsp;</button></em></td>
																									<td class="x-btn-mr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-bl"><i>&nbsp;</i></td>
																									<td class="x-btn-bc"></td>
																									<td class="x-btn-br"><i>&nbsp;</i></td>
																								</tr>
																							</tbody>
																						</table></td>
																					<td class="x-toolbar-cell" id="ext-gen122"><table
																							id="ext-comp-1050" cellspacing="0"
																							class="x-btn   x-btn-icon x-item-disabled">
																							<tbody class="x-btn-small x-btn-icon-small-left">
																								<tr>
																									<td class="x-btn-tl"><i>&nbsp;</i></td>
																									<td class="x-btn-tc"></td>
																									<td class="x-btn-tr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-ml"><i>&nbsp;</i></td>
																									<td class="x-btn-mc"><em class=""
																										unselectable="on"><button type="button"
																												id="ext-gen123"
																												class=" x-btn-text x-tbar-page-last">&nbsp;</button></em></td>
																									<td class="x-btn-mr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-bl"><i>&nbsp;</i></td>
																									<td class="x-btn-bc"></td>
																									<td class="x-btn-br"><i>&nbsp;</i></td>
																								</tr>
																							</tbody>
																						</table></td>
																					<td class="x-toolbar-cell" id="ext-gen124"><span
																						class="xtb-sep" id="ext-gen125"></span></td>
																					<td class="x-toolbar-cell" id="ext-gen126"><table
																							id="ext-comp-1051" cellspacing="0"
																							class="x-btn   x-btn-icon ">
																							<tbody class="x-btn-small x-btn-icon-small-left">
																								<tr>
																									<td class="x-btn-tl"><i>&nbsp;</i></td>
																									<td class="x-btn-tc"></td>
																									<td class="x-btn-tr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-ml"><i>&nbsp;</i></td>
																									<td class="x-btn-mc"><em class=""
																										unselectable="on"><button type="button"
																												id="ext-gen127"
																												class=" x-btn-text x-tbar-loading">&nbsp;</button></em></td>
																									<td class="x-btn-mr"><i>&nbsp;</i></td>
																								</tr>
																								<tr>
																									<td class="x-btn-bl"><i>&nbsp;</i></td>
																									<td class="x-btn-bc"></td>
																									<td class="x-btn-br"><i>&nbsp;</i></td>
																								</tr>
																							</tbody>
																						</table></td>
																					<td class="x-toolbar-cell" id="ext-gen128"><span
																						class="xtb-sep" id="ext-gen129"></span></td>
																					<td class="x-toolbar-cell" id="ext-gen130"><div
																							class="xtb-text" id="ext-comp-1058">查询</div></td>
																					<td class="x-toolbar-cell" id="ext-gen131"><div
																							class="x-form-field-wrap x-form-field-trigger-wrap"
																							id="ext-gen132" style="width: 85px;">
																							<input type="text" size="24" autocomplete="off"
																								id="CenterGrid_CountBox"
																								name="CenterGrid_CountBox"
																								class=" x-form-text x-form-field" title=""
																								style="width: 59px;"><img
																								src="/static/images/s.gif"
																								class="x-form-trigger x-form-arrow-trigger"
																								id="ext-gen133">
																						</div></td>
																					<td class="x-toolbar-cell" id="ext-gen134"><div
																							class="xtb-text" id="ext-comp-1059">记录</div></td>
																					<td class="x-toolbar-cell" id="ext-gen135"><span
																						class="xtb-sep" id="ext-gen136"></span></td>
																					<td class="x-toolbar-cell" id="ext-gen137"><div
																							class="xtb-text" id="ext-comp-1061">查看</div></td>
																					<td class="x-toolbar-cell" id="ext-gen138"><div
																							class="x-form-field-wrap x-form-field-trigger-wrap"
																							id="ext-gen139" style="width: 85px;">
																							<input type="text" size="24" autocomplete="off"
																								id="CenterGrid_UserBox"
																								name="CenterGrid_UserBox"
																								class=" x-form-text x-form-field" title=""
																								style="width: 59px;"><img
																								src="/static/images/s.gif"
																								class="x-form-trigger x-form-arrow-trigger"
																								id="ext-gen140">
																						</div></td>
																					<td class="x-toolbar-cell" id="ext-gen141"><div
																							class="xtb-text" id="ext-comp-1062">的稿件</div></td>
																					<td class="x-toolbar-cell" id="ext-gen142"><span
																						class="xtb-sep" id="ext-gen143"></span></td>
																					<td class="x-toolbar-cell" id="ext-gen144"><div
																							class="xtb-text" id="ext-comp-1064">每页显示</div></td>
																					<td class="x-toolbar-cell" id="ext-gen145"><div
																							class="x-form-field-wrap x-form-field-trigger-wrap"
																							id="ext-gen146" style="width: 45px;">
																							<input type="text" size="24" autocomplete="off"
																								id="CenterGrid_PageCountBox"
																								name="CenterGrid_PageCountBox"
																								class=" x-form-text x-form-field" title=""
																								style="width: 19px;"><img
																								src="/static/images/s.gif"
																								class="x-form-trigger x-form-arrow-trigger"
																								id="ext-gen147">
																						</div></td>
																					<td class="x-toolbar-cell" id="ext-gen148"><div
																							class="xtb-text" id="ext-comp-1065">条稿件</div></td>
																				</tr>
																			</tbody>
																		</table></td>
																	<td class="x-toolbar-right" align="right"><table
																			cellspacing="0" class="x-toolbar-right-ct">
																			<tbody>
																				<tr>
																					<td><table cellspacing="0">
																							<tbody>
																								<tr class="x-toolbar-right-row">
																									<td class="x-toolbar-cell" id="ext-gen149"><div
																											class="xtb-text" id="ext-comp-1052">第1-30条
																											共30条</div></td>
																								</tr>
																							</tbody>
																						</table></td>
																					<td><table cellspacing="0">
																							<tbody>
																								<tr class="x-toolbar-extras-row"></tr>
																							</tbody>
																						</table></td>
																				</tr>
																			</tbody>
																		</table></td>
																</tr>
															</tbody>
														</table>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div id="bottom-preview"
								class=" x-panel x-panel-noborder x-hide-display x-border-panel">
								<div
									class="x-panel-header x-panel-header-noborder x-unselectable"
									id="ext-gen34">
									<div class="x-tool x-tool-toggle x-tool-collapse-south"
										id="ext-gen37">&nbsp;</div>
									<span class="x-panel-header-text"></span>
								</div>
								<div class="x-panel-bwrap" id="ext-gen35">
									<div class="x-panel-body x-panel-body-noborder" id="ext-gen36"
										style="height: 224px;"></div>
								</div>
							</div>
							<div class="x-layout-split x-layout-split-south x-splitbar-v"
								id="bottom-preview-xsplit" style="visibility: hidden;">
								&nbsp;
								<div class="x-layout-mini x-layout-mini-south" id="ext-gen39">&nbsp;</div>
							</div>
							<div class="x-layout-split x-layout-split-east x-splitbar-h"
								id="right-preview-xsplit" style="visibility: hidden;">
								&nbsp;
								<div class="x-layout-mini x-layout-mini-east" id="ext-gen44">&nbsp;</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="menutree" style="width: 190px; height: 100%; float: left; left: 0px; top: 66px; overflow: scroll;" class="x-panel x-border-panel">
			<div class="x-panel-body" style="width: 188px; height: 836px;">
				<div v-for="menu in menutree" class=" x-panel x-panel-noborder " style="width: auto;">
					<div class="x-panel-header main_menu" onclick="showThis(this)" style="cursor: pointer;">
						<span class="x-panel-header-text">{{menu.name}}</span>
					</div>
					<div class="sub_menu" :id="'menu_'+menu.mlbh" style="display:none;">
						<ul class="x-tree-root-ct x-tree-lines">
							<!-- 二级菜单 -->
							<li v-for="sub in menu.subs" class="x-tree-node">
								<div @click="show(sub.mlbh)" class="x-tree-node-el x-unselectable  x-tree-node-expanded">
									<img src="/static/images/s.gif" class="x-tree-node-icon system_main">
									<span>{{sub.name}}</span>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
	</div>
</div>
<script>
var app = new Vue({
	el:"#app",
	data:{
		menutree:[]
	},
	methods:{
		show:function(ejml){
			alert(ejml)
		}
	},
	created:function(){
		axios.get("/bg/menuTree.do")
		.then(function(res){
			console.log(res.data)
			app.$data.menutree = res.data;
		})
	}
})

function showThis(e) {
	var next = $(e).next();
	if($(next).is(":visible")){
		$(next).hide('fast');
	} else {
		$(next).show('fast');
	}
}
</script>
</body>
</html>
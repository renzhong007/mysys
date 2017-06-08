<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Title</title>
<base
	href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/">

<meta name="keywords" content="在线翻译">
<meta name="description" content="sss。">
<meta name="viewport"
	content="width=device-width, initial-scale=1.4, minimum-scale=1.0, maximum-scale=2.0">
<link rel="shortcut icon"
	href="http://shared.ydstatic.com/images/favicon.ico"
	type="image/x-icon">


<link href="static/css/fanyi.css" rel="stylesheet" type="text/css">
</head>

<body>

	<div id="fanyi-header">
		<img src="static/images/Logo2.png" style="height: 100%; weight: 100%;align:center;">
		<div class="inner">
			<!-- <div class="wrapper">
				<div class="lt_top fl">
					<div class="logo">
						
						<img src="static/images/logo1.png" style="padding: 11px 0px">
					</div>
				</div>
				<div class="lr_top fr">
					<div class="logolist" style="float: right">

						<span class="item"><a href="">登录</a></span>
					</div>
				</div>
			</div> -->
		</div>
	</div>
	<div class="divide-wrap">
		<div class="colorbar-before"></div>
		<div class="colorbar-after"></div>
		<div class="colorbar"></div>
	</div>
	<div id="fanyi-center">
		<div id="main" class="cf">
			<div class="inputMod fl">
				<div class="wrapper">
					<div class="main_header">
						<div class="fl">
							<ul>
								<li><select name="from" id="translate_from">
										<option value="auto" selected>自动检测</option>
										<option value="zh">中&nbsp;&nbsp;&nbsp;文&nbsp;&nbsp;&nbsp;</option>
										<option value="mon">蒙&nbsp;&nbsp;&nbsp;文&nbsp;&nbsp;&nbsp;</option>
								</select></li>
								<li><span class="fanyi-arrow"></span></li>
								<li><select name="to" id="translate_to">
										<option value="zh">中&nbsp;&nbsp;&nbsp;文&nbsp;&nbsp;&nbsp;</option>
										<option value="mon">蒙&nbsp;&nbsp;&nbsp;文&nbsp;&nbsp;&nbsp;</option>
								</select></li>
							</ul>
						</div>
						<div class="translate-opt">
							<a class="translate-btn" onclick="transLate()"></a>
						</div>
					</div>
					<div class="lt_body">
						<form action="http://fanyi.youdao.com/" method="post"
							id="transForm" name="transForm">
							<div class="clearall">
								<div id="clearInput" class="clog-js" style="display: none;">
									<div class="clearnotice">清空内容</div>
								</div>
							</div>
							<div id="inputContent">
								<textarea id="inputText" class="text" dir="ltr" tabindex="1"
									wrap="SOFT" name="i"
									style="height: 300px; width: 100%; resize: none;"
									placeholder="请输入要翻译的文字"></textarea>
							</div>
						</form>
					</div>
				</div>
				<!-- end of wrapper -->
			</div>
			<!-- end of div inputMod -->
			<div class="outputMod fr">
				<div class="wrapper" id="outWrapper">
					<div class="main_header">
						<div class="translate-toggle">
							<font>翻译结果:</font>
							<!-- <button class="toggle-btn"></button> -->
						</div>
					</div>
					<div class="lr_body">
						<div id="translatedResult">
							<div class="resultdiv1">
								<div class="result-header">翻译结果:</div>
								<div class="result-body">
									<font id="mon">no result</font>
								</div>
							</div>
							<!-- <div class="resultdiv2">
								<div class="result-header">有道:</div>
								<div class="result-body" id="youdaofanyi">no result</div>
							</div>
							<div class="resultdiv3">
								<div class="result-header">Moses:</div>
								<div class="result-body" id="googlefanyi">no result</div>
							</div>
							<div class="minxin">
								<div class="result-header">融合后</div>
								<div class="result-body" id="minxin">no result</div>
							</div> -->
						</div>
					</div>
				</div>
			</div>


		</div>
	</div>

	<div id="fanyi-footer">
		<div class="wrapper">
			<a href="http://fanyi.baidu.com/?aldtype=16047#auto">百度翻译</a><span
				class="c_fnl">|</span><a
				href="http://www.youdao.com/?keyfrom=fanyi.copyright">有道翻译</a><span
				class="c_fnl">|</span><a href="http://translate.google.cn/">谷歌翻译</a><span
				class="c_fnl">|</span><a
				href="http://weibo.com/2452968251/profile?rightmod=1&wvr=6&mod=personinfo&is_all=1">我的博客</a>

			<p class="c_fcopyright">© 0.0</p>
		</div>
	</div>


	<script src="static/js/jquery.min.js"></script>
	<script src="static/js/main.js"></script>
</body>

</html>
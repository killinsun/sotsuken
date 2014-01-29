<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.safna.bean.UserBean"%>
<%
	UserBean uData = (UserBean) session.getAttribute("LOGIN_USER");
	String groupName = uData.getGroupName();
%>
<!DOCTYPE html>
<html>
<head>
<title>動画のアップロード</title>
<meta charset="utf-8">
<link rel="stylesheet" href="/safna/css/main.css" type="text/css">
<link rel="stylesheet" href="/safna/css/activity.css" type="text/css">
<link rel="shortcut icon" href="/safna/img/favicon.ico">
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="/safna/src/nav.js"></script>
<style type="text/css">
section#main {
	margin: 0 auto;
	margin-bottom: 50px;
	width: 1200px;
	height: 100%;
	float: left;
}
</style>
</head>
<body>
	<div id="container">
		<jsp:include page="..//menu.jsp" />
		<section id="mainContainer">
			<section id="main">
				<h1>CM大会 動画のアップロード</h1>
				<div id="wrapper">
					<form method="POST" enctype="multipart/form-data" action="/safna/UploadFileServlet">
						<input type="hidden" name="hiddenData" value="cmUpload">
						<table class="Table1 cmForm">
							<tr>
								<th>団体名</th>
								<td><%=groupName%></td>
							</tr>
							<tr>
								<th>アップロードする動画</th>
								<td><input type="file" id="uploadMovie" name="upFile" accept="movie"></td>
							</tr>
							<tr>
								<th>メッセージ</th>
								<td><textarea name="cmMessage" id="cmMessage" rows="4" cols="20"></textarea></td>
							</tr>
							<tr>
								<td colspan="2"><input type="submit" value="投稿する"
									id="uploadSubmit"></td>
						</table>
					</form>
				</div>
			</section>
		</section>
		<footer>
			<p>
				<small>Copyright&copy; 2013 Kill_In_Sun All rights reserved</small>
			</p>
		</footer>
	</div>
</body>
</html>
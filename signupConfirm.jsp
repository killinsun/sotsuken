<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.safna.bean.ConfirmBean"%>
<% HttpSession s = request.getSession(); 
   ConfirmBean uData = (ConfirmBean)s.getAttribute("SIGNUPDATA");	%>

<!DOCTYPE html>
<html>
<head>
<title>確認</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/main.css" type="text/css">
<link rel="shortcut icon" href="img/favicon.ico">
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="src/nav.js"></script>
<script src="src/signup.js"></script>
</head>
<body>
	<div id="container">
		<jsp:include page="menu.jsp" />
		<section id="mainContainer">
			<section id="main">
				<h1>ユーザー登録</h1>
				この内容でよろしいですか？<br/>
				<form  id="userForm" action="/safna/ConfirmServlet" method="POST">
					<table class="Table1 signup" width="600px">
						<colgroup span="1" class="midashi">
						<tr>
							<th>名前:</th>
							<td><%= uData.getUserName() %></td>
						</tr>
						<tr>
							<th>学籍番号:</th>
							<td><%= uData.getUserId()%></td>
						</tr>
						<tr>
							<th>パスワード:</th>
							<td>●●●●●●</td>
						</tr>
						<tr>
							<th>（確認):</th>
							<td>●●●●●●</td>
						</tr>
						<tr height="30px">
							<td></td>
							<td></td>
						</tr>
						<tr>
							<th>生年月日:</th>
							<td><%= uData.getBirthDay() %></td>
						</tr>
						<tr>
							<th>クラス</th>
							<td><%= uData.getUserClass() %></td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" value="確認" id="signupSubmit"></td>
						</tr>
					</table>
				</form>
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


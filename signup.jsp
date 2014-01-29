<% HttpSession s = request.getSession(); %>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>ユーザー登録</title>
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
				<%= s.getAttribute("ERROR") %>
				<form  id="userForm" action="/safna/SignupServlet" method="POST" >
					<table class="Table1 signup" width="600px">
						<colgroup span="1" class="midashi">
						<tr>
							<th>名前:</th>
							<td><input type="text" name="commonName" autofocus required>
						</tr>
						<tr>
							<th>学籍番号:</th>
							<td><input type="text" id="departId" name="departId" required>
						</tr>
						<tr>
							<th>パスワード:</th>
							<td><input type="password" name="password" required>
						</tr>
						<tr>
							<th>（確認):</th>
							<td><input type="password" name="password2" required>
						</tr>
						<tr height="30px">
							<td></td>
						<tr>
							<th>生年月日:</th>
							<td><input type="date" name="birthday" required>
						</tr>
						<tr>
							<th>学年:</th>
							<td><select name="schoolYear" id="schoolYear">
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="T">教員</option>
							</select></td>
						</tr>
						<tr>
							<th>学科:</th>
							<td><select name="Department" id="Department">
									<option value="j">J/情報処理科</option>
									<option value="g">G/ITエンジニア科</option>
									<option value="n">N/情報ネットワーク科</option>
									<option value="f">F/ビジネスライセンス科</option>
									<option value="w">W/Webクリエイター科</option>
							</select></td>
						</tr>
						<tr>
							<th>クラス:</th>
							<td><select name="Class" id="Class">
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
							</select></td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" value="登録" id="signupSubmit"></td>
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


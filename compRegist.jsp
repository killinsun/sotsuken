<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>ユーザー登録の完了</title>
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
				登録が完了しました<br/>
				<p>
					おめでとうございます！ safnaのデータベースへの登録が完了しました!<br />
					<a href="/safna/">トップページへ戻り、ログインする。</a>
				</p>
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


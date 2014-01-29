<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>写真集</title>
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
	width: 900px;
	height: 100%;
	float: left;
}

section#mainContainer img {
	clear: both;
}
</style>
</head>
<body>
	<!-- header -->
	<div id="container">
		<jsp:include page="..//menu.jsp" />
		<section id="mainContainer">
			<section id="main">
				<h1>CM大会 動画のアップロード完了</h1>
				<div id="wrapper">
					<p>
						動画のアップロードが完了しました。<br/>
						<a href="/safna/activity/cm.jsp">動画一覧へ戻る</a>
					</p>
				</div>
			</section>
			<article>
				<h1>エントリ</h1>
				<ul>
					<li>3G1 - ユニバーサル小野沢じゃぱん</li>
				</ul>
			</article>

		</section>

		<footer>
			<p>
				<small>Copyright&copy; 2013 Kill_In_Sun All rights reserved</small>
			</p>
		</footer>
	</div>



</body>
</html>


<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.safna.bean.MovieBean"%>
<%@page import="java.util.ArrayList"%>
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
				<h1>CM大会 動画一覧</h1>
				<div id="wrapper">
					<input type="button" value="CM動画のアップロード" onClick="location.href='/safna/activity/cmUpload.jsp'">
					<form>
					<%
						ArrayList<MovieBean> mvList = (ArrayList<MovieBean>)session.getAttribute("MOVIE_DATA");
					
						for(MovieBean mvBean:mvList){
							out.print("<div class='cmbox'>");
							out.print("<h2>"+ mvBean.getGroupName() + "</h2>");
							out.print("<video src='/safna/data/movie/"+ mvBean.getFilePath() +"' controls preload='metadata'>動画を再生するにはHTML5に対応したブラウザが必要です</video>");
							out.print("<h3>メッセージ</h3>");
							out.print("<p>"+mvBean.getMessage()+"</p>");
							out.print("<div class='vote'>");
							out.print("<input type='submit' value='投票する!'>");
							out.print("</div>");
							out.print("</div>");
						}
					%>
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


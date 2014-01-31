<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.safna.bean.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<title>safna</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/main.css" type="text/css">
<link rel="shortcut icon" href="img/favicon.ico">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
<script src="src/nav.js"></script>
</head>
<body>
	<!-- header -->
	<div id="container">
		<jsp:include page="/menu.jsp" />
		<section id="mainContainer">
			<img src="img/biglogo.png" alt="拡大ロゴ" id="biglogo">
			<%
				UserBean loginUser = (UserBean) session.getAttribute("LOGIN_USER");
				if (loginUser != null) {
					String username = loginUser.getUserName();
					String groupname = loginUser.getGroupName();
			%>
			<div id="mainInfo">
				<h1>
					ようこそ！<%=username%>さん！
				</h1>
				<p>
					safnaを使って最高の学園祭を創り上げましょう。<br />
				</p>
				<% if(loginUser.getGroupId().equals("")){ %>
					<label class="error" >
						団体情報が取得できていないか、<br/>どの団体にも所属していません。<br/>
						学園祭委員に報告するか、<br/>システム管理者に問い合わせてください<br/>
						有志団体のみ所属の場合は<a href="/safna/UserProfileServlet?type=0">こちら</a>
					</label>
				<% }else{ %>
						<table class="Table1" id="userDataTable">
							<tr>
								<th>名前</th>
								<td><%= username %></td>
							</tr>
							<tr>
								<th>現在ログインしている団体</th>
								<td><%= groupname %></td>
							</tr>
						</table>
				<% } %>
			</div>
			<%
				} else {
			%>
			<div id="mainLoginForm">
				<form method="POST" action=/safna/LoginServlet">
					ID<br /> <input type="text" id="id" required pattern="[a-z][A-Z]"><br />
					Password<br /> <input type="password" id="password" required pattern="[a-z][A-Z]"><br />
					<p class="error">
						<%
							String errormessage = (String) session.getAttribute("ERROR_LOGIN");
							if(errormessage != null){
									out.print(errormessage);
							}
						%>
					</p><br />
					<input type="submit" value="Login">
				</form>
				<p id="signuparea">
					<a href="/safna/signup.jsp">ユーザー登録</a>
				</p>
			</div>

			<%
				}
			%>
			<section id="main">
				<h1>safnaとは</h1>
				<p>
					safnaは、アイスランド語で「集まる/集める」という意味があります。<br />
					今までバラバラだった船橋情報ビジネス専門学校の若幸祭での活動を、一つに集め、<br />
					お客さんも集めようという願いが込められています。
				</p>
				<%
					if (loginUser != null) {
					} else {
				%>
				<h1>ユーザー登録</h1>
				<p>
					<a href="/safna/signup.jsp">こちらから</a>ユーザー登録を行ってください。<br />
					すぐにsafnaの魅力を体験できます。
				</p>
				<%
					}
				%>
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


<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.safna.bean.UserBean"%>
<%@page import="jp.ac.fjb.safna.bean.UserGroupBean"%>
<%@page import="java.util.ArrayList"%>
<%
	UserBean uData = (UserBean) session.getAttribute("LOGIN_USER");
	ArrayList<UserGroupBean> gbList = (ArrayList<UserGroupBean>) session
			.getAttribute("GROUP_LIST");
%>
<!DOCTYPE html>
<html>
<head>
<title>個人プロファイルの設定</title>
<meta charset="utf-8">
<link rel="stylesheet" href="/safna/css/main.css" type="text/css">
<link rel="stylesheet" href="/safna/css/setting.css" type="text/css">
<link rel="shortcut icon" href="img/favicon.ico">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
<script src="/safna/src/nav.js"></script>
</head>
<body>
	<div id="container">
		<jsp:include page="..//menu.jsp" />
		<section id="mainContainer">
			<section id="main">
				<h1>個人プロファイルの設定</h1>
				<form>
					<table class="Table1" width="1000px">
						<tr>
							<th>ユーザーID</th>
							<td><%=uData.getUserId()%></td>
						</tr>
						<tr>
							<th>パスワード</th>
							<td><input type="password" id="password"></td>
						</tr>
						<tr>
							<th>パスワード(確認)</th>
							<td><input type="password" id="password2"></td>
						</tr>
						<tr>
							<th>氏名</th>
							<td><input type="text" id="userName"
								value="<%=uData.getUserName()%>"></td>
						</tr>
						<tr>
							<th>生年月日</th>
							<td><input type="date" id="birthday"
								value="<%=uData.getBirthDay()%>"></td>
						</tr>
						<tr>
							<th>クラス</th>
							<td><%=uData.getUserClass()%></td>
						</tr>
						<tr>
							<th>現在設定している団体</th>
							<td><%=uData.getGroupName()%></td>
						</tr>
						<tr>
							<th>権限</th>
							<td><%=uData.getPermit()%></td>
						</tr>
					</table>
					<input type="submit" value="変更">
				</form>
				<h1>所属している団体を変更する</h1>
				<table class="Table1" width="1000px">
					<tr>
						<th>団体ID</th>
						<th>団体名</th>
						<th>責任者</th>
						<th>カテゴリ</th>
						<th>あなたの権限</th>
					</tr>
					<%
						for (UserGroupBean gb : gbList) {
							out.print("<tr>");
							out.print("<td><a href='/safna/UserProfileServlet?type=1&groupId="+gb.getGroupId()+"'>" + gb.getGroupId() + "</a></td>");
							out.print("<td>" + gb.getGroupName() + "</td>");
							out.print("<td>" + gb.getLeaderId() + "</td>");
							out.print("<td>" + gb.getGroupCategory() + "</td>");
							out.print("<td>" + gb.getPermit() + "</td>");
							out.print("</tr>");
						}
					%>
				</table>
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

<%
	session.setAttribute("GROUP_LIST",null);
%>

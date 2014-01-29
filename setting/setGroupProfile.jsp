<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.safna.bean.UserBean"%>
<%@page import="jp.ac.fjb.safna.bean.GroupBean"%>
<%@page import="java.util.ArrayList"%>
<%	UserBean uData = (UserBean)session.getAttribute("LOGIN_USER");
	GroupBean gData = (GroupBean)session.getAttribute("LOGIN_GROUP");
	ArrayList<String[]> dataList = (ArrayList<String[]>)session.getAttribute("GROUP_MEMBER");
	%>
<!DOCTYPE html>
<html>
<head>
<title>団体プロファイルの設定</title>
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
		<jsp:include page="../menu.jsp" />
		<section id="mainContainer">
			<section id="main">
				<h1>団体プロファイルの設定</h1>
				<form action="/safna/GroupProfileServlet" method="POST">
					<table class="Table1" width="1000px">
						<tr>
							<th>団体名</th>
							<td><input type="text" name="groupName" value="<%= uData.getGroupName() %>"></td>
						</tr>
						<tr>
							<th>団体カテゴリ</th>
							<td><%= gData.getGroupCategory()%></td>
						</tr>
						<tr>
							<th>団体責任者</th>
							<td><%= gData.getLeaderId() %></td>
						</tr>
						<tr>
							<th>ユーザーの追加</th>
							<td>
								<textarea name="addUsers" id="addUsers"></textarea><br/>
								追加するユーザーID（学籍番号）を<b>カンマ区切りで</b>入力してください
							</td>
						</tr>
					</table>
					<input type="submit" value="変更">
				</form>
				<h1><%= uData.getGroupName() %>に所属しているメンバー</h1>
				<table class="Table1" width="600px">
					<tr>
						<th>ユーザID</th>
						<th>氏名</th>
						<th>権限</th>
					</tr>
					<%
						for(String[] data:dataList){
							out.print("<tr>");
							out.print("<td>"+data[0]+"</td>");
							out.print("<td>"+data[1]+"</td>");
							out.print("<td>"+data[2]+"</td>");
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
	session.setAttribute("LOGIN_GROUP",null);
	session.setAttribute("GROUP_MEMBER",null);
%>
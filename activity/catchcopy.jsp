<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.safna.bean.CpBean"%>
<%@page import="jp.ac.fjb.safna.bean.UserBean"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<title>キャッチコピーの投稿</title>
<meta charset="utf-8">
<link rel="stylesheet" href="/safna/css/main.css" type="text/css">
<link rel="stylesheet" href="/safna/css/activity.css" type="text/css">
<link rel="shortcut icon" href="/safna/img/favicon.ico">
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="/safna/src/nav.js"></script>
</head>
<body>
	<div id="container">
		<jsp:include page="..//menu.jsp" />
		<section id="mainContainer">
			<section id="main">

				<%
					UserBean uData = (UserBean)session.getAttribute("LOGIN_USER");
		      		boolean isExist = (Boolean)session.getAttribute("ISEXIST");	
		      		if(!isExist){
      			
		      	%>
				<section id="contribute">
					<h1>キャッチコピーの投稿</h1>
					<form action="/safna/CatchcopyServlet" method="POST">
					<div id="wrapper">
						<div id="gakkakurasu"><%= uData.getUserClass()%></div>
						<div id="catchcopy">
							<input type="text" size="80" name="catchcopy">
						</div>
						<div id="submit">
							<input type="submit">
						</div>
					</div>
					</form>
				</section>
				<%} %>
				<section id="catchcopyList">
					<h1>キャッチコピー一覧</h1>

					<table class="Table1">
						<tr>
							<th id="tableOfCp">キャッチコピー</th>
							<th id="tableOfClass">団体</th>
							<th id="tableOfVote">投票する</th>
							<th id="tableOfVoteNum">投票数(デバッグ)</th>
						</tr>
					<%
						ArrayList<CpBean> cpList = (ArrayList<CpBean>)session.getAttribute("CPDATA");	
						for(CpBean cb:cpList){
							out.print("<tr>");
							out.print("<td>"+ cb.getCatchCopy() + "</td>");
							out.print("<td>"+ cb.getGroupName() + "</td>");
							out.print("<td><a href='/safna/CatchcopyVoteServlet?cpId="+cb.getCpId()+"'>これに投票する</a></td>");
							out.print("<td>"+ cb.getVoteNum() + "</td>");
							out.print("</tr>");
						}
					
					%>
					</table>
				</section>
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
	session.setAttribute("CPDATA",null);
	session.setAttribute("ISEXIST",null);
%>
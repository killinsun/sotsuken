<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<title>マスターメンテナンス</title>
<meta charset="utf-8">
<link rel="stylesheet" href="/safna/css/main.css" type="text/css">
<link rel="stylesheet" href="/safna/css/setting.css" type="text/css">
<link rel="shortcut icon" href="img/favicon.ico">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
<script src="/safna/src/nav.js"></script>
<script src="/safna/src/setting.js"></script>
</head>
<body>
	<div id="container">
		<jsp:include page="..//menu.jsp" />
		<section id="mainContainer">
			<section id="main">
				<h1>マスターメンテナンス</h1>
				<section id="selectMenu">
					<form action="/safna/MaintServlet" method="GET">
						<select name="menuName">
							<option value="ユーザ">ユーザ</option>
							<option value="団体">団体</option>
							<option value="ユーザ管理">ユーザ管理</option>
							<option value="権限">権限</option>
							<option value="ニュース">ニュース</option>
							<option value="商品">商品</option>
							<option value="商品管理">商品管理</option>
							<option value="キャッチコピー">キャッチコピー</option>
							<option value="CM大会動画">CM大会動画</option>
							<option value="活動カテゴリ">活動カテゴリ</option>
							<option value="写真">写真</option>
						</select> <input type="submit">
					</form>
				</section>
				<form action="/safna/MaintChangeServlet" method="POST" id="dataForm">
					<table class="Table1" width="1000px">
						<% 
						if(session.getAttribute("DATALIST") != null){
							ArrayList<String[]> dataList = (ArrayList<String[]>)session.getAttribute("DATALIST");
							boolean flag=false;
							int j=0;
							for(String[] data:dataList){
								j++;
								out.print("<tr name='tableRow' id=" + j + ">");
								if(flag==false){
									for(int i=-1;i < data.length;i++){
										out.print("<th>");
										if(i ==-1){
											out.print("チェック");
										}else{
											out.print(data[i]);
										}
										out.print("</th>");
									}
									flag=true;
								}else{
									for(int i=-1;i < data.length;i++){
										out.print("<td>");
										if(i ==-1){
											out.print("<input type='checkbox' name='" + j +"'>");
										}else if(i ==0){
											out.print("<input class='formIDbutton' type='submit' value='" + data[i] +"'>");
										}else{
											out.print(data[i]);
										}
										out.print("</td>");
									}
								}
								out.print("</tr>");
							}
							flag=false;
						}
					%>
	
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


<%
	session.setAttribute("DATALIST",null);
%>
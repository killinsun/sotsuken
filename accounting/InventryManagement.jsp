<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.safna.bean.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<title>在庫管理画面</title>
<meta charset="utf-8">
<link rel="stylesheet" href="/safna/css/main.css" type="text/css">
<link rel="stylesheet" href="/safna/css/accounting.css" type="text/css">
<link rel="shortcut icon" href="/safna/img/favicon.ico">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
<script src="/safna/src/nav.js"></script>
</head>
<body>
	<div id="container">
		<jsp:include page="..//menu.jsp" />
		<section id="mainContainer">
			<section id="main">
				<h1>在庫管理</h1>

				<table class="Table1" width="1000px">
					<tr>
						<th>商品ID</th>
						<th>商品名</th>
						<th>カテゴリ</th>
						<th>原価</th>
						<th>定価</th>
						<th>売価</th>
						<th>現在在庫</th>
						<th>販売数</th>
						<th>売上金額</th>
					</tr>
					<%
						ArrayList<ProductBean> pbList = (ArrayList)session.getAttribute("PRODUCT_DATA");		
						for(ProductBean pb:pbList){
							out.print("<tr>");
							out.print("<td><a href='/safna/ProductViewServlet?code="+pb.getCode()+"'>"+pb.getCode()+"</a></td>");
							out.print("<td>"+pb.getName()+"</td>");
							out.print("<td>"+pb.getCategory()+"</td>");
							out.print("<td>"+pb.getGenka()+"</td>");
							out.print("<td>"+pb.getTeika()+"</td>");
							out.print("<td>"+pb.getBaika()+"</td>");
							out.print("<td><progress min='0' max='"+pb.getKosu()+"' value='"+pb.getGenzai()+"'></progress>"+pb.getGenzai()+"</td>");
							out.print("<td><progress min='0' max='"+pb.getKosu()+"' value='"+pb.getHanbai()+"'></progress>"+pb.getHanbai()+"</td>");
							out.print("<td>"+pb.getBaika() * pb.getHanbai()+"</td>");
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
	session.setAttribute("PRODUCT_DATA",null);
	session.setAttribute("CATEGORY_DATA",null);
%>

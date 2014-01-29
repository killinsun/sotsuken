<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.safna.bean.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<title>レジ</title>
<meta charset="utf-8">
<link rel="stylesheet" href="/safna/css/main.css" type="text/css">
<link rel="stylesheet" href="/safna/css/accounting.css" type="text/css">
<link rel="shortcut icon" href="/safna/img/favicon.ico">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
<script src="/safna/src/jquery-ui-1.10.3.custom.js"></script>
<script src="/safna/src/nav.js"></script>
<script src="/safna/src/accounting.js"></script>
<script src="/safna//src/common.js"></script>
<% ArrayList<ProductBean> pbList = (ArrayList)session.getAttribute("PRODUCT_DATA");
	String jsonString = (String)session.getAttribute("PRODUCT_JSON");
%>
<script>
	var jsonString = <%= jsonString %>;
</script>
</head>
<body>
	<div id="container">
		<jsp:include page="../menu.jsp" />
		<section id="mainContainer">
			<section id="goodsSelect">
				<h1>レジー商品選択</h1>
			<%
				int i=-1;
				for(ProductBean pb:pbList){
					i++;
			%>
				<!-- 一つの区切り -->
				<div class="goods" id="<%= i %>">
					<div class="close target">x</div>
					<div class="target dummy">
						<div class="goodsName" id="<%= pb.getCode() %>" >
							<%= pb.getName() %>
						</div>
						<div class="count">0</div>
					</div>
				</div>
				<!-- =========== -->
				<% } %>
			</section>
			<section id="cart">
				<h1>カート</h1>
				<div id="cartList">
					商品名-小計
					<ul>
					</ul>
				</div>
				<div id="buttonArea" class="target">会計へ</div>
			</section>
		</section>
		<footer>
			<p>
				<small>Copyright&copy; 2013 Kill_In_Sun All rights reserved</small>
			</p>
		</footer>

		<div id="accountingPage">
			<div id="backButton" class="target">→</div>
			<div id="accountingTable">
				<div id="toOverflow">
					<table id="tableBody">
						<tr id="midashi">
							<th>商品名</th>
							<th>単価</th>
							<th>個数</th>
							<th>金額</th>
						</tr>
						<tr class="common">
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
					</table>
				</div>
				<table id="tableBottom">
					<tr id="amount">
						<td colspan="3"></td>
						<td id="amountArea"></td>
					</tr>
					<tr id="inputAmountLuggage">
						<td colspan="3">お預かり</td>
						<td><input type="number" id="luggage" autofocus required></td>
					</tr>
					<tr id="amountLuggage">
						<td colspan="3">お預かり</td>
						<td id="amountLuggageArea"></td>
					</tr>
					<tr id="fishing">
						<td colspan="3">お釣り</td>
						<td id="fishingArea"></td>
					</tr>
				</table>
			</div>
			<div id="commitButton" class="target">確定</div>
		</div>

	</div>
	<form action="/safna/AccountingServlet" method="POST" name="commitForm">
		<input type="hidden" name="hiddenParm">
	</form>



</body>
</html>



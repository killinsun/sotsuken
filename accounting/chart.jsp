<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.safna.bean.ChartBean"%>
<%@page import="java.util.ArrayList"%>
<%
	ArrayList<ChartBean> cbList = (ArrayList) session
			.getAttribute("CHART_DATA");
	ArrayList<String> productNameList = new ArrayList<String>(); //商品名を格納する
	for (ChartBean cb : cbList) {

		//既に同じ名前の商品名がある場合は登録しない
		if (productNameList.indexOf(cb.getName()) == -1) { //-1の場合はproductNameListのインデックス上に無いことを表す
			productNameList.add(cb.getName());
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<title>商品登録画面</title>
<meta charset="utf-8">
<link rel="stylesheet" href="/safna/css/main.css" type="text/css">
<link rel="shortcut icon" href="/safna/img/favicon.ico">
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="/safna/src/nav.js"></script>
</head>
<body>
	<div id="container">
		<jsp:include page="..//menu.jsp" />
		<section id="mainContainer">
			<section id="main">
				<h1>チャート</h1>
				<form>
					<p>
						<select name="charts">
							<option value="uriage">売上</option>
							<option value="kokyaku">顧客</option>
						</select> <input type="submit" value="変更">
					</p>
					<section id="chartImg">
						<img
							src="http://chart.apis.google.com/chart?
chtt=商品別売上高
&chdl=<%for (String n : productNameList) {
				out.print(n + "|");
			}%>
&chs=500x300
&chd=t:<%for (ChartBean cb : cbList) {

			}%>

10,20,30,40,50,60,70,80,90,20
&cht=bvs
&chco=ff0000,00ff00
&chxt=x,y
        ">
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


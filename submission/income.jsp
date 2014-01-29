<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>収支報告書の提出</title>
<meta charset="utf-8">
<link rel="stylesheet" href="../css/main.css" type="text/css">
<link rel="stylesheet" href="../css/submission.css" type="text/css">
<link rel="shortcut icon" href="../img/favicon.ico">
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="../src/nav.js"></script>
<script src="../src/submission.js"></script>
<style type="text/css">
div#registForm {
	margin: 0 auto;
	width: 1000px;
	height: auto;
}

section#main {
	width: 1200px;
}
</style>
</head>
<body>
	<div id="container">
		<jsp:include page="..//menu.jsp" />
		<section id="mainContainer">
			<section id="main">
				<h1>収支報告書の提出</h1>
				<div id="registForm">
					<form onsubmit="return false" name="calc">
						<div id="registantArea">
							<table class="Table1" id="groupInfo">
								<tr>
									<th>クラス</th>
									<td>3G1</td>
									<th>団体名</th>
									<td>ユニバーサル小野沢じゃぱん</td>
									<th>日付</th>
									<td>%date</td>
								</tr>
							</table>
						</div>
						<div id="minibox">
							<table class="Table1" id="accountInfo">
								<tr>
									<th>売上</th>
									<td><input type="number" id="miniboxEarnings" required></td>
								</tr>
								<tr>
									<th>材料費</th>
									<td><input type="number" id="miniboxMaterial" required></td>
								</tr>
								<tr>
									<th>純利益</th>
									<td><input type="number" id="miniboxNetIncome" required></td>
								</tr>
							</table>
							<div id="materialBox">
								<table class="Table1 edit-table" width="1000px">
									<colgroup span="1" class="thDate"></colgroup>
									<colgroup span="1" class="thPlace"></colgroup>
									<colgroup span="1" class="thItem"></colgroup>
									<colgroup span="1" class="thNum"></colgroup>
									<colgroup span="1" class="thAmount"></colgroup>
									<tr>
										<th>日付</th>
										<th>購入場所</th>
										<th>品物</th>
										<th>数量</th>
										<th>金額</th>
									</tr>
									<tr>
										<td class="aaa"></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
									</tr>
									<tr>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
									</tr>
									<tr>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
									</tr>
									<tr>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
									</tr>
									<tr id="materialSum">
										<th colspan="4">材料費合計</th>
										<th><output name="materialSumOutput">0</output></th>
									</tr>
								</table>
							</div>
							<div id="earningsBox">
								<table class="Table1 edit-table" width="400px">
									<tr>
										<th>商品名</th>
										<th>単価</th>
										<th>販売数</th>
										<th>金額</th>
									</tr>
									<tr>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
									</tr>
									<tr>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
									</tr>
									<tr>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
									</tr>
									<tr>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
									</tr>
									<tr id="earningsSum">
										<th colspan="3">売上合計</th>
										<th><output name="earningsSumOutput">0</output></th>
									</tr>
								</table>
							</div>
							<div id="buttonArea">
								<input type="submit" value="提出" id="incomeSubmit">
							</div>
					</form>

				</div>
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


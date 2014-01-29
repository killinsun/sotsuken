<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>見積書の提出</title>
<meta charset="utf-8">
<link rel="stylesheet" href="../css/main.css" type="text/css">
<link rel="stylesheet" href="../css/submission.css" type="text/css">
<link rel="shortcut icon" href="../img/favicon.ico">
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="../src/nav.js"></script>
<script src="../src/estimate.js"></script>
</head>
<body>
	<div id="container">
		<jsp:include page="..//menu.jsp" />
		<section id="mainContainer">
			<section id="main">
				<h1>見積書の提出</h1>
				<div id="registForm">
					<form onsubmit="return false" name="calc">
						<table class="Table1">
							<tr>
								<th>団体責任者:
								</td>
								<td>竹内涼太</td>
							</tr>
							<tr>
								<th>団体名:
								</td>
								<td>ユニバーサルおのざわジャパン
							</tr>
							<tr>
								<th>販売予定商品:
								</td>
								<td><textarea name="goods1" cols="45" rows="2"></textarea></td>
							</tr>
							<tr>
								<th>販売予定商品2:
								</td>
								<td><textarea name="goods1" cols="45" rows="2"></textarea></td>
							</tr>
						</table>
						<div id="costTables">
							<table id="MaterialTable" class="Table2">
								<tr>
									<th colspan="4">材料費</th>
								</tr>
								<tr>
									<th>品名</th>
									<th>単価</th>
									<th>個数</th>
									<th>金額</th>
								</tr>
								<tr>
									<td><input size="30" type="text"></td>
									<td><input type="number" name="price1_1" id="price1_1"
										value="0" oninput="formCalc(1,1)"></td>
									<td><input type="number" name="numArt1_1" id="numArt1_1"
										value="0" oninput="formCalc(1,1)"></td>
									<td><output name="amount1_1" for="price1_1 numArt1_1">0</output></td>
								</tr>
								<tr>
									<td><input size="30" type="text"></td>
									<td><input type="number" name="price1_2" id="price1_2"
										value="0" oninput="formCalc(1,2)"></td>
									<td><input type="number" name="numArt1_2" id="numArt1_2"
										value="0" oninput="formCalc(1,2)"></td>
									<td><output name="amount1_2" for="price1_2 numArt1_2">0</output></td>
								</tr>
								<tr>
									<td><input size="30" type="text"></td>
									<td><input type="number" name="price1_3" id="price1_3"
										value="0" oninput="formCalc(1,3)"></td>
									<td><input type="number" name="numArt1_3" id="numArt1_3"
										value="0" oninput="formCalc(1,3)"></td>
									<td><output name="amount1_3" for="price1_3 numArt1_3">0</output></td>
								</tr>
								<tr>
									<td colspan="2"></td>
									<th>小計</th>
									<td><output name="subTotal1" for="amount*">0</output></td>
								</tr>
							</table>

							<table id="CostTable" class="Table2">
								<tr>
									<th colspan="4">設備費</th>
								</tr>
								<tr>
									<th>品名</th>
									<th>単価</th>
									<th>個数</th>
									<th>金額</th>
								</tr>
								<tr>
									<td><input size="30" type="text"></td>
									<td><input type="number" name="price2_1" id="price2_1"
										value="0" oninput="formCalc(2,1)"></td>
									<td><input type="number" name="numArt2_1" id="numArt2_1"
										value="0" oninput="formCalc(2,1)"></td>
									<td><output name="amount2_1" for="price2_1 numArt2_1">0</output></td>
								</tr>
								<tr>
									<td><input size="30" type="text"></td>
									<td><input type="number" name="price2_2" id="price2_2"
										value="0" oninput="formCalc(2,2)"></td>
									<td><input type="number" name="numArt2_2" id="numArt2_2"
										value="0" oninput="formCalc(2,2)"></td>
									<td><output name="amount2_2" for="price2_2 numArt2_2">0</output></td>
								</tr>
								<tr>
									<td><input size="30" type="text"></td>
									<td><input type="number" name="price2_3" id="price2_3"
										value="0" oninput="formCalc(2,3)"></td>
									<td><input type="number" name="numArt2_3" id="numArt2_3"
										value="0" oninput="formCalc(2,3)"></td>
									<td><output name="amount2_3" for="price2_3 numArt2_3">0</output></td>
								</tr>
								<tr>
									<td colspan="2"></td>
									<th>小計</th>
									<td><output name="subTotal2" for="amount*">0</output></td>
								</tr>
							</table>
							<table id="DecorationTable" class="Table2">
								<tr>
									<th colspan="4">装飾費</th>
								</tr>
								<tr>
									<th>品名</th>
									<th>単価</th>
									<th>個数</th>
									<th>金額</th>
								</tr>
								<tr>
									<td><input size="30" type="text"></td>
									<td><input type="number" name="price3_1" id="price3_1"
										value="0" oninput="formCalc(3,1)"></td>
									<td><input type="number" name="numArt3_1" id="numArt3_1"
										value="0" oninput="formCalc(3,1)"></td>
									<td><output name="amount3_1" for="price3_1 numArt3_1">0</output></td>
								</tr>
								<tr>
									<td><input size="30" type="text"></td>
									<td><input type="number" name="price3_2" id="price3_2"
										value="0" oninput="formCalc(3,2)"></td>
									<td><input type="number" name="numArt3_2" id="numArt3_2"
										value="0" oninput="formCalc(3,2)"></td>
									<td><output name="amount3_2" for="price3_2 numArt3_2">0</output></td>
								</tr>
								<tr>
									<td><input size="30" type="text"></td>
									<td><input type="number" name="price3_3" id="price3_3"
										value="0" oninput="formCalc(3,3)"></td>
									<td><input type="number" name="numArt3_3" id="numArt3_3"
										value="0" oninput="formCalc(3,3)"></td>
									<td><output name="amount3_3" for="price3_3 numArt3_3">0</output></td>
								</tr>
								<tr>
									<td colspan="2"></td>
									<th>小計</th>
									<td><output name="subTotal3" for="amount*">0</output></td>
								</tr>
							</table>
							<div class="clear"></div>

							<table id="totalTable" class="Table2 Table3">
								<tr>
									<th>合計</th>
									<td><output name="Total" for="subTotal1-3">0</output></td>
								</tr>
							</table>
							<div class="clear"></div>
							<div id="submit">
								<input type="submit" value="送信">
							</div>
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


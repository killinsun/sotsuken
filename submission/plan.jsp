<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>企画書の提出</title>
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
				<h1>企画書の提出</h1>
				<form onsubmit="return false" name="calc">
					<table class="Table1">
						<colgroup span="1" class="midashi"></colgroup>
						<colgroup span="1" width="100px"></colgroup>
						<tr>
							<th rowspan="2">団体責任者:</th>
							<td><select name="subject" id="subject" required>
									<option value="ITエンジニア科">ITエンジニア科</option>
									<option value="情報処理科">情報処理科</option>
									<option value="情報ネットワーク科">情報ネットワーク科</option>
									<option value="ビジネスライセンス科">ビジネスライセンス科</option>
									<option value="WEBクリエイター科">WEBクリエイター科</option>
							</select></td>
							<td><select name="year" id="year" required>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
							</select> 年</td>
							<td><select name="class" id="class" required>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
							</select> 組</td>
						</tr>
						<tr>
							<th>氏名:</th>
							<td colspan="2"><input size="30" type="text" name="leader"
								autofocus required></td>
						</tr>
						<tr>
							<th>団体名:</th>
							<td colspan="3"><input size="100" type="text" name="group"
								required>
						</tr>
						<tr>
							<th>クラス人数:</th>
							<td colspan="3"><input type="number" max="50" min="0"
								id="memberNum"></td>
						</tr>
						<tr>
							<th>場所:</th>
							<td colspan="3"><select name="place" id="place" required>
									<option value="aaa">aaaa</option>
									<option value="bbb">bbbb</option>
									<option value="ccc">cccc</option>
									<option value="ddd">dddd</option>
							</select></td>
						</tr>
						<tr>
							<th>企画内容:</th>
							<td colspan="3"><textarea id="plan" name="plan" cols="75"
									rows="10"></textarea></td>
						</tr>
						<tr>
							<th>使用するレンタル器材:</th>
							<td colspan="2">外部から</br> <select name="rental" id="rental"
								multiple>
									<option value="aaa">aaaa</option>
									<option value="bbb">bbbb</option>
									<option value="ccc">cccc</option>
									<option value="ddd">dddd</option>
							</select>
							</td>
							<td>団体持参</br> <textarea id="bring" name="bring" cols="40"
									rows="4"></textarea>
							</td>
						</tr>
						<tr>
							<th>使用したい構内設備や機材</th>
							<td colspan="3"><select size="7" id="fjbRental"
								name="fjbRental" multiple>
									<option value="aaa">aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</option>
									<option value="bbb">bbbb</option>
									<option value="ccc">cccc</option>
									<option value="ddd">dddd</option>
									<option value="ddd">dddd</option>
									<option value="ddd">dddd</option>
									<option value="ddd">dddd</option>
							</select></td>
						</tr>
						<tr>
							<th>仮申請</th>
							<td colspan="3"><input type="submit" value="仮申請"></td>
						</tr>

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


<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>提出状況の確認</title>
<meta charset="utf-8">
<link rel="stylesheet" href="../css/main.css" type="text/css">
<link rel="stylesheet" href="../css/submission.css" type="text/css">
<link rel="shortcut icon" href="../img/favicon.ico">
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="../src/nav.js"></script>
</head>
<body>
	<div id="container">
		<jsp:include page="..//menu.jsp" />
		<section id="mainContainer">
			<section id="main">
				<h1>各団体の提出状況の確認</h1>

				<table class="Table1" id="info">
					<tr>
						<td class="checked">Checked</td>
						<td class="noChecked">No checked</td>
						<td>No submission</td>
					</tr>
				</table>
				<table class="Table1" id="submissionCheck">
					<!-- <tr>セクションがひとつのログとなっているので、jspで繰り返し取得して表示する -->
        <!-- 書類の提出状況、チェックの状況を読み取り、状況によって◯か-の出力、<td>タタグのクラスの指定をする -->
        <colgroup>
          <col span="3">
          <col span="3" class="documents">
        <tr>
          <th>団体ID</th>
          <th>団体名</th>
          <th>運営</th>
          <th>企画書</th>
          <th>見積書</th>
          <th>収支報告書</th>
        </tr>
        <tr>
          <td>dt001</td>
          <td>ユニバーサルおのざわじゃぱん</td>
          <td>3G1</td>
          <td class="checked">◯</td>
          <td class="checked">◯</td>
          <td class="checked">◯</td>
        </tr>
        <tr>
          <td>dt002</td>
          <td>BandsCollection2013</td>
          <td>有志団体</td>
          <td class="noChecked">◯</td>
          <td>-</td>
          <td>-</td>
        </tr>
        <tr>
          <td>dt003</td>
          <td>団体3</td>
          <td>主催元</td>
          <td>-</td>
          <td>-</td>
          <td>-</td>
        </tr>
        <tr>
          <td>dt003</td>
          <td>団体3</td>
          <td>主催元</td>
          <td>-</td>
          <td>-</td>
          <td>-</td>
        </tr>
        <tr>
          <td>dt003</td>
          <td>団体3</td>
          <td>主催元</td>
          <td>-</td>
          <td>-</td>
          <td>-</td>
        </tr>
        </table>
        
      </section>
    </section>
    
    <footer>
      <p><small>Copyright&copy;  2013 Kill_In_Sun All rights reserved</small></p>
    </footer>
  </div>



  </body>
</html>


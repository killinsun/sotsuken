<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>会計情報の確認</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="../css/main.css" type="text/css">
    <link rel="stylesheet" href="../css/accounting.css" type="text/css">
    <link rel="shortcut icon" href="../img/favicon.ico">
    <script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
    <script src="../src/nav.js"></script>
  </head>
  <body>
  <div id="container">
	<jsp:include page="..//menu.jsp" />   
    <section id="mainContainer">
      <section id="main">
        <h1>各団体の会計情報の確認</h1>
        
        <table class="Table1" width="1000px">
        <!-- <tr>セクションがひとつのログとなっているので、jspで繰り返し取得して表示する -->
        <tr>
          <th>団体ID</th>
          <th>団体名</th>
          <th>運営</th>
          <th>カテゴリ</th>
          <th>場所</th>
          <th>状況</th>
          <th>ログ</th>
          <th>チャート</th>
        </tr>
        <tr class="deficit">
          <td>dt001</td>
          <td>ユニバーサルおのざわじゃぱん</td>
          <td>3G1</td>
          <td>縁日・販売</td>
          <td>204</td>
          <td>赤字</td>
          <td>詳細</td>
          <td>確認</td>
        </tr>
        <tr>
          <td>dt002</td>
          <td>BandsCollection2013</td>
          <td>有志団体</td>
          <td>軽音楽部ライブ</td>
          <td>５Fホール</td>
          <td>-</td>
          <td>-</td>
          <td>-</td>
        </tr>
        <tr>
          <td>dt003</td>
          <td>団体3</td>
          <td>主催元</td>
          <td>飲食</td>
          <td>場所</td>
          <td>黒字</td>
          <td>詳細</td>
          <td>確認</td>
        </tr>
        <tr>
          <td>dt004</td>
          <td>団体4</td>
          <td>主催元</td>
          <td>飲食</td>
          <td>場所</td>
          <td>黒字</td>
          <td>詳細</td>
          <td>確認</td>
        </tr>
        <tr>
          <td>dt005</td>
          <td>団体5</td>
          <td>主催元</td>
          <td>飲食</td>
          <td>場所</td>
          <td>黒字</td>
          <td>詳細</td>
          <td>確認</td>
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


<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>団体の追加</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="../css/main.css" type="text/css">
    <link rel="stylesheet" href="../css/setting.css" type="text/css">
    <link rel="shortcut icon" href="img/favicon.ico">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
    <script src="../src/nav.js"></script>
    <script src="../src/setting.js"></script>
  </head>
  <body>
  <div id="container">
	<jsp:include page="..//menu.jsp" />   
    <section id="mainContainer">
      <section id="main">
        <h1>団体の追加</h1>
        <form method="POST" action="/safna/GroupAddServlet">
          <datalist id="idType">
          </datalist>
          <table class="Table1 addGroupT edit-table" width="1000px">
            <tr>
              <th>団体名</th>
              <th>団体カテゴリ</th>
              <th>団体責任者</th>
            </tr>
            <tr>
              <td id="name001"><input type="text" name="groupName"></td>
              <td><select name="category"><option>クラス</option><option>有志</option></select></td>
              <td><input type="text" list="idType" autocomplete="on" name="leader"></td>
            </tr>
          </table>
          <input type="submit" value="送信">
        </form>
      </section>
    </section>
    
    <footer>
      <p><small>Copyright&copy;  2013 Kill_In_Sun All rights reserved</small></p>
    </footer>
  </div>



  </body>
</html>


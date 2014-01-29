<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.safna.bean.GroupBean"%>
<% HttpSession s = request.getSession(); 
   GroupBean gData = (GroupBean)s.getAttribute("ADD_G_CONFIRM");	%>

<!DOCTYPE html>
<html>
  <head>
    <title>追加する団体の確認</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="/safna/css/main.css" type="text/css">
    <link rel="stylesheet" href="/safna/css/setting.css" type="text/css">
    <link rel="shortcut icon" href="img/favicon.ico">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
    <script src="/safna/src/nav.js"></script>
    <script src="/safna/src/setting.js"></script>
  </head>
  <body>
  <div id="container">
	<jsp:include page="..//menu.jsp" />   
    <section id="mainContainer">
      <section id="main">
        <h1>この内容でよろしいですか？</h1>
        <form method="POST" action="/safna/GroupConfirmServlet">
          <datalist id="idType">
          </datalist>
          <table class="Table1 addGroupT edit-table" width="1000px">
            <tr>
              <th>団体名</th>
              <th>団体カテゴリ</th>
              <th>団体責任者</th>
            </tr>
            <tr>
              <td id="name001"><%= gData.getGroupName() %></td>
              <td><%= gData.getGroupCategory() %></td>
              <td><%= gData.getLeaderId() %></td>
            </tr>
          </table>
          <input type="submit" value="確認">
        </form>
      </section>
    </section>
    
    <footer>
      <p><small>Copyright&copy;  2013 Kill_In_Sun All rights reserved</small></p>
    </footer>
  </div>



  </body>
</html>


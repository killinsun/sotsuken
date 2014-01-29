<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.safna.bean.LogBean"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<title>商品登録画面</title>
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
				<h1>会計ログ</h1>

				<table class="Table1" width="1000px">
        <tr>
          <th>商品ID</th>
          <th>商品名</th>
          <th>カテゴリ</th>
          <th>売価</th>
          <th>個数</th>
          <th>売上金額</th>
          <th>時間</th>
        </tr>
				<%
					ArrayList<LogBean> lbList = (ArrayList<LogBean>)session.getAttribute("LOG_DATA");
					int goukei=0;
					for(LogBean lb:lbList){
						out.println("<tr>");
						out.println("<td>" + lb.getCode()+"</td>");
						out.println("<td>" + lb.getName()+"</td>");
						out.println("<td>" + lb.getCategoryName()+"</td>");
						out.println("<td>" + lb.getBaika()+"</td>");
						out.println("<td>" + lb.getCounter()+"</td>");
						out.println("<td>" + lb.getCounter() * lb.getBaika()+"</td>");
						out.println("<td>" + lb.getDate()+"</td>");
						out.println("</tr>");
						goukei = goukei + lb.getCounter() * lb.getBaika();
					}
					out.println("<tr>");
					out.println("<th>売上合計</th>");
					out.println("<td colspan='6' id='goukeiTd'>"+goukei+"</td>");
					out.println("</tr>");
				%>
        </table>
        
      </section>
    </section>
    
    <footer>
      <p><small>Copyright&copy;  2013 Kill_In_Sun All rights reserved</small></p>
    </footer>
  </div>



  </body>
</html>


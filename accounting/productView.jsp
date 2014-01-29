<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.safna.bean.ProductBean" %>
<%@page import="java.util.ArrayList" %>
<% 
	ArrayList<String> cateList= (ArrayList<String>)session.getAttribute("CATEGORY_DATA");
	ProductBean pb = (ProductBean)session.getAttribute("PRODUCT_DATA");
	%>
<!DOCTYPE html>
<html>
  <head>
    <title>商品情報変更画面</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="/safna/css/main.css" type="text/css">
    <link rel="stylesheet" href="/safna/css/accounting.css" type="text/css">
    <link rel="shortcut icon" href="/safna/img/favicon.ico">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
		<script src="/safna/src/jquery-ui-1.10.3.custom.js"></script>
    <script src="/safna/src/nav.js"></script>
    <script src="/safna/src/common.js"></script>
    <script src="/safna/src/accounting.js"></script>
  <style type="text/css">
    div#registForm{
      margin:0 auto;
      width:500px;
      height:auto;
    }
    section#main{
      width:800px;
    }
  </style>
  </head>
  <body>
  <div id="container">
	<jsp:include page="..//menu.jsp" />   
    <section id="mainContainer">
      <section id="main">
        <h1>商品情報変更</h1>
        <div id="registForm">
          <form name="syouhinform">
            <table class="Table1 registTable" width="600px">
            <tr>
              <th>商品コード:</th>
              <td>
								<%
			              out.print("<input size='30' type='text' id='sCode' name='sCode' value='"+pb.getCode()+"' autofocus disabled>");
           			%>
              		</td>
            </tr>
            <tr>
              <th>商品名:</th>
              <td>
              		<%
			              out.print("<input size='30' type='text' id='sName' name='sName' value='"+pb.getName()+"' autofocus required>");
									%>
       		  </td>
            </tr>
            <tr>
              <th>カテゴリ:</th>
              <td><select name="category" id="category">
              		<%
              			int i=0;
              			for(String data:cateList){
              				i++;
              				out.print("<option value='"+i+"'>"+data+"</option>");
              			}
              		%>
                  </select></td>
              <td><input type="button" value="追加" onClick="showAddCategory()"></td>
            </tr>
            <tr>
              <th>原価:</th>
              <td>
           		<%
	           			out.print("<input type='number' min='0' max='99999' id='fGenka' value='"+pb.getGenka()+"' required>");
        			%>

              </td>
            </tr>
            <tr>
              <th>定価:</th>
              <td>
           		<%
	           			out.print("<input type='number' min='0' max='99999' id='fTeika' value='"+pb.getTeika()+"' required>");
        			%>
            </tr>
            <tr>
              <th>売価:</th>
              <td>
           		<%
	           			out.print("<input type='number' min='0' max='99999' id='fBaika' value='"+pb.getBaika()+"' required>");
        			%>
        	  </td>
            </tr>
            <tr>
              <th>準備個数:</th>
              <td>
           		<%
	           			out.print("<input type='number' min='0' max='99999' id='fKosu' value='"+pb.getGenzai()+"' required>");
        			%>

              </td>
            </tr>
            <tr>
              <td colspan="2"><input type="button" value="登録" onClick="showConfirm();"></td>
            </tr>
            </table>
							<a href="/safna/ProductServlet?type=del&code=<%= pb.getCode() %>"> この商品を削除</a>
          </form>
        </div>
      </section>
    </section>
    
    <footer>
      <p><small>Copyright&copy;  2013 Kill_In_Sun All rights reserved</small></p>
    </footer>
  </div>
	<div id="confirm">
		<div id="backButton" class="target">
			→
		</div>
		<h1>この内容でよろしいですか？</h1>
			<table class="Table1 registTable" width="600px">
				<tr>
					<th>商品コード</th>
					<td id="code"></td>
				</tr>
				<tr>
					<th>商品名</th>
					<td id="shohinname"></td>
				</tr>
				<tr>
					<th>カテゴリ</th>
					<td id="kategori"></td>
				</tr>
				<tr>
					<th>原価</th>
					<td id="genka"></td>
				</tr>
				<tr>
					<th>定価</th>
					<td id="teika"></td>
				</tr>
				<tr>
					<th>売価</th>
					<td id="baika"></td>
				</tr>
				<tr>
					<th>現在個数</th>
					<td id="kosuu"></td>
				</tr>
			</table>
		<form name="hiddenForm" method="POST" action="/safna/ProductServlet">
			<input type="hidden" name="hiddenCode">
			<input type="hidden" name="hiddenName">
			<input type="hidden" name="hiddenCategory">
			<input type="hidden" name="hiddenGenka">
			<input type="hidden" name="hiddenTeika">
			<input type="hidden" name="hiddenBaika">
			<input type="hidden" name="hiddenKosu">
			<input type="submit" value="投稿">
			<input type="hidden" name="from" value="regist">
		</form>
	</div>

	<div id="addCategory">
		<div id="backButton2" class="target">
			→
		</div>
		<h1>新規カテゴリーの追加</h1>
		<form name="hiddenForm2" method="POST" action="/safna/RegistServlet">
			カテゴリ名:<input type="text" require name="inputCategoryName">
			<input type="submit" value="追加">
			<input type="hidden" name="hiddenCode">
			<input type="hidden" name="hiddenName">
			<input type="hidden" name="hiddenCategory">
			<input type="hidden" name="hiddenGenka">
			<input type="hidden" name="hiddenTeika">
			<input type="hidden" name="hiddenBaika">
			<input type="hidden" name="hiddenKosu">
			<input type="hidden" name="from" value="category">
		</form>
		<p>入力されたカテゴリー名は、全団体で共用ができます</p>
	</div>



  </body>
</html>
<%
	session.setAttribute("PRODUCT_DATA",null);
	session.setAttribute("CATEGORY_DATA",null);
%>

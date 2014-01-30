<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.safna.bean.ProductBean" %>
<%@page import="java.util.ArrayList" %>
<% 
	boolean flag;
	String[] inputData = null;
	inputData = (String[])session.getAttribute("INPUT_DATA"); 
	ArrayList<String> cateList= (ArrayList<String>)session.getAttribute("CATEGORY_DATA");
	%>
<!DOCTYPE html>
<html>
  <head>
    <title>商品登録画面</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="/safna/css/main.css" type="text/css">
    <link rel="stylesheet" href="/safna/css/accounting.css" type="text/css">
    <link rel="shortcut icon" href="/safna/img/favicon.ico">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
		<script src="/safna/src/jquery-ui-1.10.3.custom.js"></script>
    <script src="/safna/src/jquery.validate.js"></script>
    <script src="/safna/src/jquery.validate.japlugin.js"></script>
		<script type="text/javascript">
			jQuery.validator.addMethod(
				"customCheckCode",
					function(value,element){
						reg = new RegExp("^[0-9a-zA-Z]+$");
						return this.optional(element) || reg.test(value);
					},
				"商品コードは「半角英数字(a-z,A-Z,0-9)で入力してください."
			);
			$(document).ready(function(){
				$("#syouhinform").validate({
					//エラールール
					rules:{
						sCode:{
							required:true,
							maxlength:3,
							customCheckCode: true
						},
						sName:{
							required:true,
							maxlength:30
						},
						fGenka:{
							digits: true
						},
						fTeika:{
							digits: true
						},
						fBaika:{
							digits: true
						}
					},
					//表示メッセージ
					messages:{
						sCode:{
							required:"商品コードが入力されていません",
							maxlength:"コードは3文字以下です"
						},
						sName:{
							required:"名前の入力がされていません",
							maxlength:"商品名は30文字以下です"
						},
						fGenka:{
							required:"半角数字を入力してください"
						},
						fTeika:{
							required:"半角数字を入力してください"
						},
						fBaika:{
							required:"半角数字を入力してください"
						},
					}
				});
			});
		</script>
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
        <h1>商品登録</h1>
        <div id="registForm">
          <form name="syouhinform" id="syouhinform">
            <table class="Table1 registTable" width="600px">
            <tr>
              <th>商品コード:</th>
              <td>
              		<% if(inputData!=null){
              			out.print("<input type='text' id='sCode' name='sCode' autofocus required value='"+ inputData[0] +"'>");
              			}else{
			              out.print("<input size='30' type='text' id='sCode' name='sCode' autofocus required>");
              			}
           			%>
              		</td>
            </tr>
            <tr>
              <th>商品名:</th>
              <td>
              		<% if(inputData!=null){
              			out.print("<input size='30' type='text' id='sName' name='sName' autofocus required value='"+ inputData[1] +"'>");
              			}else{
			              out.print("<input size='30' type='text' id='sName' name='sName' autofocus required>");
              			}
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
           		<% if(inputData!=null){
	           			out.print("<input type='number' id='fGenka' value='"+ inputData[3] +"' required>");
           			}else{
	           			out.print("<input type='number' id='fGenka' value='0' required>");
           			}
        			%>

              </td>
            </tr>
            <tr>
              <th>定価:</th>
              <td>
           		<% if(inputData!=null){
	           			out.print("<input type='number' id='fTeika' value='"+ inputData[4] +"' required>");
           			}else{
	           			out.print("<input type='number' id='fTeika' value='0' required>");
           			}
        			%>
            </tr>
            <tr>
              <th>売価:</th>
              <td>
           		<% if(inputData!=null){
	           			out.print("<input type='number' id='fBaika' value='"+ inputData[5] +"' required>");
           			}else{
	           			out.print("<input type='number' id='fBaika' value='0' required>");
           			}
        			%>
        	  </td>
            </tr>
            <tr>
              <th>準備個数:</th>
              <td>
           		<% if(inputData!=null){
	           			out.print("<input type='number' id='fKosu' value='"+ inputData[6] +"' >");
           			}else{
	           			out.print("<input type='number' id='fKosu' value='0'>");
           			}
        			%>

              </td>
            </tr>
            <tr>
              <td colspan="2"><input type="submit" value="登録"></td>
            </tr>
            </table>
          </form>
        </div>
      </section>
      <% 
      	ArrayList<ProductBean> pbList = (ArrayList<ProductBean>)session.getAttribute("PRODUCT_DATA");
      %>
      <article>
        <h1>既存の商品</h1>
        <ul>
          <%
          	if(pbList !=null){
	          	for(ProductBean pb:pbList){
	          		out.print("<li>"+ pb.getName() + "|¥"+ pb.getGenka()+ "|"+pb.getKosu()+"個</li>");
	          	}
          	}
          %>
        </ul>
      
      </article>
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
					<th>準備個数</th>
					<td id="kosuu"></td>
				</tr>
			</table>
		<form name="hiddenForm" method="POST" action="/safna/RegistServlet">
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
	session.setAttribute("INPUT_DATA",null);
%>

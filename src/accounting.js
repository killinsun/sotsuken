$(document).ready(function(){
  $("#registForm").keypress(function(ev) {
    if ((ev.which && ev.which === 13) || (ev.keyCode && ev.keyCode === 13)) {
      return false;
      
    } 
  });
  //確認表示チェック---------
    $("#syouhinform").submit(function(){
        //errorラベルがあったら表示させない
        if(jQuery('.error').get(0) && jQuery('.error').css('display')!='none'){
        }else{
          showConfirm();
        }
        return false;
    });
});
//投稿ボタン---------------
		function showConfirm(){
			//既に表示されている場合は反応させない
			if($('#confirm').css('display')=='none'){

				var iGenka = Number($('#fGenka').val()) || 0; //NaNの時0にする
				var iTeika = Number($('#fTeika').val()) || 0; 
				var iBaika = Number($('#fBaika').val()) || 0; 
				var iKosu = Number($('#fKosu').val()) || 0; 

				//入力パラメータをはりつける
				$('#code').html($("#sCode").val());
				$('#shohinname').html($("#sName").val());
				$('#kategori').html($("#category").val());
				$('#genka').html(iGenka)
				$('#teika').html(iTeika);
				$('#baika').html(iBaika);
				$('#kosuu').html(iKosu);



				//hidden要素にデータを乗っける
				var form = document.forms[hiddenForm];
				hiddenForm.hiddenCode.value =$("#sCode").val();
				hiddenForm.hiddenName.value =$("#sName").val();
				hiddenForm.hiddenCategory.value =$("#category option:selected").val();
				hiddenForm.hiddenGenka.value =iGenka;
				hiddenForm.hiddenTeika.value =iTeika;
				hiddenForm.hiddenBaika.value =iBaika;
				hiddenForm.hiddenKosu.value =iKosu;

				//確認ウィンドウの表示
				$('#confirm').show('slide',{direction:"right"},500);
				$('#submitBar').hide("drop",{direction:"right"},500);
			}
      return false;
		}

function showAddCategory(){
	//既に表示されている場合は反応させない
	if($('#addCategory').css('display')=='none'){
		$('#addCategory').show('slide',{direction:"right"},400);
		$('#submitBar').hide("drop",{direction:"right"},400);

		var iGenka = Number($('#fGenka').val()) || 0; //NaNの時0にする
		var iTeika = Number($('#fTeika').val()) || 0; 
		var iBaika = Number($('#fBaika').val()) || 0; 
		var iKosu = Number($('#fKosu').val()) || 0; 

		//hidden要素にデータを乗っける
		var form = document.forms[hiddenForm2];
		hiddenForm2.hiddenCode.value =$("#sCode").val();
		hiddenForm2.hiddenName.value =$("#sName").val();
		hiddenForm2.hiddenCategory.value =$("#category option:selected").val();
		hiddenForm2.hiddenGenka.value =iGenka;
		hiddenForm2.hiddenTeika.value =iTeika;
		hiddenForm2.hiddenBaika.value =iBaika;
		hiddenForm2.hiddenKosu.value =iKosu;
	}

}  
$(document).ready(function(){
	//戻るボタン---------------
	$('#backButton').click(function(){
		$('#confirm').hide("slide",{direction:"right"},500)
		$('#submitBar').show("drop",{direction:"right"},500);
	});
	$('#backButton2').click(function(){
		$('#addCategory').hide("slide",{direction:"right"},500)
		$('#submitBar').show("drop",{direction:"right"},500);
	});
});

var dataArray;

$(document).ready( function(){

	//会計ボタン-----------------------------------------------
	$('#buttonArea').click(function(){
		//すでに表示されている場合は反応させない
		if($('#accountingPage').css('display')=='none'){

			$('#accountingPage').show("slide",{direction:"right"},500);
			//配列の初期化
			//商品一覧を１つずつ検査
			//一覧から０より大きい商品のidと名前と個数を取得
			//配列をセットし、ループさせる
			//配列をセットし終わったら、htmlを生成する

			dataArray = new Array();
			var sum = 0;
			for(var i=0;i < $('.goods').length;i++){
				var counter = Number($("#"+i).find(".count").text());
				var sName = $("#"+i).find(".goodsName").text();
				var code = $("#"+i).find(".goodsName").attr("id");
				if(counter > 0){
					//jsonString.Product[i].baika でサーブレットから受け取った売価の取得
					var data = [i,sName,counter,jsonString.Product[i].baika,code];
					dataArray.push(data);
					sum = sum + data[2] * data[3]
				}

			}
			for(var i=0;i < dataArray.length;i++){
				$('#midashi').after("<tr class='common'><td>" + dataArray[i][1] + 
						"</td><td>" + dataArray[i][3] + 
						"</td><td>" + dataArray[i][2] + 
						"</td><td>" + dataArray[i][2] * dataArray[i][3] + 
						"</td></tr>");
			}
			$('#amountArea').text(sum);
		}
	});

	//戻るボタン-----------------------------------------------
	$('#backButton').click(function(){
		$('#accountingPage').hide("slide",{direction:"right"},500)
		$('.common').remove();
	});

	//名前か個数をクリックした時-------------------------------
	$('.dummy').click(function(){
		//クリックした要素のIDを取得する
		var id = $(this).parent("div").attr("id");       //id(HTML上での)
		var code = $(this).children("div").attr("id");       //id(商品表での）
		var sName = $("#"+id).find(".goodsName").text(); //商品名
		var counter =$("#"+id).find(".count").text();   //個数
		var price = jsonString.Product[id].baika;       //売価
		var amount;                                     //小計

		//元々カートになかった場合
		if(counter==0){
			counter = Number(counter) + 1;
			amount = counter * price;
			$("#cartMidashi").after("<tr><td id='cart"+ id + "'>"+ sName + "</td><td>" + price +"</td><td>"+counter+"</td><td>"+amount+"</td></tr>");

			//カートにあった場合
		}else{
			counter = Number(counter) + 1;
			amount = counter * price;
      //$("#cart"+id).next().remove();
      $("#cart"+id).next().next().html(counter); //個数書き換え
      $("#cart"+id).next().next().next().html(amount);  //小計書き換え

		}
		$("#"+id).find(".count").text(counter);

	});

	//バツボタンをクリックした時-------------------------------
	$('.close').click(function(){
		//クリックした要素のIDを取得する
		var id = $(this).parent("div").attr("id");
		var sName = $("#"+id).find(".goodsName").text();
		var counter =$("#"+id).find(".count").text();
		var price = jsonString.Product[id].baika;
		var amount;

		counter = Number(counter) - 1;
		//減らした結果,0個になったらカートから削除したことにする
		if(counter > 0){
			amount = price * counter;
      $("#cart"+id).next().next().html(counter); //個数書き換え
      $("#cart"+id).next().next().next().html(amount); //小計書き換え
			$("#"+id).find(".count").text(counter);
		}else{
			$("#"+id).find(".count").text("0");
			$("#cart"+id).parent().remove(); //０個になったら<tr>~</tr>ごと削除
		}
		data[id][4] = counter;
	});

	//お預かり金入力処理----------------------------------------
	$('#luggage').keypress(function( e ){
  
    //エンターキー入力されました
		if(e.which == 13){
      //お金足りてる?
      if($("#luggage").val() >= $("#amountArea").text()){     
        checkOk();
      //足りていない
      }else{
        //エラーメッセージもう出てる？（二重エンター防止)
        if(jQuery('.error').get(0)){
          //もう修正された？ 
          if($("#luggage").val() >= $("#amountArea").text()){
            checkOk();
          }
        }else{
          $("#luggage").after("<label class='error'>足りません</label>");
        }
      }
			return false;

		}
	});
  function checkOk(){
      var luggage = $("#luggage").val();
      var fish = luggage - $("#amountArea").text() ;
      $("#inputAmountLuggage").hide();   
      $("#amountLuggage").show();
      $("#amountLuggageArea").text(luggage);
      $("#fishingArea").text(fish); 
      $("#backButton").hide();
      $("#commitButton").show();
  }
    

	//確定ボタンをクリックした時----------------------------------------
	$("#commitButton").click(function(){
		var sendJsonData = new Array(dataArray.length);
		var date = new Date().toLocaleString();
		//dataArrayには、カートに追加した商品の情報が格納されているので、これを使用する
		for(var i=0;i < dataArray.length;i++){
			sendJsonData[i]= {
					"code":dataArray[i][4],
					"counter":dataArray[i][2],
					"date":date
			};
		}
		var jsonText;
		jsonText = JSON.stringify(sendJsonData);

		var f = document.forms["commitForm"];
		f.hiddenParm.value=jsonText;
		f.submit();


	});



});

// 画面読み込み完了時の処理
window.addEventListener("load", function () {
	// プログラムID
	var progId = document.getElementById("progId");

	// フォーム
	var form = document.getElementById("form");

	//「ユーザ情報メンテナンス」ボタンが押されたとき
    document.getElementById("userButton").addEventListener("click", function () {
    	progId.value = "0";
    	form.submit();
    }, true);

	//「商品メンテナンス」ボタンが押されたとき
    document.getElementById("syohinButton").addEventListener("click", function () {
    	progId.value = "1";
    	form.submit();
    }, true);

	//「売り上げ情報メンテナンス」ボタンが押されたとき
    document.getElementById("uriageButton").addEventListener("click", function () {
    	progId.value = "2";
    	form.submit();
    }, true);

	//「ログアウト」ボタンが押されたとき
    document.getElementById("logoutButton").addEventListener("click", function () {
      if(window.confirm("ログアウトします。よろしいですか？")){
        progId.value = "9";
        form.submit();
        
      }else{
        window.alert("キャンセルしました");
      }
    }, true);

}, true);

(function(documet){

    //数字の桁数を揃える 001-999
    function formatNum(keta,num){
      var src = new String(num);
      var cnt = keta -src.length;
      if(cnt <= 0) return src;
      while(cnt-- > 0)src ="0" + src; return src;
    }

    var subject = new Array("f","g","j","n","w");      
    
    $(document).ready(function(){
      //データベースから学科を取得する
      for(var j=11; j < 14; j++){
        for(var k=0; k < 3; k++){
          for(var i=1; i < 60; i++){
            //年と下３桁
            number = formatNum(3,i);
            year = formatNum(2,j);
            //データの挿入
            $("#idType").append('<option value="x' + 
                                year.toString() + 
                                subject[k].toString() + 
                                number.toString() +
                                '"></option>');
          console.warn(year + subject[k] + number);
          }
        }
      }
      
    });


  
     
})(document);

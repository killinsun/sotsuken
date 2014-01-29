(function(documet){
     
    function check(){ 
      if($("#sCode").val().length > 4){
        $("#sCode").after("<tr><td colspan='2'>エラー</td></tr>");
  
      }
    };
 
 
    function edit_togle(){
      var edit_flag=false;
      return function(){
       if(edit_flag) return;
        var $input = $("<input>").attr("type","text").val($(this).text());
        $(this).html($input); 
         
        $("input", this).focus().blur(function(){
          save(this);
          $(this).after($(this).val()).unbind().remove();
          edit_flag = false;
        });
        edit_flag = true;
      };
    }    
     
    function save(elm){
      
        
    }
})(document);

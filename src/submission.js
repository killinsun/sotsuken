(function(documet){
     
    $(document).ready(function(){
         $(".edit-table > tbody > tr > td").click(edit_togle());
    });
 
 
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

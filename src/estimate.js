function formCalc(tNum,rowNum){
  var amount = 'calc.amount' + tNum + '_' + rowNum;
  var price = 'price'  + tNum + '_' + rowNum;
  var numArt = 'numArt'  + tNum + '_' + rowNum;
  var subTotal = 'calc.subTotal' + tNum;
  var Total = 'calc.Total';

  //Switching variable assign to number from tNum 
  switch(tNum){
    case 1: var rowCount = $('table#MaterialTable output').length -1;break;
    case 2: var rowCount = $('table#CostTable output').length -1;break;
    case 3: var rowCount = $('table#DecorationTable output').length -1;break;
    default:alert("何かエラーが起きました");break;
  }

  //Calc amount.
  eval(amount).value = Number(eval(price).value) * Number(eval(numArt).value); 

  //Calc subTotal.
  var tmp =0;
  for(var i=1;i <= rowCount;i++){
    calcAmount = 'calc.amount' + tNum + '_' + i;
    tmp = Number(eval(calcAmount).value) + tmp;
    
  }
  eval(subTotal).value = Number(tmp);
  
  //Calc Total.
  calc.Total.value = Number(calc.subTotal1.value) + Number(calc.subTotal2.value) + Number(calc.subTotal3.value);
  
  
  
};

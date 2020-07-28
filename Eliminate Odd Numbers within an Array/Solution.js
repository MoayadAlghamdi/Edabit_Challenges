function noOdds(arr) {
  var newArr = [];
  var i ;
	for(i of arr){
    (i % 2 === 0) && newArr.push(i);
  }
  return newArr
}

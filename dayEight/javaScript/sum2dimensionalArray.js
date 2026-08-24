function addElementsInInnerArrays(array){
    let sum = 0
    let sumArray = [];
    
   
    for (let column = 0; column < array.length; column++){
        let count = 0;
        for (let row = 0; row < array.length; row++){
            sum += array[column][row]
        }
        sumArray.push(sum);
        sum = 0
    }
    return sumArray;
}

array = [[3,5,7], [2,2,2], [4,1,9]];
console.log(addElementsInInnerArrays(array));
    

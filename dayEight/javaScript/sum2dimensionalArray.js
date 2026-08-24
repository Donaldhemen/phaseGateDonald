function addElementsInInnerArrays(array){
        
    let sumArray = [array.length];
    
   
    for (let column = 0; column < array.length; column++){
        let count = 0;
        for (let row = 0; row < array.length; row++){
            sumArray[count] += array[row][column];
            count++;
        }
    }
    return sumArray;
}

array = [[3,5,7], [2,2,2], [4,1,9]];
console.log(addElementsInInnerArrays(array));
    

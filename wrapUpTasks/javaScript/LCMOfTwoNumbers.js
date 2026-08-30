    
function findLCMOf(numberOne, numberTwo){

    if(numberOne == 0 || numberTwo == 0){
        return 0;
    }
    
    let product = Math.abs(numberOne * numberTwo);
    let divisor = findGCDOf(numberOne, numberTwo);
    return product / divisor;
}

function findGCDOf(numberOne, numberTwo){
    
    let temp = 0;
    while(numberOne != 0){
        temp = numberOne;
        numberOne = numberTwo % numberOne;
        numberTwo = temp;
    }
    return temp;
}

let numberOne = 8;
let numberTwo = 6;

console.log(findLCMOf(numberOne, numberTwo));
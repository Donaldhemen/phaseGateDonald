
    
function findGCDOf(numberOne, numberTwo){
    
    let temp = 0;
    while(numberOne != 0){
        temp = numberOne;
        numberOne = numberTwo % numberOne;
        numberTwo = temp;
    }
    return temp;
}

let numberOne = 100;
let numberTwo = 40;

console.log(findGCDOf(numberOne, numberTwo));

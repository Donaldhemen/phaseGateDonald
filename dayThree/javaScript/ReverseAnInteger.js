

function getTheReverseOfInteger(number){
    
    let reverse = 0;

    while(number > 0){
        let lastDigit = number % 10;
        reverse = (reverse * 10) + lastDigit;
        number = Math.floor(number/10);
    }
    return reverse;
}
    
let value = 12345;
console.log(getTheReverseOfInteger(value));
    
    

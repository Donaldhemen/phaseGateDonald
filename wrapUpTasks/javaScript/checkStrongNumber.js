        
    
function isStrongNumber(number){
    
    let original = number;
    let sum = 0;
    
    while(number > 0){
        let digit = number % 10;
        sum += factorialOf(digit);
        number /= 10;
    }
    return sum == original;
}

function factorialOf(digit){

    let product = 1;
    for(let count = digit; count >= 1; count--){
        product *= count;
    }
    return product;
}

let number = 145;
console.log(isStrongNumber(number));

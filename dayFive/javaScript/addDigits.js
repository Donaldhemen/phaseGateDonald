function sumTheDigitsToOneDigit(number){
    if(number < 0){
        number = 0 - number;
    }

    let singleDigit = 0;
    while(number > 9){
        singleDigit = Math.floor(number / 10) + (number % 10);
        number = singleDigit;
    }
    return singleDigit;
}

let value = 38;
console.log(sumTheDigitsToOneDigit(value));


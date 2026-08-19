function countDivisorsOfANumber(number){
    let counter = 0;
    for(let count = 1; count <= number; count++){
        if(number % count == 0){
            counter++; 
        }
    }
    return counter;
}

let number = 20;
countDivisorsOfANumber(number);

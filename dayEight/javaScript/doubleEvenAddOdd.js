function isEven(number){
    let evenCheck = false;
    if(number % 2 === 0){
        evenCheck = true;
    } 
    return evenCheck;
}
    
function isOdd(number){
    let oddCheck = false;
    if(number % 2 === 1){
        oddCheck = true;
    } 
    return oddCheck;
}
    
function addOneToOddOrDoubleEven(numbers){
        
    for(let count = 0; count < numbers.length; count++){
        let number = numbers[count];
        if(isEven(number)){
            numbers[count] = numbers[count] * 2;
        }
        else if(isOdd(number)){
            numbers[count] = numbers[count] + 1;
        }
    }
    return numbers;
}

numbers = [2,8,14,5,1];
console.log(addOneToOddOrDoubleEven(numbers));

let total = 0;
let evenCount = 0;
for(let count = 1; count <= 10; count++){
    
    const scanner = require("prompt-sync")();
    let number = Number(scanner ("Enter score: "));
    if(number % 2 === 0){
        total += number;
        evenCount += 1;
    }
    
}
let average = total / evenCount;
console.log("The average of the even scores is "+average);

let total = 0;
let validCount = 0;
for(let count = 1; count <= 10; count++){
    
    const scanner = require("prompt-sync")();
    let number = Number(scanner ("Enter score: "));
    if(number > 0 && number < 100){
        total += number;
        validCount += 1;
    }
    
}
let average = total / validCount;
console.log("The sum of the valid scores is "+total)

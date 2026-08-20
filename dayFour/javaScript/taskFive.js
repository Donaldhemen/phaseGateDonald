let total = 0;

for(let count = 1; count <= 10; count++){
    
    const scanner = require("prompt-sync")();
    let number = Number(scanner ("Enter score: "));
    if(number % 2 === 0){
        total += number;
        
    }
    
}

console.log("The sum of the even scores is "+total);


 
let total = 0;

for(let count = 1; count <= 10; count++){
    
    const scanner = require("prompt-sync")();
    let number = Number(scanner ("Enter score: "));
    total += number;
}

console.log("The sum of the ten scores is "+total);


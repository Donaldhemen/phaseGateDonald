let total = 0;

for(let count = 1; count <= 10; count++){
    
    const scanner = require("prompt-sync")();
    let number = Number(scanner ("Enter score: "));
    total = total + number;
}
let average = total / 10;

console.log("The sum of the ten scores is "+total+" and the average is "average);

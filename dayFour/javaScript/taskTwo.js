let total = 0;

for(let count = 1; count <= 10; count++){
    
    const scanner = require("prompt-sync")();
    let number = Number(scanner ("Enter score: "));
    total = total + number;
}
let average = total / 10;

console.log("The average of the ten scores is "+average);


let startingYear = 1900;
let endingYear = 2025;
let count = 0;

for(let year = startingYear; year <= endingYear; year++){
    
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
        
        count++;
    }
}
console.log(count);

let startingYear = 1900;
let endingYear = 2025;


for(let year = startingYear; year <= endingYear; year++){
    
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
        console.log(year+" ");
        
    }
}
console.log();

    
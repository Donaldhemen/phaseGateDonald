

function getDivisorsOfANumber(number){
    for(let count = 1; count <= number; count++){
        if(number % count == 0){
            console.log(count+" "); 
        }
    }
    console.log();
}
getDivisorsOfANumber();
let number = 20;
getDivisorsOfANumber(number);



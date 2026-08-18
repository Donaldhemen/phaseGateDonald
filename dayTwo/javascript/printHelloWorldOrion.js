const multipleOfThree = "hello";
const multipleOfFive = "world";
const multipleOfSeven = "orion";
let reversed = 0;
for(let count = 1; count <= 100; count++){

    if(count % 3 === 0){
        console.log(multipleOfThree+" ");
    }
    else if(count % 5 === 0){
        console.log(multipleOfFive+" ");
    }
    else if(count % 7 === 0){
        console.log(multipleOfSeven+" ");
    }
    else{
        if(count >= 10){
            reversed = ((count % 10) * 10) + Math.floor(count/10);
            console.log(reversed+" ");
        }
        else{
            console.log(count+" ");
        }
    }
    console.log();
}

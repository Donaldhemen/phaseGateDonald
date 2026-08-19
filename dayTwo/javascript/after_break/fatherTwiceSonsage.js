
function isDoubleSonsAge(numberOne, numberTwo){
    let yearToDouble = 0;
    if(numberOne/2 > numberTwo){
        yearToDouble = numberOne - (numberTwo * 2);
        console.log("The father was twice his son's age "+yearToDouble+" years ago");
    }
    else if(numberOne/2 < numberTwo){
        yearToDouble = (numberTwo * 2) - numberOne;
        console.log("The father will be twice his son's age in "+yearToDouble+" years time");
    }
}
isDoubleSonsAge();
const fathersAge = 38;
const sonsAge = 18;
isDoubleSonsAge(fathersAge, sonsAge);

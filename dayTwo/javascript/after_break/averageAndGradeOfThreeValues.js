 
function calculateAverageAndGrade(numberOne, numberTwo, numberThree){
    
    let average = (numberOne + numberTwo + numberThree) / 3;
    
    if(average >= 90){
        console.log("The average score is "+average+" and grade is A");
    }
    
    else if(average >= 80){
        console.log("The average score is "+average+" and grade is B");
    }
    
    else if(average >= 70){
        console.log("The average score is "+average+" and grade is C");
    }
    
    else if(average >= 60){
        console.log("The average score is "+average+" and grade is D");
    }
    
    else if(average < 60) {
        console.log("The average score is "+average+" and grade is F");
    }
}

calculateAverageAndGrade();
const scoreOne = 70;
const scoreTwo = 60;
const scoreThree = 50;
calculateAverageAndGrade(scoreOne, scoreTwo, scoreThree);


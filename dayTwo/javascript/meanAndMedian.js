let median = 0;
const firstValue = 5;
const secondValue = 4;
const thirdValue = 6;

const average = (firstValue + secondValue + thirdValue) / 3;

if (firstValue > secondValue && firstValue > thirdValue){
    if(secondValue > thirdValue){
    
        median = secondValue;
    }
    else if(secondValue < thirdValue) {
        median = thirdValue;
    }
}

if (secondValue > firstValue && secondValue > thirdValue){
    if(firstValue > thirdValue){
    
        median = firstValue;
    }
    else if(firstValue < thirdValue){
    
       median = thirdValue;
    }
}

if (thirdValue > firstValue && thirdValue > secondValue){
    if(firstValue > secondValue){
    
        median = firstValue;
    }
    else if(firstValue > secondValue){
        median = secondValue;
    }
}

console.log("The mean of the three values is "+ average+ " and the median is "+median);



function getElementThatAppearsOnce(array){
    let check = isNotEmpty(array);
    lengthCheck = isNotLessThanThreeElements(array);
    if(check === true && lengthCheck === true);
    
    let swap = 0;
    for(let index = 0; index < array.length; index++){
        for(let count = 0; count < array.length; count++){
            if(array[index] !== array[count]){
                swap = array[index];
            }
        }
    }
    return swap;
    
    
}
function isNotEmpty(array){
   let lengthCheck = false;
    if(array.length > 0){
        lengthCheck = true;
    }
    else if(array.length <= 0) {
        lengthCheck = false;
    }
    return lengthCheck;
}

function isNotLessThanThreeElements(array){
   let lengthCheck = false;
    if(array.length >= 3){
        lengthCheck = true;
    }
    else if (array.length < 3){
        lengthCheck = false;
    }
    return lengthCheck;
}
 let numbers = [2, 2, 1];
console.log(getElementThatAppearsOnce(numbers));

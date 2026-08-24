function checkNumberOfPrimes(array){
    let counter = 0;
    
    for(let index = 0; index < array.length; index++){
        let number = array[index];
        if(isPrime(number)){
            counter++;
        }
    }
    
    return counter;
}

function isPrime(number){
    let isPrime = false;
    let primeCounter = 0;
    
    for(let count = 1; count <= number; count++){
        if(number % count == 0){
            primeCounter++;
        }
    }
    
    if(primeCounter == 2){
        isPrime = true;
    }
    
    return isPrime;
}

function sortArrayElements(array){

    let swap = 0;
    
    for(let index = 0; index < array.length; index++){
        for(let count = 0; count < array.length; count++){
            if(array[index] < array[count]){
                swap = array[index];
                array[index] = array[count];
                array[count] = swap;
            }
        }
    }
    
    return array;
}

function getPrimes(array){

    let primesArray = [];
    
    for(let index = 0; index < array.length; index++){
        let number = array[index];
        
        if(isPrime(number)){
            primesArray.push(array[index]);
        }
    }
    
    return primesArray;
}


array = [5,9,3,4,2];

console.log(getPrimesIn(array));

console.log(sortArrayElements(getPrimes(array)));

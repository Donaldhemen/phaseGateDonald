    
function factorialOf(digit){
    
        let product = 1;
        for(let count = digit; count >= 1; count--){

            product *= count;
        }
        return product;
    }

let number = 5;
console.log(factorialOf(number));
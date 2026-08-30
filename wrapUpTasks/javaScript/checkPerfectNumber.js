

function isPerfectNumber(number){
	
	if(number <= 0){
	    return false;
	}
	let original = number;
	let sum = 0;
	for(let count = 1; count < number; count++){
	    if(number % count == 0){
	        sum += count;
	    }
	}
	return sum == original;
}		

let number = 6;
console.log(isPerfectNumber(number));


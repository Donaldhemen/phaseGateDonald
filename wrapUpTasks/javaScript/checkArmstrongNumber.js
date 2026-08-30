
function isArmstrongNumber(number) {

	let original = number;
	let digitCount = 0;
	let sum = 0;
	let temp = original;

	while(temp > 0){
		temp = Math.floor(temp/10);
		digitCount++;
	}

	while(number > 0){

		let remainder = number % 10;
		sum += Math.pow(remainder, digitCount);
		number = Math.floor(number/10);
	}
	return sum == original;
}

let value = 153;
console.log(isArmstrongNumber(value));
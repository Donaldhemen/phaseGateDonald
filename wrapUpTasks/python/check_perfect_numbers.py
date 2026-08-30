
def is_perfect_number(number):
	
	if(number <= 0):
	    return False
	
	original = number
	total = 0
	for count in range(1, number):
	    if(number % count == 0):
	        total += count
	    
	return total == original		

number = 6
print(is_perfect_number(number))
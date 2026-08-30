
def is_armstrong_number(number):

	original = number
	digit_count = 0
	total = 0
	temp = original

	while(temp > 0):
		temp = temp // 10
		digit_count += 1

	while(number > 0):

		remainder = number % 10
		total += remainder ** digit_count
		number = number // 10
		
	return total == original


value = 153
print(is_armstrong_number(value))

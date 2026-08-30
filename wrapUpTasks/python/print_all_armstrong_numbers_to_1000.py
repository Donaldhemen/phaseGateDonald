
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


number = 1000
for count in range(1, number+1):

	if(is_armstrong_number(count)):
		print(count," ")
	

print()
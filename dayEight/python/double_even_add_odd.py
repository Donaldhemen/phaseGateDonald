
def add_one_to_odd_or_double_even(numbers):
        
    for count in range(0,len(numbers)):
        
        if(numbers[count] % 2 == 0):
            numbers[count] = numbers[count] * 2
        
        else :
            numbers[count] = numbers[count] + 1
        
    return numbers

values = [2,8,14,5,1]
print(add_one_to_odd_or_double_even(values))

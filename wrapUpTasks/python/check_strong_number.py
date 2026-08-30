
def is_strong_number(number):
    
    original = number
    total = 0
    
    while(number > 0):
        digit = number % 10
        total += factorial(digit)
        number //= 10
    
    return total == original

def factorial(digit):
    
    product = 1
    for count in range(1, digit+1):

        product *= count

    return product

number = 145
print(is_strong_number(number))
    
def factorial(digit):
    
    product = 1
    for count in range(1, digit+1):

        product *= count

    return product

number = 5
print(factorial(number))
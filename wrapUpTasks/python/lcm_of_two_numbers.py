    
def find_gcd_of(numberOne, numberTwo):
    
    temp = 0
    while(numberOne != 0):
        temp = numberOne
        numberOne = numberTwo % numberOne
        numberTwo = temp
    
    return temp

def find_lcm_of(numberOne, numberTwo):

    if(numberOne == 0 or numberTwo == 0):
        return 0
    
    product = abs(numberOne * numberTwo)
    divisor = find_gcd_of(numberOne, numberTwo)
    return product / divisor

numberOne = 8
numberTwo = 6

print(find_lcm_of(numberOne, numberTwo))
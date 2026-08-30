    
def find_gcd_of(numberOne, numberTwo):
    
    temp = 0
    while(numberOne != 0):
        temp = numberOne
        numberOne = numberTwo % numberOne
        numberTwo = temp
    
    return temp

numberOne = 100
numberTwo = 40
print(find_gcd_of(numberOne, numberTwo))
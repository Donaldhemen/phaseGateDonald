def sumTheDigitsToOneDigit(number):
    if(number < 0):
        number = 0 - number
    
    singleDigit = 0
    while(number >= 10):
        singleDigit = (number // 10) + (number % 10)
        number = singleDigit
    
    return singleDigit


value = 38
print(sumTheDigitsToOneDigit(value))


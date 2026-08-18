median = 0
firstValue = 5
secondValue = 4
thirdValue = 6
        
average = (firstValue + secondValue + thirdValue) / 3;

if (firstValue > secondValue and firstValue > thirdValue):
    if(secondValue > thirdValue):
            
        median = secondValue

    elif(secondValue < thirdValue): 
        median = thirdValue
         
if (secondValue > firstValue and secondValue > thirdValue):
    if(firstValue > thirdValue):

        median = firstValue

    elif(firstValue < thirdValue):

       median = thirdValue

if (thirdValue > firstValue and thirdValue > secondValue):
    if(firstValue > secondValue):

        median = firstValue

    elif(firstValue > secondValue):
        median = secondValue
        
print(f"The mean of the three values is {average} and the median is {median}")

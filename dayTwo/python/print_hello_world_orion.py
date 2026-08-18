multipleOfThree = "hello";
multipleOfFive = "world";
multipleOfSeven = "orion";
reversed = 0;
for count in range(1, 101):

    if(count % 3 == 0):
        print(multipleOfThree," ")
    
    elif(count % 5 == 0):
        print(multipleOfFive," ")
    
    elif(count % 7 == 0):
        print(multipleOfSeven," ")
    
    else:
        if(count >= 10):
            reversed = (count % 10) * 10 + (count // 10);
            print(reversed," ")
        
        else:
            print(count," ")
     
print()

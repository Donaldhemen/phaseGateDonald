
startingYear = 1900
endingYear = 2025
count = 0

for year in range(startingYear, endingYear):
    
    if ((year % 4 == 0 and year % 100 != 0) or (year % 400 == 0)):
        count += 1
        
print(count)
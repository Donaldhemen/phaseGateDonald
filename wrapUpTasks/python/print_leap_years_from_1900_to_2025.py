
startingYear = 1900
endingYear = 2025

for year in range(startingYear, endingYear):
    
    if ((year % 4 == 0 and year % 100 != 0) or (year % 400 == 0)):
        print(year," ")
        
print()
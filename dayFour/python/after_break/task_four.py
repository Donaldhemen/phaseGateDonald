 
total = 0

for count in range(1, 11):

    number = int(input("Enter score: "))
    if(count % 2 == 0):
        total = total + number


print("The sum of the ten scores is ",total)

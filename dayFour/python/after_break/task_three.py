 
total = 0

for count in range(1, 11):

    number = int(input("Enter score: "))
    total = total + number

average = total / 10
print("The sum of the ten scores is ",total," and their average is ",average)

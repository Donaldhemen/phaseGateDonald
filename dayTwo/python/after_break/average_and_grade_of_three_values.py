 
def calculate_average_and_grade(number_one, number_two, number_three):
    
    average = (number_one + number_two + number_three) / 3
    
    if(average >= 90):
        print("The average score is ", average," and grade is A")
    
    
    elif(average >= 80):
        print("The average score is ", average," and grade is B")
    
    
    elif(average >= 70):
        print("The average score is ", average," and grade is C")
    
    
    elif(average >= 60):
        print("The average score is ", average," and grade is D")

    
    elif(average < 60):
        print("The average score is ", average," and grade is F")
    

score_one = 70
score_two = 60
score_three = 50
calculate_average_and_grade(score_one, score_two, score_three)

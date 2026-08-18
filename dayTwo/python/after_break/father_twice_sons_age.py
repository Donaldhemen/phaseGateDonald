def is_double_sons_age(number_one, number_two):
    years_to_double = 0
    if(number_one/2 > number_two):
        years_to_double = number_one - (number_two * 2)
        print("The father was twice his son's age ", years_to_double, " years ago")
    
    elif(number_one/2 < number_two):
        years_to_double = (number_two * 2) - number_one
        print("The father will be twice his son's age in ", years_to_double," years time")
    


fathers_age = 38
sons_age = 18
is_double_sons_age(fathers_age, sons_age)

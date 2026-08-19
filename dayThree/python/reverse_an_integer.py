def reverse_an_integer(number):

    reversed = 0
    while(number > 0):
        last_digit = number % 10
        reversed = (reversed * 10) + last_digit
        number = number // 10
    return reversed


number = 12345
print(reverse_an_integer(number))

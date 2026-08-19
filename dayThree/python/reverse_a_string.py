def reverse_a_string(word):

    reversed = ""
    for char in word:
        reversed = char + reversed
    return reversed


word = "donald"
print(reverse_a_string(word))

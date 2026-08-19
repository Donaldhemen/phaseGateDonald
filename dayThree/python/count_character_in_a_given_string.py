def count_characters_with_multiple_occurences(words):
    counter = 0
    for word in words:
        count = 0
        for letter in words:
            if(word == letter):
                count = count + 1
                if(count >= 2):
                    counter = counter + 1
    return counter
username = "a11Bacb"
print(count_characters_with_multiple_occurences(username))

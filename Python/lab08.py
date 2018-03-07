# CS 323 Spring 2018 - Week 08 Lab
# Grant Pawell and John Mackin

from collections import Counter


# more_vowels: string string -> int
# purpose:  expects two strings
#           compares the number of vowels in each string
#           returns a number representing which has more vowels
# side effects: prints message describing the difference in vowel count of strings
def more_vowels(string1, string2):
    
    first_dict = dict(Counter(string1))
    second_dict = dict(Counter(string2))

    for i in "aeiouAEIOU":
        first_dict.setdefault(i, 0)
        second_dict.setdefault(i, 0)

    sumString1 = 0
    for i in first_dict.keys():
        if i in 'aeiouAEIOU':
            sumString1 = sumString1 + first_dict[i]

    sumString2 = 0
    for i in second_dict.keys():
        if i in 'aeiouAEIOU':
            sumString2 = sumString2 + second_dict[i]

    if sumString1 > sumString2:
        print("The first string has more vowels.")
        return 1
    elif sumString1 == sumString2:
        print("The strings have an equal number of vowels.")
        return 0
    else:
        print("The second string has more vowels.")
        return 2

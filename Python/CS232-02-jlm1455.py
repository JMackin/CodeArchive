#CS-232-02-jlm1455.py
#John L. Mackin
#Last Modified 02/20/2018

#Problem 1

# pig_latin: string -> string
# Purpose: expects a single word as a string ,
#           and returns that string in pig latin
# Side effects: only works with a single word string

def pig_latin(word):
    vowels = ('a','e','i','o','u')

    if word[0] in vowels:
        return word + '-ay'
    elif word[0] not in vowels and word[1] == 'h':
        return word[2:] + '-' + word[0:2] + 'ay'
    else:
        return word[1:] + '-' + word[0] + 'ay'

# Problem 2

# pig_list: string list -> string list
# Purpose: Accepts a list of strings, each string being a word,
#           and returns a list of each word in pig latin
# Side effects: only works with a list of words

def pig_list(word_list):
    
    piglated_list = [pig_latin(i) for i in word_list]
    
    return piglated_list

# Problem 3

# letter_freq: string -> dict
# Purpose: Counts the number of times each letter in the string passed
# Side Effects: Only counts letters if they appear at least once

def letter_freq(sentence):
    let_freq = {}

    for i in sentence:
        if i != ' ':
            if i not in let_freq.keys():
                let_freq[i] = 1
            else:
                let_freq[i] += 1

    return let_freq

# Problem 4

# freq_bar_chart: dict -> void
# Purpose: Displays a bar graph representing the number of occurances of each letter
#           as defined by the passed dictionary
# Side Effects: Displays a bar graph

def freq_bar_chart(let_freq_dict):
    

    for i in lower(sorted(let_freq_dict.keys())):
        xs = ''
        for j in range(0,let_freq_dict[i]):
            xs += 'x'
        print(i,'-',xs)


# Problem 5

# plot_points: dict -> void
# Purpose: Creates a graph with characters at the locations
#            defined by the dictionary passed
# Side Effects: Prints a large grid

def plot_points(points_dict):

    g_X = max([x[0] for x in points_dict.values()])
    g_Y = max([y[1] for y in points_dict.values()])
    graph = [ [ '.' for i in range(0,g_X+1)] for j in range(0,g_Y+1) ]

    for i in points_dict.keys():
        for y in range(0,g_Y+1):
            for x in range(0,g_X+1):
                if points_dict[i] == ((x),(y)):
                    graph[y][x] = i

    for y in range(0,g_Y+1):
        print( (g_Y-y) , [x for x in graph[y]] )
    print(' ',[str(i) for i in range(0,g_X + 1)])

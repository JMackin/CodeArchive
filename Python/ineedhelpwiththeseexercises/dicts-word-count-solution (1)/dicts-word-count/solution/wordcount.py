input_file = open('./test.txt')

word_count = {}

for line in input_file:
    line = line.rstrip()
    words = line.split()
    for word in words:
        # Set the word count to whatever it was + 1; if it wasn't found at all,
        # we'll use `.get(word, 0)` to return 0 if the word wasn't already in the
        # dictionary
        word_count[word] = word_count.get(word, 0) + 1

for word, count in word_count.iteritems():
    print word, count


########### Alternate solution, with functions! ###############

def tokenize(filename):
    """Return list of words from file"""
    tokenized = []
    with open(filename) as text_file:
        for line in text_file:
            line = line.rstrip()
            tokenized.extend(line.split())
    return tokenized

def word_count(lst):
    """Return dictionary of word: count from list"""

    words = {}
    for word in lst:
        words[word] = words.get(word, 0) + 1

    return words

def print_words(dictionary):
    """Print words: count from dictionary"""

    for word, count in dictionary.iteritems():
        print word + " " + str(count)

# token = tokenize('test.txt')
# dictionary = word_count(token)
# print_words(dictionary)


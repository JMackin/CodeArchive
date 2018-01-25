import sys

input_filename = sys.argv[1]
input_file = open(input_filename)

word_count = {}

for line in input_file:
    line = line.rstrip()
    words = line.split()

    for word in words:

        # Strip common punctuation off the word:
        word = word.strip("'\",.!?-#$%^&()")

        # You could also do this more comprehensively with:
        #
        #   import string
        #   word = word.strip(string.punctuation)

        # Lowercase the word so "Kit" and "kit" are counted together

        word = word.lower()

        # Set the word count to whatever it was + 1; if it wasn't found at all,
        # we'll use `.get(word, 0)` to return 0 if the word wasn't already in the
        # dictionary
        word_count[word] = word_count.get(word, 0) + 1

counts = word_count.iteritems()

for word, count in counts:
    print word, count

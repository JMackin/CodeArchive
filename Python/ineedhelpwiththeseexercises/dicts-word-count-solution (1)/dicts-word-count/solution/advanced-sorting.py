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

counts = sorted(word_count.iteritems())

# SORTING STRATEGIES:

def sort_by_count(key_value):
    """Given tuple of (key, value), return (value, key)"""

    return (key_value[1], key_value[0])

def sort_by_count_and_alpha(key_value):
    """Given tuple of (key, value), return so we can sort by val DESC, key)

    Since we know the values are numbers, we'll be sneaky and make it so
    that the key is subtracted from a huge number--so higher counts would
    appear as bigger numbers and sort toward the top.
    """

    return (999999 - key_value[1], key_value[0])


# SORTS

# Sorts alphabetically by word (key)
sorted_counts = sorted(counts)

# Sort by count, descending. We do this by using a key function that
# sorts by counts (ascending) and then we reverse the sort
sorted_counts = sorted(counts, key=sort_by_count, reverse=True)

# Sort by count, descending and word ascending. This requires some
# clever thinking. See the sort_by_count_and_alpha function for
# an explanation.
sorted_counts = sorted(counts, key=sort_by_count_and_alpha)

for word, count in sorted_counts:
    print word, count

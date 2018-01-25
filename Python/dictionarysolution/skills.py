"""Skills-dictionaries.

**IMPORTANT:** these problems are meant to be solved using
dictionaries and sets.
"""


def without_duplicates(words):
    """Given a list of words, return list with duplicates removed.

    For example::

        >>> sorted(without_duplicates(
        ...     ["rose", "is", "a", "rose", "is", "a", "rose"]))
        ['a', 'is', 'rose']

    You should treat differently-capitalized words as different::

        >>> sorted(without_duplicates(
        ...     ["Rose", "is", "a", "rose", "is", "a", "rose"]))
        ['Rose', 'a', 'is', 'rose']

        An empty list should return an empty list::

        >>> sorted(without_duplicates(
        ...     []))
        []

    The function should work for a list containing integers::

        >>> sorted(without_duplicates([111111, 2, 33333, 2]))
        [2, 33333, 111111]
    """

    # Alternate, set-based answer:
    # return set(words)

    # Alternate, dict-comprehension answer:
    # return { w: 1 for w in words }.keys()

    l = [words[0]]

    for i in words:
        for j in l:
            if i == j:
                break
            else:
                l.append(i)



"""
    d = {}

    for w in words:
        d[w] = 1

    return d.keys()
"""

def find_unique_common_items(items1, items2):
    """Produce the set of *unique* common items in two lists.

    Given two lists, return a list of the *unique* common items
    shared between the lists.

    **IMPORTANT**: you may not use `'if ___ in ___``
    or the method `list.index()`.

    This should find [1, 2]::

        >>> sorted(find_unique_common_items([1, 2, 3, 4], [2, 1, 9]))
        [1, 2]

    However, now we only want unique items, so for these lists,
    don't show more than 1 or 2 once::

        >>> sorted(find_unique_common_items([3, 2, 1], [1, 1, 2, 2]))
        [1, 2]

    The elements should not be treated as duplicates if they are
    different data types::

        >>> sorted(find_unique_common_items(["2", "1", 2], [2, 1]))
        [2]
    """

    #return set(items1) & set(items2)

    # Kludgier solution using dictionaries

    overlap = {}
    
    for item1 in items1:
        for item2 in items2:
            if item1 == item2:
                overlap[item1] = item1
    
    return overlap.keys()


def count_words(phrase):
    """Count unique words in a string.

    This function should take a single string and return a dictionary
    that has all of the distinct words as keys, and the number of
    times that word appears in the string as values.

    For example::

        >>> print_dict(count_words("each word appears once"))
        {'appears': 1, 'each': 1, 'once': 1, 'word': 1}

    Words that appear more than once should be counted each time::

        >>> print_dict(count_words("rose is a rose is a rose"))
        {'a': 2, 'is': 2, 'rose': 3}

    It's fine to consider punctuation part of a word (e.g., a comma
    at the end of a word can be counted as part of that word) and
    to consider differently-capitalized words as different::

        >>> print_dict(count_words("Porcupine see, porcupine do."))
        {'Porcupine': 1, 'do.': 1, 'porcupine': 1, 'see,': 1}
    """

    word_counts = {}

    for w in phrase.split():
        word_counts[w] = word_counts.get(w, 0) + 1

    return word_counts

    # Alternate library-based answer
    #
    # from collections import Counter
    # return Counter(phrase.split())


def translate_to_pirate_talk(phrase):
    """Translate phrase to pirate talk.

    Given a phrase, translate each word to the Pirate-speak
    equivalent. Words that cannot be translated into Pirate-speak
    should pass through unchanged. Return the resulting sentence.

    Here's a table of English to Pirate translations:

    ----------  ----------------
    English     Pirate
    ----------  ----------------
    sir         matey
    hotel       fleabag inn
    student     swabbie
    boy         matey
    professor   foul blaggart
    restaurant  galley
    your        yer
    excuse      arr
    students    swabbies
    are         be
    restroom    head
    my          me
    is          be
    ----------  ----------------

    For example::

        >>> translate_to_pirate_talk("my student is not a man")
        'me swabbie be not a matey'

    You should treat words with punctuation as if they were different
    words::

        >>> translate_to_pirate_talk("my student is not a man!")
        'me swabbie be not a man!'
    """

    en_to_pirate = {
        'student': 'swabbie',
        'my': 'me',
        'is': 'be',
        'sir':  'matey',
        'man': 'matey',
        'hotel': 'fleabag inn',
        'boy': 'matey',
        'professor': 'foul blaggart',
        'restaurant': 'galley',
        'your': 'yer',
        'excuse': 'arr',
        'students': 'swabbies',
        'are': 'be',
        'the': 'th',
        'restroom': 'head',
    }

    #return " ".join([en_to_pirate.get(w, w) for w in phrase.split()])

    string = ""

    for i in phrase.split():
        for j in en_to_pirate:
            if en_to_pirate.get(j) == i:
                string += j
            else:
                string += i
    return string


def sort_by_word_length(words):
    """Given list of words, return list of ascending (len, [words]).

    Given a list of words, return a list of tuples, ordered by
    word-length. Each tuple should have two items --- the length
    of the words for that word-length, and the list of words of
    that word length.

    For example::

        >>> sort_by_word_length(["ok", "an", "apple", "a", "day"])
        [(1, ['a']), (2, ['ok', 'an']), (3, ['day']), (5, ['apple'])]
    """

    d = {}

    for w in words:
        d.setdefault(len(w), []).append(w)

    return sorted(d.items())

    # Alternate, library-based answer:
    #
    # from collections import defaultdict
    #
    # d = defaultdict(list)
    # for w in words:
    #     d[len(w)].append(w)
    # return sorted(d.items())


def get_sum_zero_pairs(numbers):
    """Given list of numbers, return list of pair summing to 0.

    Given a list of numbers, add up each individual pair of numbers.
    Return a list of each pair of numbers that adds up to 0.

    For example::

        >>> sort_pairs( get_sum_zero_pairs([1, 2, 3, -2, -1]) )
        [[-2, 2], [-1, 1]]

        >>> sort_pairs( get_sum_zero_pairs([3, -3, 2, 1, -2, -1]) )
        [[-3, 3], [-2, 2], [-1, 1]]

    This should always be a unique list, even if there are
    duplicates in the input list::

        >>> sort_pairs( get_sum_zero_pairs([1, 2, 3, -2, -1, 1, 1]) )
        [[-2, 2], [-1, 1]]

    Of course, if there are one or more zeros to pair together,
    that's fine, too (even a single zero can pair with itself)::

        >>> sort_pairs( get_sum_zero_pairs([1, 3, -1, 1, 1, 0]) )
        [[-1, 1], [0, 0]]
    """

    # Straightforward excellent solution

    result = []
    s = set(numbers)

    for x in s:
        if x >= 0 and -x in s:
            result.append([-x, x])

    return result

    # As a comprehension
    #
    # s = set(numbers)
    # return [[-x, x] for x in s if x >=0 and -x in s]

    # Different style:
    #
    # seen = set()
    # sum_to_zero = set()
    #
    # for x in numbers:
    #     if -x in seen:
    #         # Add them in a predictable lower, higher value
    #         # (so we don't worry about both (-3, 3) and (3, -3)
    #         # being in the list.
    #         sum_to_zero.add((min(x, -x), max(x, -x)))
    #     else:
    #         seen.add(x)
    # return sum_to_zero

    # Set-math solution
    #
    # pos = set(numbers)
    # neg = {-x for x in input_list if x >= 0}
    # return [(-x, x) for x in pos & neg]

    # Potentially more straightforward, double-loop version:
    #
    # found = {}
    # for x in numbers:
    #     for y in input_list:
    #         if x == -y and (y, x) not in found:
    #             found[(x, y)] = 1
    # return found.keys()

    # Or, same ideas as a set:
    #
    # found = set()
    # for x in numbers:
    #     for y in input_list:
    #         if x == -y and (y, x) not in found:
    #             found.add((x, y))
    # return list(found)

    # With an optimization to not walk the whole inner list:
    # found = set()
    # for pos, x in enumerate(numbers):
    #     for y in input_list[pos + 1:]:
    #         if x == -y and (y, x) not in found:
    #             found.add((x, y))
    # return list(found)

    # Alternate functional-style answer:
    # (hold on to your seatbelts!)
    #
    # return list({tuple(sorted((x, y)))
    #              for x in numbers
    #                for y in numbers
    #              if x == -y})


def kids_game(names):
    """PLay a kids' word chain game.

    Given a list of names, like::

      bagon baltoy yamask starly nosepass kalob nicky

    Do the following:

    1. Always start wit the first word ("bagon", in this example)

    2. Add it to the results

    3. Use the last letter of that word to look for the next word.
       Since "bagon" ends with n, find the *first* word starting
       with "n" in our list --- in this case, "nosepass".

    4. Add "nosepass" to the results, and continue. Once a word has
       been used, it can't be used again --- so we'll never get to
       use "bagon" or "nosepass" a second time.

    5. When you can't find an unused word to use, you're done!
       Return the list of output words.

    For example::

        >>> kids_game(["bagon", "baltoy", "yamask", "starly",
        ...            "nosepass", "kalob", "nicky", "booger"])
        ['bagon', 'nosepass', 'starly', 'yamask', 'kalob', 'baltoy']

    (After "baltoy", there are no more y-words, so we end, even
    though "nicky" and "booger" weren't used.)

    This is a tricky problem. In particular, think about how using
    a dictionary (with the super-fast lookup they provide) can help;
    good solutions here will definitely require a dictionary.
    """

    # Get first word and remove from consideration; add it to our
    # output

    output = [names.pop(0)]

    first_letter_to_words = {}

    # Make a dictionary of {first-letter: [words-starting-with-that]}

    for name in names:

        if name[0] not in first_letter_to_words:
            first_letter_to_words[name[0]] = [name]

        else:
            first_letter_to_words[name[0]].append(name)

    # Chain together words until we run out

    while True:

        # Our starting letter will be the last letter of last word
        start_letter = output[-1][-1]

        # If there are no candidate words, we're done
        if not first_letter_to_words.get(start_letter):
            break

        # Get the first word with that letter and remove it
        word = first_letter_to_words[start_letter].pop(0)
        output.append(word)

    return output


#####################################################################
# You can ignore everything below this.

def print_dict(d):
    # This method is used to print dictionaries in key-alphabetical
    # order, and is only for our doctests. You can ignore it.
    if isinstance(d, dict):
        print "{" + ", ".join(
            "%r: %r" % (k, d[k]) for k in sorted(d)) + "}"
    else:
        print d


def sort_pairs(l):
    # Print sorted list of pairs where the pairs are sorted. This is
    # used only for documentation tests. You can ignore it.
    return sorted(sorted(pair) for pair in l)


if __name__ == "__main__":
    print
    import doctest
    if doctest.testmod().failed == 0:
        print "*** ALL TESTS PASSED ***"
    print

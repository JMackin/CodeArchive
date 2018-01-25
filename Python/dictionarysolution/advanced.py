"""Advanced skills-dictionaries.

**IMPORTANT:** these problems are meant to be solved using
dictionaries and sets.
"""


def top_chars(phrase):
    """Find most common character(s) in string.

    Given an input string, return a list of character(s) which
    appear(s) the most the input string.

    If there is a tie, the order of the characters in the returned
    list should be alphabetical.

    For example::

        >>> top_chars("The rain in spain stays mainly in the plain.")
        ['i', 'n']

    If there is not a tie, simply return a list with one item.

    For example::

        >>> top_chars("Shake it off, shake it off.")
        ['f']

    Do not count spaces, but count all other characters.
    """

    tallies = {}
    most_common_count = 0

    for letter in phrase:

        if letter == ' ':
            continue

        tallies[letter] = tallies.get(letter, 0) + 1

        if tallies[letter] > most_common_count:
            most_common_count = tallies[letter]

    most_common = []

    for letter, count in tallies.items():
        if count == most_common_count:
            most_common.append(letter)

    return sorted(most_common)


def word_length_sorted(words):
    """Return list of word-lengths and words.

    Given a list of words, return a list of tuples, ordered by
    word-length. Each tuple should have two items --- a number that
    is a word-length, and the list of words of that word length.

    In addition to ordering the list by word length, order each
    sub-list of words alphabetically.

    For example::

        >>> word_length_sorted(["ok", "an", "apple", "a", "day"])
        [(1, ['a']), (2, ['an', 'ok']), (3, ['day']), (5, ['apple'])]
    """

    d = {}

    for w in words:
        d.setdefault(len(w), []).append(w)

    out = []

    for k, v in sorted(d.items()):
        out.append((k, sorted(v)))

    return out

    # Alternate, pre-sort method
    #
    # d = {}
    # for w in words:
    #   d.setdefault(len(w), []).append(w)
    # for v in d.values():
    #   v.sort()
    # return sorted(d.items())



##############################################################################
# You can ignore everything below this.


if __name__ == "__main__":
    print
    import doctest
    if doctest.testmod().failed == 0:
        print "*** ALL TESTS PASSED ***"
    print

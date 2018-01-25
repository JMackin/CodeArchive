
def distance(x, y):
    """Given x and y coordinates of a point return distance to origin"""
    return ((x ** 2) + (y ** 2)) ** (0.5)

def evenodd(n):
    """given a number n, return either even or odd."""
    x = n % 2
    if x == 0:
        return("even")
    else:
        return("odd")

def evenodd_list(lst):
    """given a number list replaces all even numbers w/ 'even' and all odds w/ 'odd' """
    numlist = []
    for i in lst:
        numlist.append(evenodd(i))
    return numlist
    
import unittest

class MyTest(unittest.TestCase):
    def test_distance(self):
        self.assertEqual( distance(3, 4), 5 )
        # Add at least two more tests for distance here...

    def test_evenodd(self):
        self.assertEqual( evenodd(5), 'odd' )
        # Add at least two more tests for evenodd here...

    def test_evenodd_list(self):
        self.assertEqual( evenodd_list( [7, -4] ),  ['odd', 'even'])
        # Add at least two more tests for evenodd_list here...

unittest.main()
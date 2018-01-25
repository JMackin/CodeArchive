
def cube(x):
  return x ** 3;
y = cube(5)
print(y)

import unittest
class MyTest(unittest.TestCase):
    def test_cube(self):
        self.assertEqual( cube(5), 125 )
        self.assertEqual( cube(0), 0 )
        self.assertEqual( cube(2), 8 )

unittest.main()
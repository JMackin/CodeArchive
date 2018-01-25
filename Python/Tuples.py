tuple = ("red","blue","green","purple")

"""print elements from index 0 to 3"""
print(tuple[0:3])

"""remove blue and add yellow"""

y = ("yellow",)
tuple1 = tuple[0:1]
tuple2 = tuple[2:]
tuple = tuple1 + y + tuple2


print(tuple)

"""Is green or orangte in the tuple?"""

if "green" in tuple:
	print("true")
	
if "orange" in tuple:
	print("true")
else:
	print("false")
	
"""Slicing"""
pos = 1
word = "abcdefghij"
print(word[0:])
print(word[(pos+2):])
print(word[1:-1])
wordA = word[2:4]
wordB = word[-3:]
word2 = wordB + wordA
print(word2)
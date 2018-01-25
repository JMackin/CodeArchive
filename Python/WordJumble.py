import random

WORDS = ("corn","orange","apple","asparagus","eggplant")

word = random.choice(WORDS)
correct = word
jumble = ""

while word:
	position = random.randrange(len(word))
	jumble += word[position]
	word = word[:position] + word[(position+1):]
	
print(
"""
	Welcome to word jumble
	Unscramble the letters to make a word.
""")

print("The word is: ", jumble)

guess = input("\nEnter your guess> ")

while guess != correct and guess != "":
	print("Sorry, That's not correct")
	guess = input("\nEnter your guess> ")
	
if guess == correct:
	print("That's correct!\nThanks for Playing!")
input("Press Enter to exit")
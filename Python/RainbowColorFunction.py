
def primarycolor(color):
	colors = ("red","blue","yellow")

	if color in colors:
		return("true")
	else:
		return("false")



answer = input("Enter a color> ")
result = primarycolor(answer)

if result == "true":
	print("That's a primary color")
else:
	print("That's not a primary color")




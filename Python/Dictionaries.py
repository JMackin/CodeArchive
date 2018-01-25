geek = {"ya":"This is the def","no":"answer is no"}\

print(geek["ya"])

print(geek.get("no"))

del geek["ya"]

print(geek)

term = input("What would you like to add?: ")

if term not in geek:
	definition = input("Enter your definiton: ")
	geek[term] = definition
	print("\n", term, 'has been added')
else:
	print("\n That term already exists")
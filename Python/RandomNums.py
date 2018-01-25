#Random Numbers and stuff


import random

sqrt(144)

x = random.random()
print(x)

print("--------------")

x = random.randint(0,100)
print(x)

print("--------------")

list = []

for i in range(0,100):
	x = random.randint(1,10)
	list.append(x)
	
print(list)

print("--------------")

print(random.sample(list,3))

print("--------------")

x = "super"

print(x[random.randrange(len(x))])
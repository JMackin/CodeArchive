
try:
	lista = ("enter","hello")
	print(lista[1])

except IndexError:
	lista = ("enter","hi","yes")
	print(lista[2])

except ValueError:
	print("Yeah")


else:
	print("It worked")




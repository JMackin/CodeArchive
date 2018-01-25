e = " "
for i in range(100):
	if (i % 2 == 0) and (i <= 50):
		i = str(i)
		e = e + " "
		print(e + i)
		
	elif (i % 2 == 0) and (i > 50):
		i = str(i)
		e = e[1:]
		print(e + i)
		
	else:
		print(i)
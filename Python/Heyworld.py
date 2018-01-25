 # check if even, odd, or divisable by 5
 
print "Enter a number: "
x = raw_input()
x = int(x)

if (x % 2) == 0:
	print " It's even"

elif (x % 2) != 0:
 	print "It's odd"

elif (x % 5) == 0:
 	print " Divisable by five"

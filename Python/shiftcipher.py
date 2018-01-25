string = input("Enter a string:\n")
output = ""

#Shift 20
for i in string:
  x = ord(i)
  x = x % 97
  x = (x + 20) % 29
  output += str(x) + " "

print(output)

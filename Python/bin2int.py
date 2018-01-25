#!/usr/bin/python
#convert a binary number to base 10

x = 1
print("enter 0 to quit")

while (x != 0):
  num = str(input('Enter Bin: '))
  x = int(num,2)
  print(x)


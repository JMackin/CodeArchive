
list = [0,1,2,3,4,5,6,7]

for i in list:
  print(i," ")
  
print("--------------")

print(list[2])

print("--------------")

list[2] = 215

for i in list:
  print(i," ")

print("--------------")
  
print(list[2:6])

print("--------------")

list.append(10)
print(list)
  
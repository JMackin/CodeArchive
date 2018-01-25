
list = [1,2,3,4,5]
tuple = (1,2,3,4,5)

print(list)
print(tuple)

print(list[2])
print(list[2:])

print(tuple[2])
print(tuple[2:])

list[2] = "corn"
print(list)

tuple = tuple + ("corn",)
print(tuple)

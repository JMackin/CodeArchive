#CS 232 Spring 2018
# Week 04 Lab
#John Mackin & Elizabeth Lujan

#Purpose:
#       To demonstrate the definition of dictionaries and associated methods

price_dict = {"Apples":1.50,"Bananas":5.34,"Pears":2.98,"Carrots":1.12,"Broccoli":0.45}

#2a
print(len(price_dict))

#2b
print(price_dict["Carrots"])

#2c
for i in price_dict.keys(): print(i)

#2d
for i in price_dict.values(): print(i)

#2e
price_dict.update({"Apples":1.99})
#print(price_dict)

#2f
price_dict.update({"Grapes":2.68})
#print(price_dict)

#2g
print("Cauliflower" in price_dict.keys())

#2h
del price_dict["Broccoli"]
#print(price_dict)

#2i
price_sum = 0.0
for i in price_dict.values(): price_sum += i
#print(price_sum)

#3
# max_coordinate_value: accepts dictionary with letter/tuple pairs, and an int (1 or 0)
#Purpose: Returns largest x or y value in all the tuples depending on the int passed

def max_coordinate_value(a_dict,num):
    lrgNum = 0
    for i in a_dict.values():
        if i[num] > lrgNum: lrgNum = i[num]
        #print(i[num]," ",lrgNum)

    return lrgNum



a_dict = {'a':(4,3),'b':(1,2),'c':(5,1)}

print(max_coordinate_value(a_dict,0))















        

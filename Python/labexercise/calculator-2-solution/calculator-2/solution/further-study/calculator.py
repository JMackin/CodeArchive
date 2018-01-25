from arithmetic import *

input_file = open("operations.txt")
output_file = open("results.txt",  'a')

for line in input_file:
    split_action = line.split()

    if len(split_action) < 2:
        print "Warning: Not enough input"
        continue
  
    num1 = split_action[1]

    if len(split_action) < 3: 
        num2 = 0

    else:
        num2 = split_action[2]

    
    if not num1.isdigit() and not num2.isdigit(): 
        output_file.write("those aren't numbers")
        continue
    elif split_action[0] == "+":
        output_file.write(str(add(float(num1), float(num2))))
        output_file.write("\n")

    elif split_action[0] == "-":
        output_file.write(str(subtract(float(num1), float(num2))))
        output_file.write("\n")

    elif split_action[0] == "*":
        output_file.write(str(multiply(float(num1), float(num2))))
        output_file.write("\n")

    elif split_action[0] == "/":
        output_file.write(str(divide(float(num1), float(num2))))
        output_file.write("\n")

    elif split_action[0] == "square":
        output_file.write(str(square(float(num1))))        
        output_file.write("\n")

    elif split_action[0] == "cube":
        output_file.write(str(cube(float(num1))))
        output_file.write("\n")

    elif split_action[0] == "pow":
        output_file.write(str(power(float(num1), float(num2))))
        output_file.write("\n")

    elif split_action[0] == "mod":
        output_file.write(str(mod(float(num1), float(num2))))
        output_file.write("\n")

    else:
        print "Error: Not all commands are in the correct format."

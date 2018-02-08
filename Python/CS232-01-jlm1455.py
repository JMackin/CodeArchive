#CS232-01-jlm1455
# John Mackin
#Last Modified: 02/02/18

#Problem 1
# int int -> int
#Purpose: to list the numbers between two passed numbers at a given frequency
#Returns: number of values listed
#Side Effects: prints each number in the iteration

def multiples_in_range(iter_val,begin_val,end_val):
    
    num_vals = 0
    for i in range(begin_val+iter_val,end_val,iter_val):
        print(i)
        num_vals += 1
        
    return num_vals


#Problem 2
# int -> char
#Purpose: Gives a grade mark based on the given score
#Returns: A letter representing the score
#Side Effects: returns invalid if score is outside grade range

def letter_grade(score):
    
    grade_scale = {10:'A+',9:'A',8:'B',7:'C',6:'D'}

    if (score < 60 and score >= 0):
        grade_mark = 'F'
    elif(score > 100 or score < 0):
        print("Invalid Score")
        grade_mark = 'X'
    else:
        grade_mark = grade_scale[score // 10]

    if (score % 10 <= 2 and (score // 10) in grade_scale.keys()):
        grade_mod = '-'
    elif (score % 10 >= 7 and (score // 10) in grade_scale.keys()):
        grade_mod = '+'
    else:
        grade_mod = ''
    
    

    print(grade_mark+grade_mod)
    return grade_mark + grade_mod


#Problem 3
# anytype -> anytype
#Purpose: returns the value given with an addition of an amount depending on the data type of the passed value
#Returns: the passed value incrimented
#Side Effects: returns original value if passed value is not of type int,float,string, or bool

def bump_it(val):
    
    type_bumps = {type(1):1,type(0.1):0.1,type("aaa"):'!',type(True):0}

    if(type(val) in type_bumps.keys()):
        if(type_bumps[type(val)] is 0):
           return not(val)
        else:
            return val + type_bumps[type(val)]
    else:
       return val


#Problem 4
# string -> string
#Purpose: creates a "nickname" from the string passed
#Returns: a modified string containing the nickname
#Side Effects: converts string to list for easy manipulation then back to string to be returned

def my_name(name):

    name_list = []
    nickname = ""
    for i in name: name_list.append(i)
    
    name_list[0] = name_list[0].upper()
    if len(name_list) >= 5:
        name_list = name_list[0:5]
        if name_list[4] == 'y':
            del name_list[4]
        else:
            name_list.append('y')
            
    for i in name_list: nickname += str(i)
    print(nickname)
    return nickname


#Problem 5
# string -> string
#Purpose: capitalizes or lowercases a string based on the case of itsa letters
#Returns: a new string with modified cases
#Side Effects: if the string is a combo of upper and lower case letters, the function will only flip the first letter.

def flip_case(msg):
    
    if msg.isupper():
        flipped_msg = msg.lower()
    elif msg.islower():
        flipped_msg = msg.upper()
    else:
        if msg[0].isupper():
            flipped_msg = msg[0].lower() + msg[1:]
        else:
            flipped_msg = msg[0].upper() + msg[1:]


    return flipped_msg


#Problem 6
# num -> list
#Purpose: returns a list of numbers in the fibonnaci sequence of a given length starting at 0,1
#Returns: a list with generated fibonacci sequence
#Side Effects: the list must begin at 0 for elegance
 
def fibonacci_list(num):
    
    fib_list = [0,1]

    for i in range(2,num):
        fib_list.append(fib_list[i-1]+fib_list[i-2])

    return fib_list


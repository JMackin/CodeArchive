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
# 
#Purpose:
#Returns: 
#Side Effects:

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
# 
#Purpose:
#Returns: 
#Side Effects:



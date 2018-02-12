#CS 232 Spring 2018 Week 03 Lab
#John Mackin and Chris Velazquez

#Problem 1

#c_to_f: expects a float value -> float farenheit 
#purpose: convert celcius to farenheit

def c_to_f(cel_val):
	return cel_val * 1.8 + 32

#problem 2
#c_to_f_check: expects a float value -> float 
#purpose: returns error if temperature alue is to low

def c_to_f_check(cel_val):
        if cel_val < -273.16:
                print("Temperature is too low!")
                return -9999
        else:
                return c_to_f(cel_val)


#problem 3
#yell_it: expects string/other -> returns nothing
#purpose: prints string arg in all caps, otherwise returns error

def yell_it(msg):
        if type(msg) == type("string"):
                print(msg.upper())
        else:
                print("Not a string!!!")


#problem 4
#divisible_by: expects pos int -> returns nothing
#purpose: checks if an int is divisible by numbers 2-10 inclusive using a for loop
#       and prints results to screen

def divisible_by(num):
        for x in range(2,11):
                if num % x == 0:
                        print(num,"is divisible by",x)

#problem 5
#test_demorgan: expects 2 bool vals -> returns bool val
#purpose: tests deMorgans laws on the 2 bool values

def test_demorgan(p,q):
        first = not(p and q) is (not(p) or not(q))
        second = not(p or q) is (not(p) and not(q))

        if (first is True) and (second is True):
                return True
        else:
                return False
                        

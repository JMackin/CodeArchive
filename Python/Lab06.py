#CS 232 Spring 2018 - Lab 06
#John Mackin and Emily Oparowski

#Problem 1
# Generator function, returns sum of two dice roles from 1 to 6
def dice_roller():
    import random
    while True:
        a_num = random.randint(1,6)
        b_num = random.randint(1,6)
        yield a_num + b_num

#Problem 2
roll_dice = dice_roller()

#Prolem 3a
# void -> bool
# craps sequence using generators 
def play_craps():
    
    for i in roll_dice:
        ans = i
        if ans == 7 or ans == 11:
            return True
            
        elif ans == 2 or ans == 3 or ans == 12:
            return False
            
        else:
            point = ans
            for i in roll_dice:
                if i == point:
                    return True
                    
                elif i == 7:
                    return False

#Problem 3b
# int -> void
# runs a given number of games and computes wins and losses
# side effects: prints number of wins losses and winning percentage
def run_trials(num_of_games):
    wins = 0
    losses = 0
    for i in range(0,num_of_games):
        if (play_craps()):
            wins = wins + 1
        else:
            losses = losses + 1

    print("Wins: ",wins)
    print("Losses: ", losses)
    print("Pass: %", wins / num_of_games * 100)



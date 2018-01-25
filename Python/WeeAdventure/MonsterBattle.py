import random

playerHP = 100
enemyHP = 100
playerAttk = 50
playerDef = 30
enemyAttk = 30
enemyDef = 20
ko = "false"

def attack(move):
	if move == "1":
		dmg = random.randint(5,30)
	else:
		dmg = random.randint(10,40) 
	return dmg
	
def fight(power,HP,Def):
	Def = Def / (random.randint(10,30))
	power = power - Def
	HP = HP - power
	return HP
	

print("A monster appeared!")

while(ko != "true"):
	print("1:Kick 2:Punch\n")
	
	move = input(">")
	power = attack(move)
	enemyHP = fight(power,enemyHP,enemyDef)
	
	print("Attack: ",power)
	print("EnmyHP: ",enemyHP)
	
	if enemyHP <= 0:
		ko = "true"

	
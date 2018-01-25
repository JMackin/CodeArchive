class Critter(object):

	def __init__(self,name,hunger = 0,boredom = 0, mood = "happy"):
		self.name = name
		self.hunger = hunger
		self.boredom = boredom
		self.mood = mood
		print("New Object")

	def __pass_time(self):
		self.hunger += 1
		self.boredom += 1

	def talk(self):
		print("I'm", self.name, " and I feel")
		self.__pass_time()

	def setHunger(self,newVal): #mutator / setter
		self.hunger = newVal

	def getHunger(self): #accessor / getter / property
		return self.hunger

#--------------------------------------------


def main():
	crit = Critter("Jerry")
	crit.setHunger(5)
	crit.talk()

main()
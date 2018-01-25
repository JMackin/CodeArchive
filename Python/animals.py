
def k_animals(aList):
	newList = []
	for i in aList:
		if 'k' in i:
			newList.append(i)
	return newList


animals = ["fish","koala","cat","kangaroo","bird","elephant"]

k_animals_list = k_animals(animals)

print k_animals_list
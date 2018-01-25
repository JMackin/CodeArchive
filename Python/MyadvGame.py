#My adventure game

print "You wake up in a dungeon, and know you must escape\n"
print "You stand up and walk to the end of the hall where you may go left or right"
print "Which way do you go?"

input = raw_input("Enter 1 for right, or 2 for left: ")

if input == "2":
	print " You run in to a monster, and get eaten. You die."

elif input == "1":
	print "You stumble in to a musty room with a box in it"
	print "What do you do?"

	input = raw_input("1:open the box 2:Continue out of the room")

	if input == "1":
		print "You found a potion, you drink it and die"
	elif input == "2":
		print "You continue out of the room and come to a balcony overlooking the city"
	else:
		print "That's not an option"
else:
	print "That's not an option."
#Welcome to the Hackbright Adventure! If you're reading this, I encourage you
#to run this file first in the Python shell to see how it works, so that you
#have a reference as you look at the code!

#Your own adventure game does not need to be this detailed. Do have your user
#make at least two decisions throughout the course of the game (use at least two
#if/elif/else conditionals).  

username = raw_input("What's your name?: ")
buddy = raw_input("What's the name of someone you'd like to go on an adventure with?: ")

print "\n"
print "Great! I'm ready to start the story of %s and %s." % (username, buddy)
print "It's a pretty awesome buddy flick."
print "\n"
print "%s and %s sit on a sidewalk curb on a hot summer day." % (username, buddy) 
print "(This clearly isn't San Francisco.)"
print "They're trying to decide how to spend their day."
print "Summer is full of so many possibilities!"
print"\n"
print "Maybe you can help them make a great decision!:"
print "If you want them to find an ice cream truck to beat the heat, choose '1'."
print "If you think they should go home and play Super Mario Kart, choose '2'."

activity = int(raw_input("What should they do?: "))

if activity == 1:
	print "\n"
	print "%s suggests that they go find some ice cream." % (username)
	print "Luckily, the familiar jingle of an ice cream truck signals serendipity."
	print "An excellently shiny, stereotypically glossy white ice cream truck"
	print "turns onto the street where %s and %s are sitting." % (username, buddy)
	print "They both jump up and run over to the ice cream truck."
	print "A man in a starchy white uniform greets them and asks what they'd like."
	print "\n"
	print "They have a lot of choices! What sounds good?:"
	print '1. "A creamsicle and a strawberry shortcake bar, please."'
	print '2. "A snow cone and a push pop, please."'
	print '3. "Ugh, all of this looks terrible."'

	ice_cream = int(raw_input("> "))

	if ice_cream == 1 or ice_cream == 2:
		print "After placing their order, they check their pockets for the $2.50"
		print "they collectively owe for their very generic treats."
		print "Oh no! While %s has enough money to cover their purchase, %s does not!" % (username, buddy) 
		print "What should %s do???:" % (username)
		print"\n"
		print '1. Pay for both purchases.'
		print '2. Pay for both purchases, but also eat both purchases.'

		purchase = int(raw_input("> "))

		if purchase == 1:
			print "It wouldn't be a buddy flick if a buddy didn't help a buddy out!" 
			print "%s pays for both of them, and they both enjoy their ice cream. Yay!" % (username)

		elif purchase == 2:
			print "You are a terrible person. %s would never do that! Game over!!" % (username)

		else:
			print "I don't understand that command. Please start again and read the directions over."
			print "You can start again by running 'python adventure.py' another time at the prompt."

	elif ice_cream == 3:
		print "Everything looks pretty terrible. Maybe they'll go inside after all and"
		print "read a book on how to make hard choices. The end."

	else:
		print "I don't understand that command. Please start again and read the directions over."
		print "You can start again by running 'python adventure.py' another time at the prompt."

elif activity == 2:
	print "Instead of hoping for the possibility of ice cream,%s and %s choose" % (username, buddy)
	print "the guaranteed-to-be-air-conditioned apartment and video game combo."
	print "Inside, the apartment is delightfully chilly, and the tv is all hooked up."
	print "The two flop out on a pair of beanbags and take to the virtual track."
	print "\n"
	print "After a bit, it's clear that %s is struggling. What should %s do?:" % (username, buddy)

	print "1. Coach %s to success!" % (username)
	print "2. Take advantage of the gap in skills."

	play = int(raw_input("> "))

	if play == 1:
		print "%s puts competition aside and teaches %s to powerslide." % (buddy, username)
		print "After a couple of races, they're doing much better!"
		print "The racing continues late into the night. It's a lot of fun."

	elif play == 2: 
		print "%s totally smokes %s on the track throughout the night. It's really unfair." % (buddy, username)
		print "Man, competitive spirit totally isn't a good buddy film trait."
		print "Like, unless this is a Fast and the Furious franchise movie."
		print "Which it isn't. So good job at making %s a terrible sport. Game over!" % (buddy)

	else:
		print "I don't understand that command. Please start again and read the directions over."
		print "You can start again by running 'python adventure.py' another time at the prompt."

else:
	print "I don't understand that command. Please start again and read the directions over."
	print "You can start again by running 'python adventure.py' another time at the prompt."






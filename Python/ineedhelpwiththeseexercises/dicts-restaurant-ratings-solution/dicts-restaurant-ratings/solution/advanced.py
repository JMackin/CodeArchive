import random 


def process_scores():
    """Return dictionary of restaurants and ratings."""

    scores_txt = open('scores.txt')

    scores = {}

    for line in scores_txt:
        line = line.rstrip()
        restaurant, score = line.split(":")
        scores[restaurant] = int(score)

    return scores


def add_restaurants(scores):
    """Add a restaurant/rating."""

    restaurant = raw_input("Restaurant name> ")
    rating = raw_input("Rating> ")
    rating = int(rating)

    scores[restaurant] = rating


def random_rating_game(scores):
    """Rate restaurants in a loop until user quits."""
    print "Hi, what's your name?"
    name = raw_input('> ')
    print "Hi %s! Time to rate some restaurants. Type q to quit." % name 

    while True:

        # Pick a random restaurant key
        restaurant = random.choice(scores.keys())

        print "The current rating for %s is %d." % (restaurant, scores[restaurant])
        resp = raw_input('What is your rating for %s> ' % restaurant)
        if resp == 'q':
            break

        new_rating = int(resp)
        scores[restaurant] = new_rating


def print_sorted_scores(scores):
    """Print sorted dictionary."""

    for restaurant in sorted(scores):
        print "%s is rated at %d." % (restaurant, scores[restaurant])


scores = process_scores()
add_restaurants(scores)
random_rating_game(scores)
print_sorted_scores(scores)
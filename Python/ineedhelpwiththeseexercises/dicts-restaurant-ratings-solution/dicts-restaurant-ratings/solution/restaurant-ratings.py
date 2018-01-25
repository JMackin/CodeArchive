scores_txt = open('scores.txt')

scores = {}

for line in scores_txt:
    line = line.rstrip()
    restaurant, score = line.split(":")
    scores[restaurant] = int(score)

for restaurant in sorted(scores):
    print "%s is rated at %d." % (restaurant, scores[restaurant])
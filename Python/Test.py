
import pickle

shape = ["whole","spear","chip"]
brand = ["Claussen", "Heinz", "Vlassic"]

f = open("Pickles.dat", "wb")

pickle.dump(shape,f)
pickle.dump(brand, f)

f.close()


f = open("Pickles.dat","rb")
shape = pickle.load(f)
brand = pickle.load(f)

import random

vowels = "aeiou"
consonants = "bcdfghjklmnpqrstvwxyz"

letter1 = input("What letter would you like? Press v for a vowel, c for a consonant: ")
letter2 = input("What letter would you like? Press v for a vowel, c for a consonant: ")
letter3 = input("What letter would you like? Press v for a vowel, c for a consonant: ")

def lettergenerator():
    if letter1 == 'v':
        firstletter=random.choice(vowels)
    elif letter1 == 'c':
        firstletter=random.choice(consonants)
    else:
        firstletter=letter1

    if letter2 == 'v':
        secondletter=random.choice(vowels)
    elif letter2 == 'c':
        secondletter=random.choice(consonants)
    else:
        secondletter=letter2

    if letter3 == 'v':
        thirdletter=random.choice(vowels)
    elif letter3 == 'c':
        thirdletter=random.choice(consonants)
    else:
        thirdletter=letter3

    name = firstletter+secondletter+thirdletter

    return(name)

for i in range(10):
	print(lettergenerator())

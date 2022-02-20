import random  

# random number between 1 to 100
rd = random.randint(1, 100)

# user guesses none mean nothing
userGuess = None


guess = 0


while userGuess != rd:

   
    userGuess = int(input("Guess the number: "))

    
    guess += 1

    
    if rd == userGuess:
        print("you guess it write \n")
    elif rd > userGuess:
        print("Choose! large num  ")
    else:
        print("Choose! Small num  ")

print(f"it was {rd} and you guess it in {guess} times")


'''For store  hi score '''


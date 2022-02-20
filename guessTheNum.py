import random  # import random

# random number between 1 to 100
rd = random.randint(1, 100)

# user guesses none mean nothing
userGuess = None

# how many time to guess it
guess = 0

# when you guess it right its return false
while userGuess != rd:

    # For user input in int
    userGuess = int(input("Guess the number: "))

    # guesses +1 mean when while run he add 1 in guess variable
    guess += 1

    # Conditional to cheak
    if rd == userGuess:
        print("you guess it write \n")
    elif rd > userGuess:
        print("Choose! large num  ")
    else:
        print("Choose! Small num  ")

# Printing how many guess to guess it right
print(f"it was {rd} and you guess it in {guess} times")


'''For store  hi score '''
# # Open hiscore.txt for store hi score
# with open("log\hiscore.txt", "r")as f:
#     fileread = int(f.read())

# # To store hi score
# if guess < fileread:
#     print("you have just! broken hi score")
#     with open("log\hiscore.txt", "w")as f:
#         f.write(str(guess))

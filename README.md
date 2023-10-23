# guessing-game
Basic guessing game played as follows :

When the player starts the game, a random number will be generated.

The player will then be prompted to “Pick a number between 1 and 100”. The range from 1 to 100 is inclusive, so the number can be 1, or 100 or any number in-between.
If the number chosen is outside of this range, then an error message should be displayed saying “Your guess is not between 1 and 100, please try again”.

When the player enters a valid guess (a number between 1 and 100), the game should prompt the player with one of three messages:

1.       “Please pick a higher number” (if the number they chose is lower than the randomly generated number), or
2.       “Please pick a lower number” (if the number they chose is higher than the randomly generated number), or
3.       “You win!” (if they guess the correct number)

The player only gets 5 chances to guess the number. If they haven’t guessed the correct number after 5 tries, then the game is over

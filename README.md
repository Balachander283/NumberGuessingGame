# NumberGuessingGame

This is a simple number guessing game in Java that generates a random number between 1 and 100 and prompts the user to guess it. The game offers three levels of difficulty: easy, medium, and hard, each with a different number of attempts allowed.

Usage

To run the game, execute the NumberGuessingGame.java file. The program will prompt the user to select a difficulty level and then ask the user to input a number within the given range of that level. If the user's input matches the randomly generated number, the game is won. Otherwise, the program provides a hint for the user to guess again. The game ends either when the user correctly guesses the number, or when the maximum number of attempts is reached.

How to play

- Run the program.
- Select a difficulty level by entering a number between 1-3.
- Enter a number between 1-100 to guess the randomly generated number.
- Repeat step 3 until the number is guessed or until the maximum number of attempts is reached.
- If the number is guessed, the game is won. Otherwise, the game is lost.

Implementation Details

The program uses the java.util.Random class to generate a random number between 1 and 100. It also uses the java.util.Scanner class to accept user input. The number of attempts allowed for each difficulty level is predefined.

Improvements

The game could be further improved by adding additional features, such as a leaderboard to display the highest scores, the option to choose a range of numbers to guess from, and the ability to save the game state to continue playing later.

Contributions

Contributions to this project are welcome. If you have an idea for an improvement, please submit a pull request.

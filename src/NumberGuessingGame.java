import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int highestScore = 100;

		while (true) {
			int randomNumber = rand.nextInt(100) + 1;
			System.out.println("Welcome to the Number Guessing Game!");
			int tryCount = 0;
			int easy = 11, medium = 6, hard = 4, level;
			System.out.println("Enter the level you want to try.");
			System.out.println("1. Easy\n2. Medium\n3. Hard\nEnter a number (1 - 3) to choose the level: ");
			do {
				while (!sc.hasNextInt()) {
					System.out.println("Please enter a number (1 - 3) to choose the level:");
					sc.next();
				}
				level = sc.nextInt();
				if (level < 1 || level > 3) {
					System.out.println("Invalid level. Please enter a number (1 - 3) to choose the level:");
				}
			} while (level < 1 || level > 3);

			if (level == 1) {
				while (true) {
					int user_input;
					do {
						System.out.println("Enter a number between 1 and 100: ");
						user_input = sc.nextInt();
					} while (user_input < 1 || user_input > 100);
					if (easy > tryCount) {
						tryCount++;
					}
					if (user_input == randomNumber) {
						System.out.println("Congratulations, you win!");
						System.out.println("You guessed the number in " + tryCount + " tries.");
						if (tryCount < highestScore) {
							highestScore = tryCount;
							System.out.println("You have a new high score! " + highestScore);
						} else {
							System.out.println("Your high score is " + highestScore + " tries.");
						}
						break;
					} else if (user_input < randomNumber) {
						System.out.println("Little higher, try again.");
					} else if (user_input > randomNumber) {
						System.out.println("Little lower, try again.");
					}

					if (easy == tryCount) {
						System.out.println("You are out of tries :(");
						if (highestScore == 100)
							highestScore = 0;
						System.out.println("Your high score is " + highestScore + " tries.");
						break;
					}
				}
			}

			else if (level == 2) {
				while (true) {
					int user_input;
					do {
						System.out.println("Enter a number between 1 and 100: ");
						user_input = sc.nextInt();
					} while (user_input < 1 || user_input > 100);
					if (medium > tryCount) {
						tryCount++;
					}
					if (user_input == randomNumber) {
						System.out.println("Congratulations, you win!");
						System.out.println("You guessed the number in " + tryCount + " tries.");
						if (tryCount < highestScore) {
							highestScore = tryCount;
							System.out.println("You have a new high score! " + highestScore);
						} else {
							System.out.println("Your high score is " + highestScore + " tries.");
						}
						break;
					} else if (user_input < randomNumber) {
						System.out.println("Little higher, try again.");
					} else if (user_input > randomNumber) {
						System.out.println("Little lower, try again.");
					}

					if (medium == tryCount) {
						System.out.println("You are out of tries :(");
						if (highestScore == 100)
							highestScore = 0;
						System.out.println("Your high score is " + highestScore + " tries.");
						break;
					}
				}
			}

			else if (level == 3) {
				while (true) {
					int user_input;
					do {
						System.out.println("Enter a number between 1 and 100: ");
						user_input = sc.nextInt();
					} while (user_input < 1 || user_input > 100);

					if (hard > tryCount) {
						tryCount++;
					}
					if (user_input == randomNumber) {
						System.out.println("Congratulations, you win!");
						System.out.println("You guessed the number in " + tryCount + " tries.");
						if (tryCount < highestScore) {
							highestScore = tryCount;
							System.out.println("You have a new high score! " + highestScore);
						} else {
							System.out.println("Your high score is " + highestScore + " tries.");
						}
						break;
					} else if (user_input < randomNumber) {
						System.out.println("Little higher, try again.");
					} else if (user_input > randomNumber) {
						System.out.println("Little lower, try again.");
					}

					if (hard == tryCount) {
						System.out.println("You are out of tries :(");
						if (highestScore == 100)
							highestScore = 0;
						System.out.println("Your high score is " + highestScore + " tries.");
						break;
					}
				}
			}

			System.out.println("Want to play again ?(y/n)");
			String playAgain = sc.next();
			if (!playAgain.equalsIgnoreCase("y")) {
				break;
			}

		}
		sc.close();
	}
}

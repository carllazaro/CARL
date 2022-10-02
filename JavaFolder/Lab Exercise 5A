import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
public class GuessingGame {
	static int attempts = 1;
	public static void main(String[] args) {
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(50) + 1;
		new GuessingGame(randomNumber);
	}
	public GuessingGame(int randomNumber) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Guess a number from 1 to 50!");
			
			int guess;
			try {
				do {
					guess = s.nextInt();
					if (guess == randomNumber) {
						System.out.println("You got it in " + attempts + " attempt(s)!");
						System.exit(0);
					}
					else if (guess < randomNumber) {
						System.out.println("Too low. Try again.");
						attempts++;
					}
					else if (guess > randomNumber) {
						System.out.println("Too high. Try again.");
						attempts++;
					}
				}
				while (true);
			}
			catch (InputMismatchException ex) {
				System.out.println("Invalid input.");
				new GuessingGame(randomNumber);
			}
		}
	}
}

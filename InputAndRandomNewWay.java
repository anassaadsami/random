package random;

import java.util.Random;
import java.util.Scanner;

public class InputAndRandomNewWay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		guess(input);
		

	}
	public static void guess(Scanner input) {
		int guesses = 0;
		while (guesses < 3) {
			System.out.println("Guess a number between 1-100: ");
			int guessedNumber = input.nextInt();
			int randomNumber = randomizeNumber();
			guesses = guesses + compare(guessedNumber, randomNumber);    // if false so we add 1 to the counter 
		}
		
		System.out.println("Good bye! *Boom*");
		
		
	}

	   public static int randomizeNumber() {
		Random randomGenerator = new Random();
		return randomGenerator.nextInt(100);
		
	}
	// method return 0 if true or return 1 if false 
	  public static int compare(int guessedNumber, int randomNumber) {
		
		if (guessedNumber == randomNumber) {
			System.out.println("Good job!");
			return 0;
		} else {
			System.out.println("Too bad!"); 
			return 1;
		}
		
	}

}

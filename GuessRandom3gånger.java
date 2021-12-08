package random;

import java.util.Random;
import java.util.Scanner;

public class GuessRandom3gånger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		checkNo(input);

			input.close();
	}
	public static void checkNo(Scanner input) {
		Random rand = new Random();
		int randNum = rand.nextInt(10);
		int guess;
		int no_of_guess = 1;
		
		do {
			System.out.print("enter your guess # " + no_of_guess);
			 guess = input.nextInt();

			if (guess == randNum) {
				System.out.println("bra jobbat");
			} else {
				if (no_of_guess <3 )
				System.out.println("du är dum");
				
				else
					System.out.println("too bad");
					no_of_guess++;
				}
				
			

			} while (guess != randNum&& no_of_guess <= 3);
		
	}

}

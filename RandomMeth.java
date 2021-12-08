package random;

import java.util.Scanner;

public class RandomMeth {

	public static void main(String[] args) {
	randomMehtod();
	
		
		
	}
	public static void randomMehtod() {
		
		Scanner input = new Scanner(System.in);
		int random = (int) (Math.random() * 10) + 1;
		int guess;
		int no_of_guess = 1;

		do {
			System.out.println("enter your guess # " + no_of_guess);
			guess = input.nextInt();

			if (guess == random) {
				System.out.println("bra jobbat");
			} else {
				System.out.println("du är dum");
				
				if (no_of_guess==3)
					System.out.println("too bad");
					no_of_guess++;
				}
				
			

			} while (guess != random && no_of_guess <= 3);
		
	input.close();	

	}

}

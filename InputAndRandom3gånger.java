package random;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class InputAndRandom3gånger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		gissGame(input);
		gissGame2(input);

		input.close();

	}

// guess random number max 3 times with different message
	public static void gissGame(Scanner input) {
		Random rand = new Random();
		int myGiss = 0, i;
		int number = rand.nextInt(100) + 1;
		System.out.println(number);
		boolean flag = false;
		do {
			try {
				for (i = 1; i < 4; i++) {
					System.out.print("enter your giss no " + i + ":");

					myGiss = input.nextInt();
					if (myGiss == number ) {
						System.out.println("you are good ");
						flag = true;
						break;
					} else 
						if (i == 3)
						break;
					System.out.println("try again");
				}
				if (myGiss != number && i == 3) {
					System.out.println("too bad");
					flag = true ;
				}
			} catch (InputMismatchException e) {
				input.nextLine();     // its very important to prevent infinite loop
				System.out.println("you must enter integer");
			}

		} while (!flag);
	}

	public static void gissGame2(Scanner input) {
		Random rand = new Random();
		int randNum = rand.nextInt(10);
		System.out.println(randNum);
		
		for (int i = 0; i < 3; i++) {
			System.out.print("enter your no: ");
			int guess = input.nextInt();
			if ( guess == randNum) {
				System.out.println("bra jobbat");
				break;
			}else 
				if(i < 2)
				System.out.println("try again.");
				else 
					System.out.println("too bad");
		}
		System.out.println("goodbye");

	}

	

}

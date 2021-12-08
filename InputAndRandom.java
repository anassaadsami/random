package random;

import java.util.Random;
import java.util.Scanner;

public class InputAndRandom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		guessRand(input);

		input.close();

	}

	// method takes max 3 time guess number and check it with random number by using
	// do while loop and IT'S EASIER than for loop
	public static void guessRand(Scanner input) {
		int RandNum;
		int myNum = 0;
		int i = 0;
		boolean flag = false;
		Random rand = new Random();
		RandNum = rand.nextInt(100) + 1;
		System.out.println(RandNum);
		do {
			do {
					try {
						for (i = 1; i < 4; i++) {
						System.out.print("enter your number no " + i + ":");
						myNum = input.nextInt();
						if (myNum == RandNum && i < 4) {
							System.out.print("very good!");
							flag = true ;
							break;
						} else 
							if (i == 3)
								break ;
							System.out.println("try again");
						}
						if (myNum != RandNum && i == 3)
							System.out.println("too bad!");
						
					} catch (Exception e) {
						input.nextLine();
						System.out.println("invalid input");
					}
				

			} while (myNum != RandNum && i < 4);

		} while (!flag);
	}
}

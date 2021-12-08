package random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ChooseWinnerFromArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		displayWinner(input);

		input.close();

	}

	// user input no of members and then input their names and return them as a
	// ArrayList
	public static String[] namesOfmembers(Scanner input) {
		System.out.print("how many persons want to share:");
		int numOfMembers = input.nextInt();
		String[] arrayOfMembers = new String[numOfMembers];
		input.nextLine(); // very important otherwise it give me (numOfMember-1)
		for (int i = 0; i < numOfMembers; i++) {
			System.out.print(" member no " + (i + 1) + " name: ");
			arrayOfMembers[i] = input.nextLine();
		}
		return arrayOfMembers;

	}

	// method choose random one name ( as a winner)from ArrayList.
	public static String chooseWinner(Scanner input) {
		String[] myMembers = namesOfmembers(input);
		Random random = new Random();
		int noOfWinner = random.nextInt(3);
		String winner = myMembers[noOfWinner];

		return winner;
	}

	public static void displayWinner(Scanner input) {
		System.out.printf("the winner in this lotteri is: %S", chooseWinner(input));
	}

}

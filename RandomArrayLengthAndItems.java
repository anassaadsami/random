package random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArrayLengthAndItems {
	static int length;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(Arrays.toString(displayString(4, 4)));
		input.close();

	}

	public static String[] displayString(int members, int memberLenght) {
		String[] names = new String[members];
		Random rand = new Random();
		String x = "abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < members; i++) {
			String member = "";
			for (int j = 0; j < memberLenght; j++) {
//				member += x.charAt(rand.nextInt(x.length() - 1));   the same code in lines 46,47
				char y = (char) ('a' + rand.nextInt(26));
				member += y;

			}
			names[i] = member;

		}

		return names;
	}

}

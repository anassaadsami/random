package random;

import java.util.ArrayList;
import java.util.Random;

public class RandomUniqueArray {

	public static void main(String[] args) {


//		System.out.println(uniguenumbers2(10));
		System.out.println(uniguenumbers2(10));
	}

	// method return ArrayList with all unique items
	public static ArrayList<Integer> uniguenumbers() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Random rand = new Random();
		while (numbers.size() < 10) { // if we code size()<=10 -----> it will be 11 items
			int x = rand.nextInt(10); // in array cause we can get just unique numbers
			while (!numbers.contains(x)) // between 0 to 9
				numbers.add(x);
		}
		return numbers;

	}

	// method print random numbers in range inclusive max and min
	public static void randomInRange(int max, int min) {
		int x = 0;
		for (int i = 0; i < 10; i++) {
			x = (int) (Math.random() * ((max + 1) - min) + min);
			System.out.println(x);
		}
		
		
	}
// takes the size if array and return ArrayList with unique items
	public static ArrayList<Integer> uniguenumbers2(int a) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Random rand = new Random();
		while (numbers.size() < a) { // if we code size()<=10 -----> it will be 11 items
			int x = rand.nextInt(a); // in array cause we can get just unique numbers
			while (!numbers.contains(x)) // between 0 to 9
				numbers.add(x);
		}
		return numbers;

	}

}

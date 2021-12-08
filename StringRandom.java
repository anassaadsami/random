package random;

import java.util.Random;

public class StringRandom {

	public static void main(String[] args) {
		

//		System.out.println(stringRandom(4));
//		System.out.println(randomOfString(4));
		System.out.println(randomOfString2());

	}
	// takes length and return array of char which its items are the word
	public static char[]stringRandom(int length) {
		String chars = "abcdefghijklmnopqrstuvwxyz";
		char[]word = new char[length];
		Random rand = new Random();
		for (int i = 0; i <length; i++) {
			int x = rand.nextInt(26); // we can code rand.nextInt(chars.lenght)
			 word[i]= chars.charAt(x);
			
	}
		return word;
}
	// takes length and return the word directly
	public static String randomOfString(int length) {
		String chars = "abcdefghijklmnopqrstuvwxyz";
		String myWord ="";
//		char[]word = new char[length];
		Random rand = new Random();
		for (int i = 0; i <length; i++) {
			int x = rand.nextInt(26);
			 myWord+= chars.charAt(x);
 // we can code directly myWord+= chars.charAt(rand.nextInt(26));
			
	}
		return myWord;

}
	// method return a random word with different length each time.
	public static String randomOfString2() {
		String chars = "abcdefghijklmnopqrstuvwxyz";
		String myWord ="";
//		char[]word = new char[length];
		Random rand = new Random();
		// this method rand.nextInt(bound) give different int random under its parameter
		int length = rand.nextInt(4);    //  0 <= myWord < 4
		for (int i = 0; i <length; i++) {
			int x = rand.nextInt(26);
			 myWord+= chars.charAt(x);
			
	}
		return myWord;

}
}

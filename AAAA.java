package random;



import java.util.ArrayList;
import java.util.Arrays;

//import java.util.Arrays;

import java.util.Random;

public class AAAA {

	public static void main(String[] args) {
//		int[] num = new int[5];
//		Random rand = new Random();
////		int x =0 ;
//		int p = 0;
//		while (p < num.length) {
//
//			for (int i = 0 ; i< num.length ; i++) {
//				int x = rand.nextInt(5);
//				if (num[i] != x ) {
//					num [i]= x;
//				}else {
//					x= rand.nextInt(5);
//						
//					System.out.println(Arrays.toString(num));
//				}
//				p++ ;
//			}
//
//		}
//		
		System.out.println(uniguenumbers2(5));
	}
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

package random;

import java.util.Scanner;

public class Pappa {
	 static int random ;
		

	public static void main(String[] args) {
		random = (int)(Math.random()*100+1);
		
		if (random % 2 == 0) {
			System.out.println("random are even");
			if (random <= 50) {
				System.out.println("random are between 2...50");
			}else {
				System.out.println("random are betwewen 52...100");
			}
		}else {
			System.out.println("random are odd");
//			boolean prime_Num = primeNum();
//			if (prime_Num) {
//			System.out.println("the number is prime ");
			if ( random <= 49) {
				System.out.println("random are smaller 50");
				
			}else {
				System.out.println("random are bigger than 50");
			}
		}
		
		
		Scanner input = new Scanner(System.in);
		int counter, guess ;
		for (counter = 0; counter <= 10; counter++) {
		System.out.println("enter your guess:");
		guess = input.nextInt();
		input.close();
		

		if (guess >random ) {
			System.out.println("your guess bigger than random ");
		}else if (guess < random ) {
				System.out.println("your guess smaller than random ");
		
		}else {
			System.out.println("good right choice");
		}

	}
	}
	
}
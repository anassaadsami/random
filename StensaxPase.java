package random;

import java.util.Scanner;

public class StensaxPase {

		static String myChoice;
		static  String player ;
//		static int random ;  // i can not code static random cause it is no the same variable between methods
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			for (int i = 1; i <= 3; i++) {	
		
			input(scan);
			player = convert(randomMehtod());   // the parameter of convert method are what random method returns.
			compareStrint();
			System.out.println("player takes: "+player);
			}
			scan.close();
		}
		
		public static String input(Scanner scan) {
			
			System.out.print("enter your word( sten , sax , pase):");
			myChoice = scan.next().toLowerCase();
//			input.close();
			return myChoice ;    
			
		}
		public static void compareStrint() {
			
			if (!myChoice.equals("sten") && (!myChoice.equals("pase")) && (!myChoice.equals("sax"))){
				System.out.println("you must choose from the list, try again:");
			}else if (myChoice.equals("sten") && player.equals("sax")) {
				System.out.println("myChoice win ");

			}else if (myChoice.equals("sax") && player.equals("pase")) {
				System.out.println("myChoice win ");

			}else if (myChoice.equals("pase") && player.equals("sten")) {
				System.out.println("myChoice win ");	
			}	else if (myChoice.equals(player)) {
				System.out.println("equal");		

			}else {
				System.out.println("you lost");
			}
		}
		
		public static int randomMehtod() {
			int random = (int) (Math.random() * 3) + 1; 
			return random ;
		}

		public static String convert(int X) {

			if (X == 1) {       // we recall randomMethod inside this method
				return "sax";
			}else if (X== 2) {
				return "sten";
			}else 
				return ("pase");

		}
		// another method Ali
		public static String convert1(int X) {
			String word = "";
			if (X == 1) {       // we recall randomMethod inside this method
				word =  "sax";
			}else if (X== 2) {
				word =  "sten";
			}else {
				word = "pase";
			}
			return word ;

		}
		

}

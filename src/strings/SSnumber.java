package strings;

import java.util.Scanner;

public class SSnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentance = "none";
		char letter = 'd';
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Tell me your SS number!");
			sentance = input.nextLine();
			System.out.println(sentance.substring(5));
			System.out.println(sentance.substring(3,5));
			System.out.println(sentance.substring(0,3));
			}
		}

	
}
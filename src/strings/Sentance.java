package strings;

import java.util.Scanner;

public class Sentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentance = "none";
		char letter = 'd';
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Please enter a sentance");
			sentance = input.nextLine();
			System.out.println("The X is at position " + sentance.indexOf('x') + " and the sentance is "
					+ sentance.length() + " character long.");
			for (int count = 1; count <= (sentance.length()-1); count++) {
				letter = sentance.charAt(count);
				System.out.println(letter);
				System.out.println(sentance.substring(0,count));
				
			}
		}System.out.println(sentance.toLowerCase());
		System.out.println(sentance.toUpperCase());
		System.out.println(sentance);

	}
}
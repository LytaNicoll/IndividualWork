package strings;

import java.util.Scanner;

public class Sentance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentance = "none";
		char letter = 'd';
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Please enter a sentance");
			sentance = input.nextLine();
			System.out.println("The sentance is " + sentance.length() + " characters long.");
			for (int count = 0; count < sentance.length(); count++) {
				letter = sentance.charAt(count);
				if (letter != 'a' && letter != ' ' && letter != 'A' && letter != '?') {
					System.out.print(letter);
				}
				if (letter == '?') {
					System.out.print(".");
				}
			}
		}

	}
}
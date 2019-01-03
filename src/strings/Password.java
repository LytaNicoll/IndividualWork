package strings;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "none";
		String name2 = "none";
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Please enter a password");
			name = input.nextLine();
			System.out.println("Please verify your password");
			name2 = input.nextLine();
			while(!name.equals(name2)){
				System.out.println("WRONG!");
				System.out.println("Please verify your password");
				name2 = input.nextLine();
			}
			}System.out.println("Your passwords match");
		}
	
}


package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> bob = new ArrayList<String>();
		try (Scanner input = new Scanner(System.in)) {
			String name = "bob";
			for (int i = 0; i < 50; i++) {
				System.out.println("Enter a string");
				name = input.nextLine();
				bob.add(name);
			}
			if (bob.size() > 0) {
				bob.remove(bob.lastIndexOf(name));
			}
			if (bob.size() > 0) {
				bob.remove(0);
			}
			System.out.println(bob);
		}

	}
}

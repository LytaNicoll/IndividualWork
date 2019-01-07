package interfaces;

import java.util.ArrayList;

import arrays.Friend;
import java.util.Scanner;

public class PersonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int min = 1;
		int max = 24;
		String total = "N/A";
		ArrayList<Common> bob = new ArrayList<Common>();
		for (int i = 0; i < 2; i++) {
			System.out.println("Please enter a name");
			String jeff = input.nextLine();
			Teacher joe = new Teacher();
			joe.setName(jeff);
			bob.add(joe);
		}
		for (int i = 0; i < 2; i++) {
			System.out.println("Please enter a name");
			String jeff = input.nextLine();
			Student joe = new Student();
			joe.setName(jeff);
			bob.add(joe);
		}
		for (int i = 0; i < bob.size(); i++) {
			total = bob.get(i).getName();
			if (total.length() > 10) {
				System.out.println("Here is the name of a person with more than 10 chars in their name: " + total);
			}
		}

	}

}

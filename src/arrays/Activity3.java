package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Rectangle> bob = new ArrayList<Rectangle>();
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 400; i++) {
			Rectangle sue = new Rectangle(50+(int) (Math.random() * (70 - 50+ 1)), 50+(int) (Math.random() * (70 - 50 + 1)));
			bob.add(0,sue);
		}
		for (int i = 0; i < 400; i++) {
			System.out.println(bob.get(i).area());
		}
	}

}

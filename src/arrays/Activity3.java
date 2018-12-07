package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Rectangle> bob = new ArrayList<Rectangle>();
		try (Scanner input = new Scanner(System.in)) {
			double remArea = 0;
			for (int i = 0; i < 399; i++) {
				Rectangle sue = new Rectangle(50 + (int) (Math.random() * (70 - 50 + 1)),
						50 + (int) (Math.random() * (70 - 50 + 1)));
				bob.add(sue);
			}
			Rectangle lee = new Rectangle(51, 60);
			bob.add(0, lee);
			Rectangle joe = new Rectangle();
			joe = bob.remove(bob.size() - 1);
			bob.set(0, joe);
			for (int i = 0; i < bob.size(); i++) {
				System.out.println(
						"The rectangle with an area of " + bob.get(i).area() + " Units is rectangle number " + (i + 1));
			}
		}
	}
}
package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Rectangle> bob = new ArrayList<Rectangle>();
		try (Scanner input = new Scanner(System.in)) {
			double remArea = 0;
			for (int i = 0; i < 10000; i++) {
				Rectangle sue = new Rectangle(0 + (int) (Math.random() * (499 - 0 + 1)),
						0 + (int) (Math.random() * (499 - 0 + 1)));
				bob.add(sue);
			}
			Rectangle lee = new Rectangle(10, 60);
			int count=0;
			for (int i = 0; i < bob.size(); i++) {
				if(bob.get(i).getWidth()==lee.getWidth()){
					count++;
				}
				
			}
			System.out.println("There are " +count+ " rectangles with a width of 10");
		}
	}
}
package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class FEActivity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many circles");
		int circles = input.nextInt();
		ArrayList<Circle> bob = new ArrayList<Circle>();
		for (int i = 0; i < circles; i++) {
			System.out.println("Enter a radius");
			Circle blue = new Circle(input.nextDouble());
			bob.add(blue);
		}

		for (Circle temp : bob) {
			System.out.print(temp.area() + "   ");

		}
		input.close();
	}

}

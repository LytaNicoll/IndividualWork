package arrays;

import java.util.Scanner;

public class names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[][] names = new double[18][5];
		for (int i = 0; i < 18; i++) {
			for (int j = 0; j < 5; j++) {
				Friend bob=new Friend();
				bob.setAge(0 + ((int) (Math.random() * (100 - 0 + 1))));
				names[i][j]=bob.getAge();
			}
		}
		for (int i = 0; i < 18; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(names[i][j]+"   ");
			}System.out.println();
		}
		

	}
}
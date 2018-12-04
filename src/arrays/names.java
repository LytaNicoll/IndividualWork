package arrays;

import java.util.Scanner;

public class names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[][] names = new String[4][12];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 12; j++) {
				System.out.println("Please give me a name");
				names[i][j]=input.nextLine();
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 12; j++) {
				System.out.print(names[i][j]+"   ");
			}System.out.println();
		}
		

	}
}
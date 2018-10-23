package Loop;

import java.util.Scanner;

public class DoubleNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int blue = 0;
		int num = 0;
		while (num != 9999) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please input a number(9999 to quit)");
			num = input.nextInt();
			if (num!=9999){
			blue = num+blue;}
			if (num == 9999) {
				System.out.println(blue);
			}
		}
	}

}

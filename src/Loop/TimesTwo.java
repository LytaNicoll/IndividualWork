package Loop;
import java.util.Scanner;
public class TimesTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int blue=0;
		try(Scanner input= new Scanner (System.in)){
			System.out.println("Please input a number");
			int num=input.nextInt();
		while (count <= num) {
			blue+=count;
			count+=2;
		}
	}System.out.println(blue);

}
}

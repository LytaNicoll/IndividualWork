package Loop;
import java.util.Scanner;
public class SpecNum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		try(Scanner input= new Scanner (System.in)){
			System.out.println("Please input a number");
			int num=input.nextInt();
		while (count <= num) {
			System.out.println(count);
			count=count +2;
		}
	}

}
}

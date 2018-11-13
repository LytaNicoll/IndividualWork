package strings;
import java.util.Scanner;
public class Sentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentance="none";
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a sentance");
		sentance = input.nextLine();
		System.out.println(sentance.indexOf('x')+" "+sentance.length());
		
	}

}

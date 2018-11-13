package strings;
import java.util.Scanner;
public class Sentance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentance="none";
		String blue="hi";
		char sen='h';
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a sentance");
		sentance = input.nextLine();
		System.out.println("Please enter a sentance");
		blue = input.next();
		sen=sentance.charAt(0);
		System.out.println(sen);
		sen=sentance.charAt(1);
		System.out.println(sen);
		sen=sentance.charAt(2);
		System.out.println(sen);
		System.out.println(sentance.contains("bob"));
		System.out.println(sentance);
		
	}

}

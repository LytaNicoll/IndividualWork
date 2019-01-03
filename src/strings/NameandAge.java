package strings;
import java.util.Scanner;
public class NameandAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "none";
		int age=0;
		Scanner input= new Scanner(System.in);
		System.out.println("What is your name?");
		name=input.next();
		System.out.println("What is your age?");
		age=input.nextInt();
		System.out.println(name+" "+age);
	}

}

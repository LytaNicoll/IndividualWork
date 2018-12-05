package arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>bob=new ArrayList<String>();
Scanner input=new Scanner(System.in);
for(int i=0;i<2;i++){
System.out.println("Enter a string");
bob.add(input.nextLine());
}
System.out.println("Enter a string");
bob.add(0,input.nextLine());
System.out.println("Enter Your name");
bob.add(input.nextLine());
System.out.println(bob);
	}

}

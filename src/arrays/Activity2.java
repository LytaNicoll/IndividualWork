package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Friend> bob = new ArrayList<Friend>();
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter a name");
			Friend sue = new Friend(input.nextLine(), (int) (Math.random() * (100 - 0 + 1)));
			bob.add(0,sue);
		}
		
		System.out.println("Please enter your name");
		Friend name=new Friend(input.nextLine(),17);
		bob.add(name);
		for (int i = 0; i < 4; i++) {
			System.out.print(bob.get(i).getName()+", ");
			System.out.println(bob.get(i).getAge()+" ");
		}
	}

}

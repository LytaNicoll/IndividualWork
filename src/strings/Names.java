package strings;

import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "none";
		String name2="none";
		char letter = 'd';
		char let='d';
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Please enter a name");
			name = input.nextLine();
			System.out.println("Please enter another name");
			name2 = input.nextLine();
			letter=name.charAt(0);
			let=name2.charAt(0);
			if(let>letter){
				System.out.println(name.toUpperCase()+ " is first in alphabetical order");
			}
			else if(let<letter){
				System.out.println(name2.toUpperCase()+ " is first in alphabetical order");
			}
			else{
				letter=name.charAt(1);
				let=name2.charAt(1);
				if(let>letter){
					System.out.println(name.toUpperCase()+ " is first in alphabetical order");
				}
				else if(let<letter){
					System.out.println(name2.toUpperCase()+ " is first in alphabetical order");
				}
			}
		
				
			
		}

	}
}
package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<hi> bob = new ArrayList<hi>();
		Scanner input = new Scanner(System.in);

			for (int i = 0; i < 10000; i++) {
				hi sue = new hi(0 + (int) (Math.random() * (1600 - 0 + 1)));
				bob.add(sue);
			}
			System.out.println("What number should I look for?");
			int num=input.nextInt();
			hi lee = new hi(num);
			int count=0;
			for (int i  = 0; i < bob.size(); i++) {
				if (bob.get(i).getHi()==lee.getHi()){
					count++;
				}
				
		}
		if (count>0){
			System.out.println("There were "+count+" instances of this score");
		}
		if(count==0){
			System.out.println("There were no instances of this number");
		}
	}
}
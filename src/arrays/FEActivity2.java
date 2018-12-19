package arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class FEActivity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double high=0;
		Scanner input=new Scanner(System.in);
		System.out.println("How many workers");
		int workers=input.nextInt();
		ArrayList<hi> bob = new ArrayList<hi>();
		for(int i=0;i<workers;i++){
			System.out.println("Enter a wage");
			hi blue=new hi(input.nextInt());
			bob.add(blue);
		}
		
		for(hi temp:bob){
			if(temp.getHi()>high){
				high=temp.getHi();
			}
		}
		System.out.println("The highest wage is: "+(high));
		input.close();
	}

}

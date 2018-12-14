package Classes;
import arrays.Friend;
import java.util.ArrayList;
import java.util.Scanner;
public class Greeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("How many junks do you want to make?");
		int num=input.nextInt();
		ArrayList<PileOJunk>silver=new ArrayList<PileOJunk>();
		for(int i=0;i<num;i++){
			PileOJunk bob=new PileOJunk();
			silver.add(bob);
		}
		int counter=0;
		for(PileOJunk temp:silver){
			counter++;
			System.out.println("The ID number is: "+ PileOJunk.idNumber(counter));
			System.out.println("The sum of 4 and 5 is: " +PileOJunk.summy(4,5));
			System.out.println("The origninal num was: "+temp.getNum());
			temp.setNum(4);
			System.out.println("The new num is: "+temp.getNum());
		}
	}

}

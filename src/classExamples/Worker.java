package classExamples;
import java.util.Scanner;
public class Worker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			workers Bob=new workers();
			Bob.setWage(9.5);
			Bob.setLevel(3);
			System.out.println("Your new wage is: " +Bob.getWage());
	}

}

package arrays;
import java.util.Scanner;
public class FEActivity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tot=0;
		Scanner input=new Scanner(System.in);
		System.out.println("How many students in this class?");
		int students=input.nextInt();
		double[]age=new double[students];
		for(int i=0;i<students;i++){
			System.out.println("Please enter an age");
			age[i]=input.nextDouble();
		}
		for(double y:age){
			tot+=y;
		}
		System.out.println("The average age in this class is: "+(tot/students));
	}

}

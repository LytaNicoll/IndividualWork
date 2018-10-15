package classExamples;
import java.util.Scanner;
public class TestProg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			rectangles Bob=new rectangles();
			Bob.sayNumber(7.5);
			Bob.sayNumbertwo(3.8);
			System.out.println("Now you give me the length and width of a rectangle");
			Bob.sayArea(input.nextDouble(), input.nextDouble());
	}

}

package classExamples;
import java.util.Scanner;
public class TestProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			Numbers Bob=new Numbers();
			Bob.sayNumber(7.5);
			Bob.sayNumbertwo(3.8);
			System.out.println("Now you give me a number!(Or two)");
			Bob.saySum(input.nextDouble(), input.nextDouble());
	}

}

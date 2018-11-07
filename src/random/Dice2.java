package random;
import java.util.Scanner;
public class Dice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
int count=0;
System.out.println("How many sides does this die have?");
int max=input.nextInt();
int min=1;
int rand=0;
System.out.println("How many times is this die rolled?");
int times=input.nextInt();
while (count<times){
	count++;
	rand=min+((int)(Math.random()*(max-min+1)));
	System.out.print(rand+ " ");
}

	}

}

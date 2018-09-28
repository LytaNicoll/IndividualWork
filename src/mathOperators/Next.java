package mathOperators;
import java.util.Scanner;
public class Next {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int init=2;
		Scanner age=new Scanner(System.in);
		System.out.println("How old are you?");
		init= age.nextInt();
		if (init>=18){
			System.out.println("You can already vote!");
		}
		if (init<=17){
			System.out.println("It will be " +(18-init)+ " years until you can vote");
		}
	}

}

package arrays;
import java.util.Scanner;
public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bob="hello";
		String search="hi";
		int count=0;
		int counter=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Sentance please: ");
		bob=input.nextLine();
		System.out.println("Word please: ");
		search=input.nextLine();
		String[]words=bob.split(" ");
		for(count=0;count<words.length;count++){
		if(words[count].equals(search)){
			counter++;
		}
		}System.out.println(counter);
	}
	
}

package arrays;
import java.util.Scanner;
public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
int[]scores=new int[250];
String[]names=new String[20];
int add=0;
int let=0;
for(int i=0;i<250;i++){
scores[i]=0 + ((int) (Math.random() * (1000 - 0 + 1)));

}
for(int k=0;k<20;k++){
	System.out.println("Enter a name");
	names[k]=input.next();
}
System.out.println("How long should i look for?");
let=input.nextInt();
for(int l=19;l>=0;l=l-1){
	int temp=names[l].length();
	if(temp==let){
		System.out.println("The name "+names[l]+" has "+let+" letters");
	}
}
for(int j=249;j>=0;j=j-1){
	if(scores[j]>add){
		add=scores[j];
	}
	}System.out.println(add);
	System.out.println("Number of items in array: " +scores.length);

}

}

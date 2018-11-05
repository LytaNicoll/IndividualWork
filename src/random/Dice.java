package random;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
int max=13;
int min=1;
int rand=0;
int threes=0;
while (count<87){
	count++;
	rand=min+((int)(Math.random()*(max-min+1)));
	if (rand%3==0){
		threes++;
	
	}
}
System.out.print("You have " +threes+ " multiples of three");
	}

}

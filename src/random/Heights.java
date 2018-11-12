package random;

public class Heights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
int max=43;
int min=26;
int rand=0;
int howMany=0;
while (count<248){
	count++;
	rand=min+((int)(Math.random()*(max-min+1)));
	if (rand-36>0){
		howMany++;
	
	}
}
System.out.print("There are " +howMany+ " first graders over three feet");
	}

}

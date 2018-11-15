package strings;

public class EssayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Essay bob=new Essay();
bob.setName("Minie Crafter");
bob.setEssay("Wolves are the best, Andrea!");
System.out.println(bob.getName());
System.out.println(bob.getEssay());
System.out.println("The author's last name is "+ bob.getLast());
System.out.println("The author's first name is " +bob.getNumber()+" characters long");
System.out.println("The statement that the author's name has an x in is is "+bob.findX());
System.out.println("This essay contains " +bob.wordCount()+" words");
	}

}

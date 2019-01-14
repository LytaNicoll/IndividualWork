package Inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle bob=new Rectangle(4,5);
		System.out.println(bob.area());
		System.out.println(bob.perimeter());
		Trapezoid joe=new Trapezoid(4,3,6,3);
		System.out.println(joe.area());
		System.out.println(joe.perimeter());
		Paralellagram sue=new Paralellagram(4,3);
		System.out.println(sue.area());
		System.out.println(sue.perimeter());
	}

}

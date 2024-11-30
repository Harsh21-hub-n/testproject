package jul_3;

public class Polymorphism_1 {
	//compile time polymorphism (overloading )
	//change number of argument
	public void m1(int a, char b) {

		System.out.println("1st m1"+" "  + a +" & " + b);
	}

	public int m1() {
		System.out.println("2nd m1");
		return 10;
	}

	static void m2(float q) {

		System.out.println(" float type = " +q );
	}
	// change in parameter type (overloading)

	static void m2(String s) {
		System.out.println("string = "+ s);
	}
	public static void main(String []arg) {

		Polymorphism_1 r = new Polymorphism_1();

		r.m1(11,'S');

		System.out.println(r.m1());

	       m2(10.2f);

	       Polymorphism_1.m2("HARSHAD");
	}
}

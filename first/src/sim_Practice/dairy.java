package sim_Practice;

public class dairy {

	static int a=200;

	int b=100;

	static void m1() {

		System.out.println(" static method m1 ");
	}

	  void m2() {

		  System.out.println(b);

		  System.out.println("non static method m2");

		  m3();

		  //static in non static area

		  m1();
		  System.out.println(a);
	  }

	void m3() {
		System.out.println("m3");
	}


	public static void main(String[]atg) {

		// static method

		System.out.println(dairy.a);

		// System.out.println(A.b); non static variable in static area

		m1();
		dairy.m1(); // by using class name

		// non static in static area

		dairy r=new dairy();

		System.out.println(r.b);

		r.m2();
	}
}

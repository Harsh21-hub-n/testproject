package dec_18;

public class pro3 {

	int y=600;

	static void m5() {
		//m2(); call form other class without class name then we get error for static method
		System.out.println("call from other class static method");

		pro2.m2();


	}

	public static void main(String[]arg) {

		m5();

		//m2(); // we can't call other class method directly

		System.out.println("call from other class  main method");

		pro2.m2(); // we can call other class static method through class name.

		pro3 s=new pro3();
		s.m6();

		//s.m1(); we can't call other class method through object of other class.

		pro2 r =new pro2(); // call non static method in other class .
		r.m1();


		// System.out.println(r.a.a);
	}

	void m6() {

		System.out.println(" call from other class non static method");

		pro2.m2();
	}
}

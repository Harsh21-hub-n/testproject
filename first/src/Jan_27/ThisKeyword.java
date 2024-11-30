package Jan_27;

public class ThisKeyword {
	int a;

	ThisKeyword(float c) {
		System.out.println("inside constructor");
	}

	ThisKeyword() {
	 this(10.5f);
		System.out.println("inside default constructor");

	}

	void m1(int a) {
		this.a = a;         // this keyword is used to diff bet instance vari. and local veri.
		System.out.println("inside m1 ");
		this.m2();

	}

	void m2() {
		System.out.println("inside m2 method");
		System.out.println(a);

	}

	public static void main(String[] args) {

		ThisKeyword ob = new ThisKeyword();
		ob.m1(10);

	}

}

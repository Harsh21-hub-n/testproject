package Jan_27;

public class demo2 {
	public static void main(String[]arg) {
		int a=100;
		float b=290.5f;
		demo2 e=new demo2();
		a=e.m(a);
		b=m1(b);
		System.out.println(a);
		System.out.println(b);
	}
	int m(int s) {
		int d=s+1234;

		System.out.println(s);
		return d;
	}
	static float m1(float d) {
		float c=d+100;
		System.out.println(d);
		return c;
	}

}

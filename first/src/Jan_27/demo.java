package Jan_27;
class cyber{
	int a=100;
	void m3() {
		System.out.println("m3");
	}
}



public class demo {
	static int s=100;
	int f=364;
	void m1() {
		System.out.println("inside m");
		System.out.println(f);
	}

	public static void main(String[]arg) {

	demo c=new demo();
	c.m2();
	c.m1();
	System.out.println(c.f);

}
	void m2() {
		System.out.println(s);
		m1();
		cyber x=new cyber();
		x.m3();
		System.out.println(x.a);
	}



}

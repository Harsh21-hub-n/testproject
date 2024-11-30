package Harsh;
class BB
{

}
public class AA
{
	int q=123;
	static int w=1235;
	static {
		System.out.println("ok");
	}
	{
		System.out.println("hi");
	}
	void m()
	{

		System.out.println("inside m method");
	}
	static void m1()
	{

		System.out.println("inside m1 method");
	}
	 void m2(int a)
	 {
		 System.out.println(a);
	 }
	 static void m3(float s)
	 {
		 System.out.println(s);
	 }
	 int m4()
	 {
		 return w;
	 }
	 static int m5()
	 {
		 AA c=new AA();

		 return c.q;
	 }
	public static void main(String[]arg)
	{
		AA d=new AA();
		d.m(); m1(); d.m2(321);m3(777.3f);
		int f=d.m4();
		System.out.println(f);
		int g=m5();
		System.out.println(g);
	}


}

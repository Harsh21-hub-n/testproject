package Jan_27;


class first
{
	first(int a)
	{
		System.out.println("inside parent constructor");
	}
	void m1()
	{
		System.out.println("Inside m1 method");
	}

	void m2(int b)
	{
		System.out.println("Inside m2 method: "+b);
	}
}

public class SuperKeyword extends first
{
	SuperKeyword()
	{

		super(10);
	}

	void child()
	{
		System.out.println("inside child class method");

		//super.m1();
		//super.m2(100);
	}
	public static void main(String[] args) {

		SuperKeyword ob = new SuperKeyword();
		ob.child();

	}

}

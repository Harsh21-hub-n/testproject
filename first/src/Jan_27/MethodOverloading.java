package Jan_27;

class sample
{

	void m1(String str)
	{
		System.out.println("Inside m1: "+str);
	}

}


public class MethodOverloading extends sample {

	void m1(int a)
	{
		System.out.println(a);
		super.m1("java");
	}

	void m1(float a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) {

		MethodOverloading ob = new MethodOverloading();
		ob.m1(10.0f);
		ob.m1(10);
		ob.m1("hello worlld");

	}

}

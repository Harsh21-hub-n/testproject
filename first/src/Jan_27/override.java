package Jan_27;
class pa
{
	void m1()
	{
		System.out.println("parent m1 method");
	}
	 void m2()
	{
		System.out.println(" m2 method---");
	}
}
class ch extends pa
{
	@Override
	void m1()
	{
	System.out.println("child m1");
	}
	void m3()
	{
		System.out.println("m3 method");
	}
}
public class override {
	public static void main(String[]arg) {

		//ch s= new ch();
	//	s.m1();
	//	s.m2();
		pa p=new ch();  //upcasting
		p.m1();
		p.m2();
	//	p.m3();      // C.E
		ch c=(ch)p;  // downcasting
		c.m3();
	}

}

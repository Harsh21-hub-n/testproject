package Jan_27;

class Parent
{
	  void m1()
	  {
		  System.out.println("Inside Parent class");
	  }

	  void m2()
	  {
		  System.out.println("Inside Parent2 class");
	  }
}

class Child extends Parent
{
	@Override
	void m1()
	{
		System.out.println("Inside child class");
	}
}


public class MethodOverloading2 {
	public static void main(String[] args) {

		Parent ob1 = new Child();		// upcasting

		ob1.m2();
		ob1.m1();
		Child c1 = (Child)ob1;			// Downcasting


		c1.m1();
		c1.m2();


	}

}

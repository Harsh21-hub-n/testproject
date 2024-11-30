package dec_18_OOPS;

public class m_over extends adder {


	@Override
	void O1() {

		System.out.println("child class method");
	}
	/*

	   int addition(int g) {

	    	  return 100;
	      }
	      */
	public static void main(String []arg) {


		m_over d= new m_over();

		d.O1();

		d.cat(10);

		System.out.println(d.addition(200));
	}




}

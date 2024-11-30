package April_21;
// write a program to intialize all premative data types.
public class Demo {

	public static void main(String [] arg) {
		byte a= 10;
		 short b=200;
		 int c= 10000;
		 long l= 200000l;

		 float f=100.12f;
		  double d= 1000.23;

		  System.out.println (a + "/n"+ b +"/n"+c+"n/"+l+"/n"+f);

            Demo rap = new Demo();
           rap. swap();
           m();
	}

	//write program for swap to numbers  with non static method

	void swap() {
		int num1, num2;
		 num1=100;
		 num2=200;
		 int num3;
		 num3= num1;
		 System.out.println(num3);
		 num1= num2;
		 System.out.println(num1);
		 num2=num3;
		 System.out.println(num2);
		 System.out.println("end of the era");



	}
// call static method in main method

	static void m() {

		int a= 100;
		 int b=2000;
		 System.out.println(a+b);
	}



}

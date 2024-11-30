package dec_18;

public class Pro9_wrap {
	/*
	      wrapper classes are used to

	       1. to convert data type to object format
	       2.to convert data into one format to other format.

	       int --- Integer

	       float ---- Float
	       double ---- Double
	       char ----- Character
	       boolean ---- Boolean

   */

	// scenario 1--- string ---> int, boolean, double, char.

	// String ----> int  - Integer.parseInt(String value)
	// String ----> double - Double.parseInt(String value)
	// String ---->boolean - Boolean.parseInt(String value)
	// String ---->char - not supported.

	public static void main(String[]arg) {

		// string to int

		String s= "welcome";

		//int sint= Integer.parseInt(s); // we can't conver aplphabets to number

		String a= "100";
		String b= "200";

		System.out.println(a+b);

		System.out.println(Integer.parseInt(a) + Integer.parseInt(b));

		// string to double

		String q = "30.5";
		String w= "10";

		double d= Double.parseDouble(q);

		double e= Double.parseDouble(w);

		System.out.println(d+e);

		// string to boolean -

		String r1= "True";

		boolean n= Boolean.parseBoolean(s);

		System.out.println(n+ " test"); // other than true it will retuen false.



		boolean n1= Boolean.parseBoolean(r1);


		System.out.println(n1);


		// any data type to string format

		// String.valueof() - to convert all primative data type to string.

		int y1= 100;
		double y2=90.7;

		float y3 =900.89f;

		char y4= 'H';
		boolean y5=true;

		String s2= String.valueOf(y1);

		System.out.println(s2);

		String s3= String.valueOf(y2);

		System.out.println(s3);

		String s4= String.valueOf(y3);

		System.out.println(s4);

		String s5= String.valueOf(y4);

		System.out.println(s5);

		String s6= String.valueOf(y5);

		System.out.println(s6);




















	}

}

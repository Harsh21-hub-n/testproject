package dec_18_OOPS;

public class Types_cars extends car {

	   // it also known as single inheritance

	String m="new m";
	void type(String x) {

		//String m="new m";
		//System.out.print(x+"=");

		Types_cars z=new Types_cars();

		System.out.print(x+"=");

		    z.Tata();
		    System.out.print(super.m +"="); 
		    z.toyota();

		    System.out.print(z.v +"=");
		    z.Force();

	}

	public static void main(String []arg) {


		Types_cars z=new Types_cars();



		z.type(z.s);


	}

}

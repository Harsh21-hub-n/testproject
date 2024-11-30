package jul_3;

public class Constructor {
	/*
	   // default constructor

		Constructor () {

			System.out.println("royal enfield");
		}

		public static void main (String []arg) {

		Constructor s= new Constructor();



	}
         */

	// if we not create constructor then compiler creare constructor

	  int a;
	  String s;

	   void check() {

		  System.out.println(a + " " + s); // print default value

	   }

	   public static void main(String []arg) {

		   Constructor s= new Constructor();

		   s.check();
	   }
}

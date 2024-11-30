package dec_18;

public class Pro10_excepH {

	/*

	  The Exception Handling in Java is one of the powerful mechanism to handle the
	  runtime errors so that the normal flow of the application can be maintained.



	 */


	   public static void main(String []arg) {
		   // ArithmeticException

		   try {
		     int s=100/0;


		   }
		   catch(ArithmeticException r){

			   System.out.println(r);

			   System.out.println(" test me");


		   }

		   // A scenario where NullPointerException occurs
		   try {
		   String s1=null;

		   System.out.println(s1.length());

		   }

		   catch(NullPointerException t) {

		   System.out.println("null pointer");

		   }

		   catch(Exception y) {

			   System.out.println(y);

			   System.out.println("kk");


		   }

	   }













}

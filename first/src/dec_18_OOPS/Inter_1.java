package dec_18_OOPS;
/*
 *
 *

*/

public interface Inter_1 {

	void amount();

	void bank_name();

	int c=100;

	static int v=300;

	//we can't call interface class static method in other class.

	// we access static method only with in same class.

	static void masy() {

		System.out.println("print masy");
	}

   public static void main(String []arg) {

	   masy();

   }

}

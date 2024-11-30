package dec_18;

public class pro1 {



		// variables

		int a= 200;   // instance variable

		static int b=300; // static variable

		static void h1() {

			int c=400;  // local variable
			pro1 a= new pro1();
			System.out.println(a.a);
			a.h2();
		}

		void h2() {

			// System.out.println(c); we get an error

			System.out.println(a); // we can use every where with in class
			System.out.println(b); // we can use every where with in class
		}

		public static void main(String[]arg) {

			h1();

		}

	}



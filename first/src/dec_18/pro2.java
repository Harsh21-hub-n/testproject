 



package dec_18;

public class pro2 {



		//method

		public void m1() {

			System.out.println(" non static method m1");
		}

		static void m2() {

			System.out.println("static method m2 ");
		}

		public static void main(String[]arg) {

			System.out.println(" start");

			//call static method

			m2(); // in static area we called directly or by class name
			pro2.m2(); // by class name

			//m1(); we can't called non static method in static area directly

			 // new pro2().m1(); another way to call non static method

			pro2 a=new pro2(); // object

			//a.m1();// we called non static method in static area through object

			a.m3();

			System.out.println("end here");
		}

		   // called non static method in non static area

		    void m3() {


		    m1(); // non static in non static area we called directly
		    	m2(); // static in non static area we called directly.

		    }

		    static void m4() {

		    	// called static method
		    	m2();
		    	pro2 q=new pro2();
		    	q.m3();
		    }
	}




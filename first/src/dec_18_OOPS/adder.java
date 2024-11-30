package dec_18_OOPS;

public class adder {

	// polymorphism

	// compile time polymorphism - method overloading by changing number of parameter

	// There are two ways to overload the method in java

    //   By changing number of arguments
    //     By changing the data type

	static int add(int a, int b) {

		return a+b;
	}

	int add(int q, int w, int e) {




		return q+w+e;
	}


	}

	public static void main(String[]arg) {

		adder r= new adder();

		System.out.println(adder.add(10,30)); // use of retrun type

		System.out.println(r.add(10,20,40));

		r.cat("BOB"); r.cat(2);

	}

	// method overloading - through changing data type

	void cat (String s) {

		System.out.println(s);

	}

  void cat (int s) {

		System.out.println("cat age -"+s);

	}

  // Method Overloading is not possible by changing the return type of method only
  /*
     int cat(int r) {

    	 return 10;

     }  */ // it is give CE

      void O1() {

    	  System.out.println("parent ");

    	  int a=100; float b= 200.5f;
    	   double c= a+b;
    	   System.out.println(c);
      }

      int addition(int g) {

    	  return 5;
      }
}

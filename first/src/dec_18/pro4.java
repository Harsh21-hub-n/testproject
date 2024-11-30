

package dec_18;

public class pro4 {
	//return types
	void p1() {

	}

	int p2(int q, float w) {

		System.out.println(q +""+w);



		return 30; // if method have return type then we need to write return

	}
    void p3(char r , int n) {

    	int v=n;
    	System.out.println(r+" "+v+ " M"+n);
    }
	int p4() {

		return 40;
	}
	  public static void main(String[]arg) {

		  pro4 x= new pro4();
		  x.p2(30,77.5f);
		  x.p3('H', 999);

		  x.p6(1,'S');



		  int result =  p7(2, 5);

		  System.out.println(result +" "+" result of return");
	  }

	  void p5() {
		  p4();
	  }

	  int p6(long a , char q) {

		  System.out.println(q + "  " + a);

		  return q;
	  }

	  // return print

	  static int p7(int a, int b) {



		  return a;
	  }

}

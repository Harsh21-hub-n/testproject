

package dec_18;

public class array_1 {

	/*
	 Array in Java is index-based, the first element of the array is stored at the 0th index,
	  2nd element is stored on 1st index and so on.


	 */

	// single dimensional arry

	public static void main(String []arg) {

		int a[] = new int[5];

		a[1]=10;
		a[0]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;


		for(int i=0; i<5; i++) {

			int b=a[i];

			System.out.println(i+ " = " +b);
		}
		
		//another way to add value

		int b[]= {10,22,50,60,40};

		for (int element : b) {
			System.out.println(element);

		}

		// for each loop

		int w[]= {90,100,201,300,890};

		System.out.println("show the length of an arry = "+w.length);

		for(int q:w) {

			System.out.println(q);
		}


		anno(new int [] {20,30,40,50});




	}
	//Anonymous Array in Java

	//Java supports the feature of an anonymous array, so you don't need to declare the array while passing an array to the method.

	static void anno(int xx[]) {

		for(int i=0 ; i<=xx.length-1 ; i++)
		 {
		System.out.print(xx[i] +" ,");
	  }
  }

}

package April_21;

public class control_flow {

	//find grater number by using if statement
	// if statement
	public static void main (String[]arg) {
		int N= 500; int M= 300;

		if(N > M) {

			System.out.println(N);
		}
		System.out.println("stop");

		if (N < M) {

			System.out.println(M);
		}
		if(N == M) {
			System.out.println(M);
		}
		//if .. else statement

		int w=200; int q=300;

		if (w<q) {

			System.out.println("print "+ w);
		}
		else {
			System.out.println(q);
		}

		if(w>q) {

			System.out.println(w);
		}
		else {

			System.out.println(q);
		}


		System.out.println("next stop");
	}




}

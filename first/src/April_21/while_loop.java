package April_21;
 import java.util.Scanner;
public class while_loop {

	public static void main(String[]arg) {

		while_loop a= new while_loop();
		a.n1();



	}

		 //Java Program to print all natural numbers from 1 to n using while loop.
		void n1() {


		int n;
	System.out.println("enter number here -");

        Scanner ref = new Scanner(System.in);
	      n=ref.nextInt();

	  while (n <=10) {

		 System.out.println("number" + n);
		  n+=1;
	  }

   }


	 //Java Program to print all even numbers between 1 to 100 using while loop.

  /*

	  int w =1;

	  int sum = 0;
		while(w<=20) {
			if(w%2 == 0) {
			    sum = sum + w;
			}
			w++;


	   }
		System.out.println(sum);
		*/


		//Java Program to print sum of all odd numbers between 1 to n using while loop.

		/*
		int q=1;
		int sum1=0;

		while (q<=10) {

			if(q%2==1) {
				System.out.println(q + "ODD");
				sum1= sum1+q;
				System.out.println(sum1);
			}
			q++;
		}
		*/


}

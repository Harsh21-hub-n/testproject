package sim_Practice;

import java.util.Scanner;

public class NumF {

	//Java program to print all natural numbers from 1 to n using for loop.


	void natural() {

		Scanner a = new Scanner(System.in);

		System.out.println("enter number here");

		int n= a.nextInt();

		a.close();


		for(int i=0; i<=n ; i++) {

			System.out.println(i);



		}


	}


	//Java program to print all even numbers between 1 to 100 using for loop.

	 void evenN() {

		int n1=100;

		for(int i=0; i<=n1; i++) {

			if(i%2==0) {

				System.out.println("the number is even = " + i );

			}
		/*
			else {

				System.out.println("num are odd = "+ i);
			}
			*/
		}

	}

	 //Java program to print all odd number between 1 to 100 using for loop.

	    void oddN() {

	    	int n2 =20;

	    	for(int j= 0; j<=n2 ; j++) {

	    		if(j %2!=0) {

	    			System.out.println("num is odd =" + j);


	    		}

	    	}
	    }


	 //Java program to print sum of all even or odd numbers between 1 to n using for loop.


	 void evenAdd() {

		 int count=0;

		 int countO=0;

		 Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter a number for method2: ");
        int numb = scanner2.nextInt();
      //  System.out.println("Number entered in method2: " + number);

        scanner2.close();

        for (int i=0 ; i<=numb;i++) {

        	if(i%2==0) {

        		count =count+i;

        	}

        	else {

        		countO=countO+i;
        	}

        }
        System.out.println("sum of even = " + count);

        System.out.println("sum of odd = " + countO);

	 }

	 //Java program to print multiplication of any number using for loop.

	 void multi() {

		 int cont=5;

		 for(int i=1	 ; i<=10; i++) {


			 int c= cont*i;

			 System.out.println(c);

		 }

	 }

	 void countdigit() {
	 //Java program to count the digits of a given number using for loop.

	  // here we use wrapper class format to convert int to string


	   int count1=0;
	    int n3 = 6798;

	    String d= String.valueOf(n3); // convert int to string

	   for(int i=0 ; i<d.length() ; i++){

		   System.out.println(d.charAt(i));
		   count1++;
	   }

	    System.out.println(count1);
	 }


	 private char[] d(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	// Java program to print the sum of digits of a given number using for loop.

	 void digit2() {

		 // another and right way to find digit


		 int n=123405, count=0;
		 int sum=0;
		 // this is another way to start for loop

		 for(;n !=0;n/=10) {
			 System.out.println(n);

			 int m= n%10;

			 System.out.print("  "+m);

			 System.out.println();

			 sum+=m;

			 count++;


		 }
		 System.out.println(sum);
		 System.out.println(count);

	 }

	 // Java program to print all natural numbers in reverse order using for loop.


	  void reverse1() {

		  int m=10;

		  for(int i=m ; i>0 ; i--) {

			  System.out.print(" "+i);

		  }


	  }


	 // Java program to check whether a given number is Prime or not using for loop.

	  void prime() {

		  int m=10;

		  for(int i=1 ; i<=10; i++) {

			for(int j=i; j<=i; j++) {

				if(i%j==0) {

					System.out.println("num is primme "+ i);
				}


			}


		  }


	  }





















	public static void main(String []arg) {


		NumF s= new NumF();

	//	s.natural();
	//	s.evenN();
	//	s.oddN();

	//	s.evenAdd();
	//	s.multi();
	//	s.countdigit();
	//	s.digit2();
	//	s.reverse1();
		s.prime();


	}

}

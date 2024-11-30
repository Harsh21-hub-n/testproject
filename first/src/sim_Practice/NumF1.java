package sim_Practice;

public class NumF1 {

	//Java program to check whether a given number is Prime or not using for loop.


	 void prime1() {
		 int n=7, num=9;
		 boolean flag =false;

		 for (int i = 2; i <= num / 2; i++) {
		      // condition for nonprime number
			 System.out.println(num);
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		 if (!flag) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}
		  }












	public static void main(String[]arg) {


		NumF1 f= new NumF1();

		f.prime1();

	}

}

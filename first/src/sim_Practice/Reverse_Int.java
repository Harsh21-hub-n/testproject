package sim_Practice;

import java.util.Scanner;

public class Reverse_Int {


	public static void main(String [] arg ) {

		int num , store=0 , rem, check ;

		System.out.println("enter value here");

		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		check =num;
		while (num !=0) {
			 rem = num%10;
			 store = store *10 +rem;
			  num= num/10;
		}
		System.out.println("reverse value = " + store);
		if (check == store) {
			System.out.println("palendrom ");
		} else {
			System.out.println("not palendrom");
		}

	}



}

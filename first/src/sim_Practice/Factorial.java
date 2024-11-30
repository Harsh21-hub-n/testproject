package sim_Practice;

import java.util.Scanner;

public class Factorial {

// factorial
     public static void main(String[]arg) {

    	 int num, fact=1;
    	System.out.println("enter value here");

    	Scanner sc =new Scanner(System.in);

        num =sc.nextInt();

    	 for(int i=num ; i>0 ; i--) {

    		 fact=fact *i;


    	 }
    	 System.out.println("factorial value = "+ fact);
     }

}

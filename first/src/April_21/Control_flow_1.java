package April_21;

public class Control_flow_1 {

	/*
	   If Statement:In Java, the "if" statement is used to evaluate a condition.
	   The control of the program is diverted depending upon the specific condition.
	   The condition of the If statement gives a Boolean value, either true or false.
	   In Java, there are four types of if-statements given below.

	   1.Simple if statement
       2.if-else statement
       3.if-else-if ladder
       4.Nested if-statement




	 */

	// Simple if statement

	      int a=9, b=30;
	      int c=20;

	      public static void main(String []arg) {

	    	  Control_flow_1 s= new Control_flow_1();



	    if(s.a+s.b <40) {

	    	System.out.println(" is less than 40");

	    }

	 //   s.v();

	    s.v1();

	 }

	 void v() {

		// if -else statement

		if(this.c +this.b < 40) {

			System.out.println("is less than 40");

		}

		else {
			System.out.println("is greater than 40");
		}





	}


	void v1() {
		/*
		 if-else-if ladder:
		  1.The if-else-if statement contains the if-statement followed by multiple else-if statements.

		 */

		String m="Harsh";

         if(m=="Harsh77") {

        	 System.out.println("harsh77");

         }
         else if(m=="harsh") {

        	 System.out.println("harsh");

         }
         else if(m=="Harsh") {

        	 System.out.println("Harsh++++");


         }

		else {
			System.out.println(" no one");
		}














	}







}

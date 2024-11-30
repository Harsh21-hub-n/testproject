package April_21;

public class ifelse_ladder {

	public static void main(String[]arg) {
		System.out.println("start");
		// find max number
		int a=10 , b=50, c=30, d=40;

		if (a>b && a>c && a>d) {
			System.out.println("largenumber" + a );
		}
		else if(b>c && b>d) {
			System.out.println(b);
		}
		else if(c>d) {
			System.out.println (c);
		}
		else {
			System.out.println("last "+ d);
		}

		//Java Program to check whether a given number is divisible by 3 or not using if-else.
		System.out.println("new start");

		if (c%3 == 0) {
			System.out.println("The number is divisible by 3= " + c);
		}
		else {
			System.out.println("The number isn't divisible by 3 ="+ c );
		}


	}
}
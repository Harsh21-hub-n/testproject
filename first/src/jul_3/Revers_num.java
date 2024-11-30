package jul_3;

public class Revers_num {

	public static void main (String[]arg) {

		int num = 12321; int rev=0; int rem; int p= num;  //12321

		while(num>0) {

			rem = num%10;

			rev= rev*10+rem;

			num =num/10;
		}
			System.out.println(rev);

			//palnedrom
			if (p==rev) {
				System.out.println("palnedrom");
			} else {
				System.out.println(" not palendrom");
			}

	}

}

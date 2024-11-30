package first.java;

public class Pattern321 {
	public static void main(String[]arg) {
		/*1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */


		int rows = 9;
		while( rows>=1) {


			int no=9;
			while(no<=rows) {
			System.out.print("*");
			no=no-1;


		}
System.out.println();
		rows=rows+1;



		}




}
}
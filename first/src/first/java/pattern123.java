package first.java;

public class pattern123 {

	public static void main(String[] args) {
		/*
		  1 1
		  2 12
		  3 123
		  4 1234

		 */

		int row = 4 ;
				while (row>=1) {

					int no = 1 ;
					while (no<=row) {

						System.out.print("*");

						no = no+ 1;
					}
					System.out.println();
					row =row -1;
				}


	}

}

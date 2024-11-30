package dec_18;

public class array_2 {

	  // multidimensional array

	public static void main(String[]arg) {

	//1st apporch of array

		int aa[][] = new int[3][2];

		aa[0][0]=100;
		aa[0][1]=200;

		aa[1][0]=300;
		aa[1][1]=400;

		aa[2][0]=500;
		aa[2][1]=600;

		for (int[] element : aa) {

			for (int c=0; c<=element.length-1;c++) {

				System.out.println(element[c]);


			}

		}

		//2nd apporch of array

		int s[][]= {{35, 45} , {50,60} , {90,80} };

		//find number of row
		System.out.println("number of rows = " + s.length);

		// find number of columns
		System.out.println("number of columns = " +s[0].length);



  }



}

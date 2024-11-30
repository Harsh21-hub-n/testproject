package Harsh;

public class twoDarray {
	public static void main(String[]arg)
	{
		int[][]a=new int[4][3];
		a[0][0]=10;
		a[0][1]=100;
		a[0][2]=200;



		a[1][0]=300;
		a[1][1]=500;
		a[1][2]=600;

		a[2][0] = 200;
		a[2][1] = 234;
		a[2][2] = 45;

		a[3][0] = 120;
		a[3][1] = 435;
		a[3][2] = 32;

		for (int[] element : a) {
			// prints all columns for a specific row = r =1
			for(int i=0;i<element.length;i++) { // 3
				System.out.print(String.format("%-5d", element[i]));
			}
				System.out.println("");
		}
		System.out.println();
		a[1][1] = 8;
		for(int r=0;r<4;r++)  // 4
		{
			// prints all columns for a specific row = r =1
			for(int i=0;i<3;i++) { // 3
				System.out.print(String.format("%-5d", a[r][i]));
			}
				System.out.println("");
		}




	}




}

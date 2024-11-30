package Harsh;

public class twodArrayinitilaztion {
	public static void main(String[]arg)
	{
		int [][]a=new int[][]
				{

			{10,100,300},
			{400,33,2},
			{200,234,45},
			{120,455,32}

				};
				System.out.println("row="+a.length);
			System.out.println("column="+a[1].length);

			for (int[] element : a) {
				for(int c=0;c<element.length; c++) {
					System.out.print( String.format("%5d",element[c]));
				}

				System.out.println(" ");
			}



















	}

}

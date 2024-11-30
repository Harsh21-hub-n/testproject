 package first.java;

public class twodarraysum {
	public static void main(String[]arg)
	{
		int [][]a= new int[][]
				{
			{10, 100, 300},
			{400, 33, 2},
			{200,234,45},
			{120, 40, 400}
				};
				int sum=0, rowSum=0;
				for (int[] element : a) {
					for(int c=0; c<element.length;c++) {

						System.out.print(String.format("%5d",element[c]));
						sum = sum + element[c];
						rowSum = rowSum  + element[c];
					}
					System.out.print(" = " + rowSum);
					System.out.println();
				}
				System.out.println("total sum : " +  sum );

				}


	}



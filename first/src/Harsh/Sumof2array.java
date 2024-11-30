package Harsh;

public class Sumof2array {
public static void main(String[]arg)
{
/*	 int [][]a=new int[][]
			{
		{10,100,300},
		{400,33,2},
		{200,234,45},
		{120,455,32}
			};
	       int sum=0, rowSum=0;
			for(int r=0; r<a.length; r++)
			{
				for(int c=0;c<a[r].length;c++)
				{
					System.out.print(String.format ("%5d",a[r][c]));
			///	sum=sum + a[r][c];
				rowSum = rowSum  + a[r][c];
				}
			//	System.out.println(" ="+sum);
				System.out.print(" = " + rowSum);
				System.out.println();
			}
	*/


	int [][]s=new int[][]
			{
		{10,12,13},
		{1,6,9},
		{7,8,9}
			};

	int [][]d=new int[][]
			{
		{13,33,22},
		{11,22,33},
		{4,5,6}
			};

		/*	int [][]a=new int[3][3];
			for(int r=0; r<3;r++)
			{
				for(int c=0;c<3;c++)
				{
					//System.out.print(String.format("%4d",s[r][c] ));
					//System.out.print(String.format("%4d",d[r][c] ));
					a[r][c]=s[r][c]+d[r][c];
					System.out.print(a[r][c]+" ");
				}
				System.out.println();
			} */


		int [][]v=new int[3][3];
		for(int r=0; r<3; r++)
		{
			for(int c=0;c<3;c++) {
				v[r][c]=0;
				for(int i=0; i<3;i++) {

					v[r][c]+=s[r][i]*d[i][c];


			}
				System.out.print(v[r][c]+" ");
			}
			System.out.println();

		}
}
}

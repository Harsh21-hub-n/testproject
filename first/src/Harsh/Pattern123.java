package Harsh;

public class Pattern123 {
	public static void main(String[]arg)
	{
	/*	2
		57
		10 12 14
		17 19 21 23*/
		int cnt=2;
		for(int i=1; i<=5; i++)
		{
		 for(int j=1; j<=i;j++)
		 {
			 System.out.print(cnt+" ");
			 cnt=cnt+2;
		 }
		 cnt=cnt+1;
		 System.out.println();
		}



	}

}

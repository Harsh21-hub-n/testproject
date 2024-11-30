package first.java;

public class Patternstar {
	public static void main(String[]arg)
	{
		int space=10;
		int totalrow=space;

		int starcount=1;
		for(int i=1; i<=totalrow; i++)
		{
			for(int j=1; j<=space; j++) {
				System.out.print(" *");
			}
			starcount+=1;
			space-=1;
			System.out.println();
		}


	}
}

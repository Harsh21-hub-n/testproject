package first.java;

import java.util.Scanner;

public class atmcard {
	public static void main(String[]arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("please enter un name");

	    String un=s.nextLine();
	    System.out.println("please enter pass ");
		int pass=s.nextInt();
		int count=1;
		do
		{
			if(un.equals("h@rsh") && pass==1234)
			{

				System.out.println("please enter amount");
			break;

			}
			else
			{
				System.out.println("please enter valid un and pass");
				//count++;
			//	break;

			}
			count++;
		}
		while(count<=3);


		s.close();

	}

}

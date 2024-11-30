package Harsh;

public class ForLoop {
public static void main(String[]arg)	{

	for(int j=1; j<=40; j++)
	{

	boolean temp= true;
	for(int i=2; i<j;i++)
	{
		if(j % i ==0) {
			temp= false;

		}

	if(temp) {
		System.out.println( j + "is prime no");
		break;

	}
	 else {
		temp= false;
	//System.out.println(j + " is not prime no");
		break;

	}
	}
	}






}

}

package first.java;

public class ForLoop {
	public static void main(String[] arg) {


		for(int j=1; j<=20; j++)
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
			temp= true;
			System.out.println(j + " is not prime no");


		}
		}
		}
	}
}
	/*	int min=1;

		int max=20;

		boolean temp= true;

		for(int i=min; i<max; i++) {
			if(i==1) {
				System.out.println(i +"its exception");
				continue;

			}
			if(i==2) {
				System.out.println( i + "its prime no");
				continue;
			}
			for(int j=2; j<i;j++) {
				if(j % i==0) {
					temp=false;
					break;

				}
			}
			else{
				temp=true;}



		if(temp)
			System.out.println(j);
		min++;
		}
		}*/














package first.java;

public class ArmstrongNo {

	public static void main(String[]arg)
{




  /*  int no=153;
	String s= String.valueOf(no);
	System.out.println(s+"==>"+s.length());
	int len=s.length();
	double sum=0;
	while(no>0)
	{

		int r=no%10;
	  double power=Math.pow(r,len);
		sum=sum+power;
		System.out.println(sum);
		no=no/10;

	}
	System.out.println(sum); */







	 int no=1;
	 int orgno=no;
	 int cnt=0;
	 int togenno=15;
	 while(cnt<togenno)
	 {

		String s= String.valueOf(no);
		//System.out.println(s+"==>"+s.length());

		int len=s.length();

		double sum=0;

		while(no>0)
		{


			int r=no%10;

			double power=Math.pow(r,len);

			sum=sum+power;

		//	System.out.println(sum);

			no=no/10;

		}
	     //  System.out.println(sum);
		if(sum==orgno)
		{
			cnt++;
			System.out.println(orgno+ "is an armstrong no");
		}

		orgno++;
		no=orgno;
	 }


}

	}

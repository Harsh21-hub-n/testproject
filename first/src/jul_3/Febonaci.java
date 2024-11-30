package jul_3;

public class Febonaci {

	public static void main(String[]arg)
	{
       int a=0; int b=0; int c= 1;
       int num = 10;

       for(int i = 1; i< num ; i++) {

    	   a=b;
    	   b=c;
    	   c=b+a;
    	   System.out.println(a);

       }

	}
}

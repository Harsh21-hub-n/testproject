package Harsh;
class x
{
	x m1()
	{
		System.out.println("hi");

		return new y();
	}
}
public class y extends x
{
      @Override
	y m1()
    {
    	  super. m1();
    	System.out.println("hello");

    //	return  new x();
    	return new y();
    }
	public static void main(String[]arg)
	{
		y s=new y();
	s.m1();
		System.out.println();
	}

}

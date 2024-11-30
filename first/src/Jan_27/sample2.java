package Jan_27;
interface it21
{
	void loan1();
	void insurance1();
	void finance1();
}
abstract class loan implements it21
{
	@Override
	public void loan1()
	{

		System.out.println("loan");
	}
}
abstract class insurance extends loan
{
	@Override
	public void insurance1()
	{
		this.loan1();
		System.out.println("insurance");
	}
}
class finance extends insurance
{
	@Override
	public void finance1()
	{this.insurance1();

		System.out.println("finanace");
	}
}
public class sample2 {
	public static void main(String[] arg)
	{
	/*	finance fe=new finance();
		fe.finance1();
		fe.loan1();
		fe.insurance1();*/
		it21 df=new finance();
		df.finance1();
	}

}

package Jan_27;
interface usern
{
	void user();
}
interface passw extends usern
{

	void pass();
}

public class facebook implements passw
{
	@Override
	public void user()
	{
		System.out.println("enter username");

	}
	@Override
	public void pass()
	{
		System.out.println("enter pass");

	}
	public static void main(String[]arg)
	{
		facebook call=new facebook();
		call.user();
		call.pass();
	}

}

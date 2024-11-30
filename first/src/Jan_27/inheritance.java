package Jan_27;
class student
{
	int roll ,marks;
	String name;
	void stdinput()
	{
		System.out.println("please enter valid detils");
	}

}

class std extends student

{
	void det() {


		super.stdinput();

	roll=21;
	marks=81;
	name="Harsh";
	System.out.println(name+" "+roll+" "+marks);

}
}

public class inheritance
{
	public static void main(String[]arg)
	{
		std s=new std();
		s.det();
	}

}

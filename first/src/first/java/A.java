package first.java;
import java.util.Scanner;
class login
{
	private String username;
	private int pass;
	public  void setusername(String f)
	{
		username=f;
	}
	public void setpass(int s)
	{
		pass=s;
	}
	public String getusername()
	{
		return username;
	}
	public int getpass()
	{
		return pass;
	}
	//String s= sc.nextLine(); SString use
	 //int n1=sc.nextInt(); int use
}

public class A
{
	public static void main(String[]arg)
	{
		login z=new login();
		Scanner ad=new Scanner(System.in);
		System.out.println("enter username");
		String S=ad.next();
		z.setusername(S);
		System.out.println("enter pass");
		int x=ad.nextInt();
		z.setpass(x);
		System.out.println(z.getusername());
		System.out.println(z.getpass());

		ad.close();
	}

}

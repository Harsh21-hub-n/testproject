package Harsh;

public class Stringfunctiontoreplace {
	public static void main(String[]arg)
	{
		String s="google oath";
		int cnt=0;
		String replace="";
		for(int no=0; no<s.length(); no++)
		{
		char ch=s.charAt(no);
		if(ch=='o'|| ch=='O')
		{
		cnt=cnt+1;

		}
		if(cnt==2)
		{
		replace=replace+"z";


	//	cnt=cnt+1;

		}
		else {
			replace=replace+ch;

		}

	}
		System.out.println("String replace "+ replace);
	}
}

package Harsh;

public class StringFunction {
public static void main(String[]arg)
{
	// String str="I will be joining Google Inc by Mar 2022";
	// System.out.println("len="+ ""+str.length());
	// System.out.println("len="+str.length()-4);
	String s="6ay3by89ra11230";
	System.out.println(s.length());
	for(int no=0; no<s.length();no++)
	{
    char ch=s.charAt(no);
	if(ch>='0' && ch<='9')
	{
		System.out.println("number in String is="+ch);
	}
	}





}
}

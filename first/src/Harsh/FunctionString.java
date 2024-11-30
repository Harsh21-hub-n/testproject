package Harsh;

public class FunctionString {
	public static void main(String[]arg) {
		String s1="rohit sharma";
		String s2="Virat kholi ";
		String s3;
	//	System.out.println(cstring(s1,s2));
		s3=cstring(s1,s2);

		System.out.println(s3);



	}
	public static String cstring(String s1,String s2) {
		String s;
		int s1Len = s1.length(); //5
		int s2Len = s2.length(); //5

		if (s1Len >= s2Len) {
			s =  s1;
		} else {
			s  = s2;
		}

		return s;





	}

}

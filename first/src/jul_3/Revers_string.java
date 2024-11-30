package jul_3;

public class Revers_string {

	public static void main(String[]arg) {

	   String s= "Nayan";
	 int c=  s.length();

	 String s2 = "";
	 s= s.toLowerCase();
	 for(int i=c-1; i>=0;i--) {

		s2=s2+s.charAt(i);

	 }
  //	s= s.toLowerCase();
	 if (s.equals(s2)) {

		 System.out.println("its true ");
	 }
	 else {
		 System.out.println("not palendrom");
	 }
	 System.out.println(s2);
	}

}

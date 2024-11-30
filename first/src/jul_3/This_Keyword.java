package jul_3;

public class This_Keyword {
	// instance variable
	int a;

	  This_Keyword(int a){
		 //print with this and without this
		  this.a=a;

	  }

	  void Show() {

		  System.out.println(a);
	  }

	  public static void main(String []arg) {

		  This_Keyword r = new This_Keyword (100);
		  r.Show();
	  }

}

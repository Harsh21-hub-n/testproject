package Jan_27;
abstract class d
{
    d(){
    	System.out.println("inside d con");
    }
}

public class demo4 extends d
{
demo4()
{
	//by default super keyword are present
	System.out.println("inside demo4");
}
  public static void main(String[]arg) {

	  demo4 se= new demo4();

  }
}

package dec_18_OOPS;
/*
 *  If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make this class abstract.
 *

*/
public class abs_2 extends abs_1
{
   @Override
void shape() {

	  System.out.println(" reactangle");

  }

  public static void main(String []arg) {


	  abs_1 s= new abs_2();

	  s.shape();
	  abs_1.colour();
  }

  //abstract void mm(); we can't add abastract method in normal class.
}

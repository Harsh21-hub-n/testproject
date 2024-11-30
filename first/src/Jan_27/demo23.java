
package Jan_27;
abstract class sun
{
	abstract void m2();
	 void m3() {
		System.out.println("fs");
	}

}

public class demo23  extends sun
{
	  void m1()
	 {
		  this.m3();
		System.out.println("inside m2");
	 }
 public static void main(String[]arg) {

	 demo23 res=new demo23();
	 res.m1();
	// res.m3();
	 sun re=new demo23();
	 re.m3();


 }
}

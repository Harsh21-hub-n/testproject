package jul_3;

public class Poly_2 extends Poly_1
{
   @Override
void parent() {

	   System.out.println("child class method");
   }
	public static void main(String[]arg) {

		//Poly_1 a =new Poly_1();
		//a.parent();

		Poly_2 a =new Poly_2();

		a.parent(10); // call parent class method (argument method)

		a.parent();//call child class method




	}
}

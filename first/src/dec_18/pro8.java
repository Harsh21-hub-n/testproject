package dec_18;

public class pro8 extends pro7
{

  String B="VODKA";

  final int xx= 300; // final

    @Override
	void bottle() {

    	System.out.println(B);// print current class(child class string)

    	System.out.println(super.B);// PRINT extends class (parent class string)

    	use();

    	// xx=200;  final can't update final varibale.

    }

    void use() {

    	super.bottle();
    	with();

    }

    void with() {

    	System.out.println(" my boys");
    }
	// we can't do static method if we use this or super keyword

	public static void main(String []arg) {

		pro7 s= new pro8();

		 s.bottle();

		// super.bottle();

	}

}
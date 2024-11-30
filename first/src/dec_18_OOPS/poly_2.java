package dec_18_OOPS;

public class poly_2 extends poly_1
{

	poly_2(){

		System.out.println(" test child class");
	}

	void child () {

		System.out.println("child class");

	}

	@Override
	void parent() {

		System.out.println("acess PtoC wh");
	}

	public static void main(String []arg) {
	/*
		poly_1 a=new poly_1();

		a.parent();

		poly_2 s=new poly_2();

	  s.parent(); // this access child class override method

	  s.parent(0); // this access parent method

	  */
	  //upcasting

	  //If the reference variable of Parent class refers to the object of Child class, it is known as upcasting

	  poly_1 w= new poly_2();

	  w.parent();

	  w.parent(12);

	  poly_2 h= (poly_2)w;

	  h.parent();




	}
}

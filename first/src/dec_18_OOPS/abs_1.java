
package dec_18_OOPS;
/*
 * A class which is declared with the abstract keyword is known as an abstract class in Java
 *
 * abstract class have both methods 1.abstract 2.non abstract
 *
 * there are two ways of achieve abstraction  : 1. abstract class (0 to 100 %) 2. Interface (100 %)
 *
 * if class isn't abstract then we can't create and abstract method .
 *
 *  If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make this class abstract.
 *
 * we can't create an object for an abstract class

*/
public abstract class abs_1 {

	abstract void shape ();

	static void colour() {

		System.out.println(" select on user recomanded");

	}



	public static void main(String []arg) {


	//
	//	abs_1 s= new abs_1();  // we can't create an object of abstract class.

	   //s.colour();
	}
}

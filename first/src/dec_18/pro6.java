package dec_18;

public class pro6 {

	// use of this keyword

	// this key word used refer the current class instance variables.

	int s=100;

	char e='r';

	static int s1=200;

	String t ="harshad";

	static int w=1000;

	void mt() {

		String t="sun";
		int s=300;
	int w=1000;
		System.out.println(this.s);// instance variable
		System.out.println(s); // local variable
		System.out.println(this.t);
		System.out.println(this.s1);
		System.out.println(w);
	}

	 public static void main(String[]arg) {

		 pro6 g=new pro6();
		 g.mt();
		// g.mt2();
		// g.mt5();
	 }

	 void mt2() {

		 int s=this.s+900;

		 System.out.println(s);

		 this.s =s +100;

		 System.out.println(this.s);
	 }

	 // this for method

	 // note : if we not use this keyword compiler auto use this for method calling.


	 void mt3() {
		 this.mt4();

		 System.out.println("print mt3");

		 System.out.println(this.s);



	 }

	 void mt4() {

		 System.out.println(" through this keyword");
	 }

	 void mt5() {

		 mt3();
		 System.out.println("end here");
	 }

	 //this key word for constructor


	 pro6(){

		this(500);

		 System.out.println("1st counstructor ");

		// this(500);Call to this() must be the first statement in constructor.

	 }

	 pro6(int s){

		 System.out.println(this.s);
	 }






}

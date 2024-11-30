package dec_18_OOPS;

public class poly_1 {

	void parent() {

		System.out.println(" parent class m");
	}

	void parent(int a){

		System.out.println("parent 2 M");

	 }

	void parent(int a , float b) {

		System.out.println("change in number of parameter");

	}

	poly_1(){

		System.out.println(" test me");
	}

	poly_1(String m){

		System.out.println(" constructor overloading");

	}
	
	void testng() {
		
		System.out.println(" testng");
	}
}

package jul_3;

public class This_keyword_1 {

	//this: to invoke current class method

	void m() {
		System.out.println("print m");
		this.p();
	}
	void p() {
		System.out.println("by using this keyword");
	}
	void n() {
	//	System.out.println("before m");

		m();//if user not add this key word complier add this keyword

		System.out.println("after m");
	}
	public static void main(String []arg) {

		This_keyword_1 q = new This_keyword_1();

		This_keyword_2 z =new This_keyword_2();

	        q.n();
	}
}

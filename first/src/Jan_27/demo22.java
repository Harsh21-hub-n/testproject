package Jan_27;

 abstract class demo21 {
	 abstract void show();
	 abstract void run();

 }

	class demo22{
	void show() {
		System.out.println("show method called");
	}
	void run() {
		System.out.println("run method");
	}
	public static void main(String[]arg) {

		demo22 s=new demo22();
		s.show();
		s.run();

	}

}

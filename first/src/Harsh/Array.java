package Harsh;
 interface got
 {
	 void m();
	 }
 interface boy extends got
 {
	 void s();
 }
 class harsg implements boy
 {
	@Override
	public void s()
	 {
		 System.out.println("hi");
	 }
	@Override
	public void m() {
		System.out.println("hello");
		this.s();
		System.out.println("bye");
	}
 }
 public class Array {
	public static void main(String[]arg)
	{
		harsg r=new harsg();
		r.m();
	}
}

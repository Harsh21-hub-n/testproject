package Harsh;
class dog
{
	int c=199;
	 void mw() {
		System.out.println("hahah");
	}
	dog(){
		System.out.println("bruh");
	}
}
public class Fish extends dog
{
	int a=299;
	void m()
	{
		super.mw();
		this.mw();
		System.out.println(a);
		System.out.println(c);
	}

	public static void main(String[]arg) {

		Fish w=new Fish();
		w.m();
		//dog s=new dog();
	//	System.out.println(s.c);


	}
}






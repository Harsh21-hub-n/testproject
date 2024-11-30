class sample3
{

	void m1()
	{ System.out.println("inside sample -m1# ");
	}

}
 class sample1 extends sample3
 {

	 @Override
	void m1()
	 {
		// System.out.println("inside sample1-m1 ##");
	 }
 }
 class sample
 {
	 public static void main(String[] args)
	 {
		sample1 s1=new sample1();
		s1.m1();


	}
 }
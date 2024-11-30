package Jan_27;
class parent11
{
 void m()
 {
	 System.out.println("parent");
 }
 parent11(int a)
 {
	 System.out.println("inside constructor"+a);
 }
 void m1()
 {
	 System.out.println("inside m1");
 }
}
class child11 extends parent11
{
 @Override
void m()
 {
	 System.out.println("child");
 }
 void m2()
 {
	 System.out.println("inside m2");
 }
 child11()
 {
	 super(3);
	 System.out.println("inside child cons");
 }
 child11(int a)
 {
	 super(10);
	 System.out.println("1 arg cons");
 }
}
public class demo07
{
public static void main(String[]arg)
{
	parent11 p=new child11();
	parent11 d=new child11(77);//upcasting
	d.m();
	d.m1();
	//p.m2();
	child11 c=(child11)d; //downcasting
	c.m2();
}




}
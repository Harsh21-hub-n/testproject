package Jan_27;
interface hdfcacc
{
	void openacc();
}
interface hdfcloan extends hdfcacc
{
	void personall();
}
public class sample1 implements  hdfcloan
{
 @Override
public void openacc()
 {
	 System.out.println("Your acc successfull open welcome in hdfc world ");
 }
 @Override
public void personall()
 {
	this.openacc();
	 System.out.println("your personal loan is approved 'THANK YOU FOR APPLY LOAN'");
 }
 public static void main(String[]arg)
 {
	 sample1 ref=new sample1();
	 ref.personall();

 }
}

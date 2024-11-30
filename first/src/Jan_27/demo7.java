package Jan_27;
interface it11
{
	void HSBC_accc();
}
interface it22 extends it11
{
	void bankacc();
}

public class demo7 implements it22
{
 @Override
public void HSBC_accc()
 {
	 System.out.println("wellcome");
 }
 @Override
public void  bankacc()
 {
	 System.out.println("your bank bal");
 }
 public static void main(String[]arg)
 {
	 demo7 d=new demo7();
	 d.HSBC_accc();
	 d.bankacc();
 }
}

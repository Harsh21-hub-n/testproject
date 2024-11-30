package first.java;
class redbus{
	void payment()
	{
		System.out.println("p for cash");
	}
	void payment(int netb)
	{
		System.out.println("p for netb");
	}
	void payment(String card)
	{
		System.out.println("p for card");
	}
	void payment(float upi)
	{
		System.out.println("p for upi");
	}
}

public class v {
	public static void main(String[]arg)
	{
  redbus r1=new redbus();
  r1.payment("debit card");
  r1.payment();
  r1.payment(100);
  r1.payment(100.5f);
}
}

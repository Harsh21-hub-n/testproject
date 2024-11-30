package Jan_27;

class vechical
{
	private int engino;
	private int torque;

	public void setengino(int eng)
	{
		//System.out.println(eng);
		engino=eng;
		String str="cybersuccess";
		System.out.println(str.charAt(3));
	}
	public void settorque(int tor)
	{
		torque=tor;
	}
	public int getengino()
	{
		//System.out.println(engino);
	//	this.engino=engino;
		return engino;
	}
	public int gettorque()
	{

		return torque;
	}
}




public class encapsulation {
	public static void main(String[]arg)
	{
		vechical swift=new vechical();
		swift.setengino(1234);
		swift.settorque(55);
		System.out.println(swift.getengino());
		System.out.println(swift.gettorque());
	}
}



   // for encapsulation we have set and get
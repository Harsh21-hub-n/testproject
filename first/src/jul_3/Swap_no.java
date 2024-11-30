package jul_3;

public class Swap_no {

	public static void main(String[]arg) {

		int a=1;
		int b=2;
		int c;

		c=a;
		a=b;
		b=c;
		System.out.println("a="+a +"b ="+b);
	//without using 3rd veriable
		int q= 5; int r=10;

		q=q+r;
		r=q-r;
		q=q+r;
		System.out.println("q = "+ q + "  "+"r =" + r);

	}

}

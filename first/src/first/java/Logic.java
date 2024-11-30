package first.java;

public class Logic {
public static void main (String[]arg) {
	int a = 240, b = 300, c =120;
	if (a > b)
	{
		if(a > c) {
			System.out.println("a is max no");
		} else {
			System.out.println("c is max no");
		}

	}
	else if (b >c) {
		System.out.println("b is max no");
	} else {
		System.out.println("c is max no");
	}
}
}

package first.java;

public class Mathlogic {
	public static void main (String[]arg) {
		int a = 100, b =200, c=300, d=400;
		if (a > b)
		{
			if (a > c) {
				if (a > d) {
					System.out.println("a is max no");
				} else {
					System.out.println("d is max no");
				}
			}
			}
			else if (c > d) {
				System.out.println("c is max no");
			} else {
				System.out.println("d is max no");
			}

		else if (b > c)
		{
		else if (b > d) {
			System.out.println("b is max no");
		} else {
			System.out.println("d is max no");
		}
		}
		else if (c > d) {
			System.out.println("c is max no");
		} else {
			System.out.println("d is max no");
		}
		}
		}
	}



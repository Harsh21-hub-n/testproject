package Harsh;

public class Array1 {
	public static void main(String[] arg) {
		String[] a = new String[] { "Virat", "ashin kumar", "rohit sharma", "balaji laxmi", "sachin tendulkar" };

		for (int i = 0; i < a.length; i++) {

			// System.out.println(a[i]);
			String str =a[i] ;

			int b = str.length();
			//System.out.println(b);

			if (b % 2 != 1) {
				System.out.println("string is even=" + i);
			}

		}


	}
}

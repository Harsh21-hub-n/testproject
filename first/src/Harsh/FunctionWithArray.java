package Harsh;

public class FunctionWithArray {
	public static void main(String[] arg) {

		int[] arr = { 11, 23, 45, 23, 32, 21 };

		arr = (addno(arr));
for(int x: arr) {
	System.out.println( x +" ");
}

	}

	public static int[] addno(int[] s) {
		int[] sum = new int[s.length];
		sum = s;

		for (int i = 0; i < s.length; i++) {

			sum[i] = sum[i] + 3;

		}

		return sum;
	}

}

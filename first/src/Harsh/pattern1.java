package Harsh;

public class pattern1 {
	public static void main(String[]arg) {
		int cnt=1;
	   for(int r=1; r<=5;r+=1) {

		for(int c=5;c>=r;c--) {
			System.out.print(" ");

		}

	for(int z=1; z<=cnt;z++) {
		System.out.print("*");
	}
	cnt+=2;
	System.out.println();

		}


	}

}

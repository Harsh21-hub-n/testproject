package Harsh;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[]arg) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter 1st no: ");
		int n1=sc.nextInt();
		System.out.println("enter 2nd no: ");
		int n2=sc.nextInt();
		System.out.println("enter some thing: ");
		String s=sc.nextLine();
		System.out.println(s+(n1+n2));
		sc.close();





	}


}

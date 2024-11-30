package Harsh;
import java.util.Scanner;
public class Scanner1 {
	public static void main(String[]arg) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no : ");
		int n1=sc.nextInt();

		System.out.println("Enter 2nd no: ");
		int n2=sc.nextInt();
		System.out.println("\nEnter some thing: ");
		String s= sc.next();
		System.out.println(s+(n1+n2));



	sc.close();
	}

}

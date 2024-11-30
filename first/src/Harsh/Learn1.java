package Harsh;

public class Learn1 {
	public static void main(String[]arg)
	{
	/*	System.out.println("hello world");
		int num1=3;
		int num2=4;
		int num3=7;
		int sum=num1+ num2+ num3;
		System.out.println(sum);
		System.out.println(); */

	/*	int age=12;
		if(age>20) {
			System.out.println("age is "+age);
		}
		else
		{
			System.out.println("age is below"+age);
		} */

	/*	int i=58;
		if(i>58)
		{
			System.out.println("yes");
		}
		else if(i<45)
		{
			System.out.println("yes yes");
		}
		else if(i<58)
		{
			System.out.println("yes yes yes");
		}
		else
		{
			System.out.println("no");
		}*/
	/*
		int a=90, b=700, c=300;

		if(a>b) {

			if(a>c)
			{
				System.out.println("a is big"+a);
			}
			else
System.out.println("c is big"+c);
		}
       if (b>c) {
    	   System.out.println("b is big"+b);
       } */


		int a=200;
		int b=203;
		int c=300;
		int d=40;

		if(a>b)
		{
			if(a>c)
			{
				if(a>d) {
					System.out.println("a is max="+a);
				} else {
					System.out.println("d is max ="+d);
				}

			}
			else if(c>d)
			{
				System.out.println("c is max="+c);

			} else {
				System.out.println("d is max="+d);
			}



		}
		else if(b>c)
		{
			if(b>d) {
				System.out.println("b is max="+b);
			} else {
				System.out.println("d is max="+d);
			}

		}
		else if(c>d)
		{
			System.out.println("c is max="+c);

		} else {
			System.out.println("d is max="+d);
		}




	}
}

package first.java;

public class Array1 {
	public static void main(String[] arg)
	{

	    int []a= new int[]	{100,400,1000};

		//for(int i=0;i<a.length;i++)
		//{
			//System.out.println("arr[]="+a[i]);


	//	}
	    System.out.println(a.length);

		for(int j=2; j>=0; j--) {
			System.out.println(a[j]);
		}


		String[] str = new String[5];
		for (String element : str) {
			System.out.println(element);  //null
		}

		str[0] = "Orange";
		str[1] = "Red";
		str[2] = "Purple";
		str[3] = "Yellow";
		str[4] = "Blue";
		/*
		 * for(int i=0;i<str.length;i++) System.out.println(str[i]);
		 */
		for(String   s : str) {
			System.out.println(s);
		}

		System.out.println("*************");
		//reverse printing using  while
		int i = str.length-1; //4
		while(i>=0) {
			System.out.println(str[i--]);
		}








	}
}

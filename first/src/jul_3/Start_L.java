package jul_3;

public class Start_L {
	/*
	//this is to print something
	public static void main(String[]ary) {

		System.out.println("HELLO HARSH WELCOME TO JAVA LEARING");
	}
       */

	  //instance
	int a=100;


	public static void main(String [] arg) {

		String s= "They Act as basic mathematical operations." ;
		 int count3=0;
    	 for(int i=0; i<s.length(); i++ ) {

     		if (s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i)== 'u') {

     			System.out.println("  ");
     		}
     		else if(s.charAt(i) != ' ') {
     			count3++;
     		}


     	}
    	 System.out.println(count3);

    	 //remove spaces from string
    	 String s1= s.replaceAll(" ","");

    			 System.out.println(s1);
	}

}

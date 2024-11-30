package jul_3;

public  class Teststring {

	public static void main(String[]arg) {
	// string concept
		String s= "home";
				System.out.println(s);

		//Immutable string in java
				String s1="Harshad";
				s1.concat("Mashal");
				System.out.println(s1);// Harshad not show as harshad mashal
				String s2=s1.concat(" Mashal");
				System.out.println(s2); //Harshad Mashal; use s1 and check

//=============================================================================================================================

	  // calculate total character of string

				String s3 = "They Act as basic mathematical operations." ;

		            int a=	s3.length();
		            System.out.println("total character = "+ a); //42

		// calculate without spaces

		            int count =0;

		        for (int i=1; i<s3.length(); i++) {

		        	if(s3.charAt(i) != ' ') {
						count++;
					}
		        }

		           System.out.println("total character count without spaces = "+count);

		  //only spaces

		           int count1 =0;

			        for (int i=1; i<s3.length(); i++) {

			        	if(s3.charAt(i) == ' ') {
							count1++;
						}
			        }
			        System.out.println("only spaces + "+count1);

//=============================================================================================================================

			        //Count vowels

			        s3=  s3.toUpperCase();
			         System.out.println(s3); //string convert in upper case

			      s3=  s3.toLowerCase();
			         System.out.println(s3); //string convert in lower case

			        int count2=0;

			        for(int i=0; i < s3.length(); i++) {

			        	if(s3.charAt(i) == 'a' || s3.charAt(i) == 'e' || s3.charAt(i) == 'i' ||s3.charAt(i) == 'o' ||s3.charAt(i) == 'u'  ) {
							count2++;
						}
			        }
			        System.out.println(count2);

			      //count consonent

		        	 int count3=0;
		        	 for(int i=0; i<s.length(); i++ ) {

		          		if (s3.charAt(i) == 'a'||s3.charAt(i)== 'e'||s3.charAt(i)== 'i'||s3.charAt(i)== 'o'||s3.charAt(i)== 'u') {
		          			//System.out.println("");
		          		}
		          		else if(s.charAt(i)!= ' ') {
							count3++;
						}

		          	}
		        	 System.out.println(count3+"mm");
	}

}




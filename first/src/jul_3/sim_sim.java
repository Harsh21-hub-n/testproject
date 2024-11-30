package jul_3;

public class sim_sim {

         public static void main(String[]arg) {

        	 String s= "They Act as basic mathematical operations." ;

        	int t= s.length();
        	System.out.println("total lenght with spaces = "+ t);

        	//without spaces count of characters
        	int count=0;
        	for(int i=0; i<s.length(); i++ ) {

        		if (s.charAt(i) != ' ') {
					count++;
				}

        	}
        	 System.out.println(count);

        	 //only spaces
        	 int count1=0;
        	 for(int i=0; i<s.length(); i++ ) {

         		if (s.charAt(i) == ' ') {
					count1++;
				}

         	}
        	 System.out.println(count1);

        	 //Count vowels
        	// s=s.toLowerCase();
        	// s=s.toUpperCase();
        	 int count2=0;
        	 for(int i=0; i<s.length(); i++ ) {

         		if (s.charAt(i) == 'a'||s.charAt(i)== 'e'||s.charAt(i)== 'i'||s.charAt(i)== 'o'||s.charAt(i)== 'u') {
					count2++;
				}

         	}
        	 System.out.println(count2);

        	 //count consonent

        	 int count3=0;
        	 for(int i=0; i<s.length(); i++ ) {

          		if (s.charAt(i) == 'a'||s.charAt(i)== 'e'||s.charAt(i)== 'i'||s.charAt(i)== 'o'||s.charAt(i)== 'u') {
          			//System.out.println("");
          		}
          		else if(s.charAt(i)!= ' ') {
					count3++;
				}

          	}
         	 System.out.println(count3);

  }
}

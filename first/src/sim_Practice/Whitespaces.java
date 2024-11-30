package sim_Practice;

public class Whitespaces {


	public static void main(String[]arg) {

		String str = "Remove white spaces";

	  // remove all white spaces

	//str = str.replaceAll(" ","_");
	System.out.println(str);

	// count words
	int count=1;
	for(int i=0; i<str.length();i++) {

		if(str.charAt(i)== ' ' && str.charAt(i)+1!= ' ') {

			count++;
		}
	}

	    System.out.println(count);

	    //occurance without using a loop

	    String d= "apple";
	  //  char a='a';
	    int c= d.length() - d.replace("a", "").length();
	    int x = d.length() -d.replaceAll("p", "").length();
	    System.out.println(c);
	    System.out.println(x);


	    // reverse string


	     String str1= " HARSHAD";
	     String r ="";
	   for(int i= str1.length()-1; i>=0; i--) {
		   r= r+str1.charAt(i);
		 //  System.out.print(str1.charAt(i));
	   }

	    System.out.println(r);


	    // check all character occurecne

	    String str2 = "occurecne";
	    int count1=1;
	    for(int i= 0; i<str2.length(); i++){

	        for(int j= i+1; j<str2.length();j++) {

	    	if(str2.charAt(i)== str2.charAt(j)) {
	    		count1++;

	         	}

	       }

	    	System.out.println(str2.charAt(i)+" ="+ count1);
	    }










}
}
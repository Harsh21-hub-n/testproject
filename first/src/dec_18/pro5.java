package dec_18;

public class pro5 {

	// constructor

	     pro5(){

		// default constructor : if constructor haven't parameter

		System.out.println("test default");


	}

/*
	 // constructor haven't any return type ()
	int pro5() {


	}
	*/
	 pro5(int c) {
		System.out.println(c);
	}
     public static void main(String[]arg) {

    	 pro5 n= new pro5(3);

    	 pro5 h =new pro5();



     }
     /*
     // constructor can;t be override
     pro5(){
    	 System.out.println("tests ");
     }
     */
}

package jul_3;

public class This_keyword_3 {


		  void m(This_keyword_3 h ){
		  System.out.println("method is invoked");
		  }
		  void p(){
		  m(this);
		  }
		  public static void main(String args[]){
			  This_keyword_3 s1 = new This_keyword_3();
		  s1.p();
		  }
		}



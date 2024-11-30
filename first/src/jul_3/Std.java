package jul_3;

public class Std {


	int id;
	String name;
	//create parameter constructor

	Std(int a, String s) {
		 id=a;
		 name =s;
		System.out.println(id + " " +name);
	}

	public static void main (String[]arg) {

		Std s1=new Std(121, "Sonam");
	}


}

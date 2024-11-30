package dec_18_OOPS;

public class Inter_2 implements Inter_1
{

	@Override
	public void bank_name() {

		System.out.println("HDFC");
	}

	@Override
	public void amount() {

		System.out.println("add amount");

	}

	void amount_1(int a) {

		System.out.println(a);
	}



	public static void main(String[]arg) {

		Inter_1 s=new Inter_2();

		s.bank_name();

		s.amount();

	//	s.masy(); we can't call interface class static method in other class.

	//	s.amount_1(90); by upcasting we cannot access child class methods

		Inter_2 d = new Inter_2();

		d.amount_1(90);


	}


}

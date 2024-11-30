package dec_18_OOPS;

public class encap2 {

	public static void main(String[]arg) {

		// here we hide implimention of 1st class


		encap1_bike w=new encap1_bike();

		w.set_range(411, 30);

		w.set_name("H I M A L A Y A N");

		System.out.println(w.get_name());

		System.out.println(w.get_cc());

		System.out.println(w.get_milage());

		// System.out.println(w.set_range(125, 60));





	}

}

package dec_18_OOPS;

public class cars_features extends Types_cars{

	// multi -level inheritance in this we can access parent of parent class

	void electric()
	{
		cars_features a=new cars_features();

		System.out.print(a.e); // that e vaiable comes from car class

		a.Tata();

	}

	void hybrid()
	{
		cars_features m=new cars_features();


		System.out.print(m.c);
		m.toyota();



	}
	void fule()
	{

		cars_features a=new cars_features();

		System.out.print(a.f);

		a.Force();

	}

	public static void main(String[]arg) {

		cars_features a=new cars_features();

		a.electric();

		a.hybrid();
		a.fule();

	}

}

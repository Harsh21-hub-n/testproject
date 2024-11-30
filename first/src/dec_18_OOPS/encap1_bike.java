package dec_18_OOPS;

public class encap1_bike {

	int a;

	private int cc,milage;

	private String name;

	// through set method we set tha value in instance variable and hide value .that why we use void mrthod.


	public void set_range(int cc, int milage) {

		this.cc=cc;

		this.milage =milage;
	}

	public void set_name(String name) {

		this.name= name;
	}


	// through get method we print the value of instance variable. that why we use return type method

	public int get_cc() {

		return cc;
	}

	public int get_milage() {

		return milage;
	}

	public String get_name() {

		return name;
	}

}

package sim_Practice;

public class Bike {

	private int cc , range;

	private String bilke_name;

	public void setrange(int cc ,int range) {

		this.cc= cc;
		this.range =range;
	}
	public void setname(String name) {

		this.bilke_name = name;
	}

	public int getrange() {

		return  this.range;

	}

	public int getcc() {

		return cc;
	}
	public String getname() {

		System.out.println("pre name - "+ this.bilke_name);

		return this.bilke_name;
	}


}



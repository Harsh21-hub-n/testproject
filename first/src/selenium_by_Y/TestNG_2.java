package selenium_by_Y;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_2 {

	public void login(String userN, String passW) {

		System.out.println(userN);

		System.out.println(passW);

		System.out.println("login pass");
	}

	@AfterTest
	 public void water() {

		 System.out.println("supply water every day after planting");
	 }


	@Test(dataProvider ="getdata")
	public static void kyari(String water, String plant) {

		System.out.println("planting");
		System.out.println(water);
		System.out.println(plant);
	}

	@BeforeTest
   public void pot() {

	   System.out.println("before planting tree");
   }


	@DataProvider
	public Object[][] getdata(){

		Object[][] data = new Object[2][2];

		// 1set

		data[0][0] = "rose_water";

		data[0][1] = "for rose";

		//2nd set

		data[1][0] ="jade_water";

		data[1][1] ="for jade";

		return data;

	}


}

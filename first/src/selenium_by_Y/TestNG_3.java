package selenium_by_Y;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_3 {

	@Test
	public void loginCarLoan() {

		System.out.println("login page of car loan");
	}

	@Test
	public void Carloan_otp() {

		System.out.println("C_loan OTP");

	}

	@Test
	public void carloandone() {

		System.out.println("C_Loan done");
	}

	@Test
	@Parameters({"username","password"})
	public void loans(String urk, String pass) {


		System.out.println(pass);

	     System.out.println(urk);
	}


}

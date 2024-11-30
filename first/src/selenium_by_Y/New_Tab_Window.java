package selenium_by_Y;

import org.openqa.selenium.WebDriver;

public class New_Tab_Window {

	public static void main(String[]arg) {

		System.out.println("Selenium version: " + org.openqa.selenium.Platform.getCurrent());
		/*
		System.setProperty("webdriver.chrome.driver", "D:\\Test_j\\Harsh_TJ\\first\\chromedriver.exe");

		 WebDriver drive =new ChromeDriver();

		 drive.get("https://google.com");

		 drive.manage().window().maximize();

		//Tabs(drive);
		*/
	}

	static void Tabs(WebDriver driver) {

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		// open new tab

	//	driver.switchTo().newWindow(WindowType.TAB) this syntax is used to switch tabs







	}

}

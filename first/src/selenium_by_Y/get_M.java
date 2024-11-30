package selenium_by_Y;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_M {

	public static void main(String []arg) throws Exception {



		//launching chrome browser instance

		WebDriver driver = new ChromeDriver();

		// open url

		driver.get("https://facebook.com");


		//maximize window

		driver.manage().window().maximize();

		// wait

		Thread.sleep(2000);

		// open url through navigate method

		driver.navigate().to("https://www.google.com");

		Thread.sleep(1500);

		// refresh page

		driver.navigate().refresh();

		Thread.sleep(1500);

		//navigate to back

		driver.navigate().back();

		Thread.sleep(2000);

		// navigate to forward

		driver.navigate().forward();

		// fetch current url

		System.out.println(driver.getCurrentUrl());

		// get title of web page

		System.out.println(driver.getTitle());














	//	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();

	//	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();











	}

}

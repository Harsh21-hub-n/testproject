package selenium_by_Y;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Realative_locator {

	public static void main(String[]arg) {


		System.setProperty("webdriver.chrome.driver", "D:\\Test_j\\Harsh_TJ\\first\\chromedriver.exe");

	    WebDriver drive =new ChromeDriver();

	    drive.get("https://www.google.com");

	    drive.manage().window().maximize();



		locator(drive);
	}

	static void locator(WebDriver driver) {


		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	WebElement elements=	driver.findElement(By.cssSelector("[name='name']"));

	//String text=	driver.findElement(with(By.tagName("label")).above(elements)).getText();

	System.out.println( driver.findElement(with(By.tagName("label")).above(elements)).getText());

//	System.out.println(text);




	}
}

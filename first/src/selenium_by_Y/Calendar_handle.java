package selenium_by_Y;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendar_handle {

	public static void main(String[] arg) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		date_1(driver);

	}

	static void date_1(WebDriver dy) throws Exception {

		String year = "2027";

		String month = "6";

		String date = "22";

		dy.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		dy.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();

		dy.findElement(By.xpath(
				"//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']"))
				.click();

		dy.findElement(By.xpath(
				"//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']"))
				.click();

		// here we insted of hard coded we pass one string through concat

		dy.findElement(By.xpath("//button[text()='" + year + "']")).click();

		Thread.sleep(2000);

		// dy.findElement(By.xpath("//abbr[text()='June']")).click(); // this hardcoded

		// this one is excute every time in this logic we convert string to integer

		dy.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month) - 1)
				.click();

		// abbr[text()='22']

		dy.findElement(By.xpath("//abbr[text()='" + date + "']")).click();

		/*
		 * List<WebElement> actualllist= dy.findElements(By.cssSelector(date));
		 *
		 * for (int i=0 ; i<actualllist.size()-2; i++) {
		 *
		 * System.out.println(actualllist.get(i).getAttribute("value")); }
		 *
		 */

		List<WebElement> actualList = dy.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

		for (int i = 0; i < actualList.size(); i++)

		{

			System.out.println(actualList.get(i).getAttribute("value"));

			String[] expectedList = { month, date, year };
			Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);

		}

		dy.close();

	}

}

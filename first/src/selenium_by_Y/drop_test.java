package selenium_by_Y;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_test extends open_chroma {

	/*

	  The 'Select' class in Selenium WebDriver is used for selecting and deselecting option in a dropdown.


	    WebElement testDropDown = driver.findElement(By.id("testingDropdown"));

         Select dropdown = new Select(testDropDown);

         mostly drop down have tagname is "select"
         drop down value will have tag "option"

	  WebDriver provides three ways to select an option from the drop-down menu.

	  1.1. selectByIndex - It is used to select an option based on its index, beginning with 0.

	  dropdown.selectByIndex(5);

	  2. selectByValue - It is used to select an option based on its 'value' attribute.

	  dropdown.selectByValue("Database");

	  3. selectByVisibleText - It is used to select an option based on the text over the option.
	  dropdown.selectByVisibleText("Database Testing");

	 */





	public static void main(String []arg) throws Exception {


		WebDriver drivv =new ChromeDriver();

		drivv.get("https://facebook.com");

		drivv.manage().window().maximize();

		Thread.sleep(2000);

		drivv.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();

		Thread.sleep(1500);


		// drivv.findElement(By.xpath("//select[@id='day']")).click();

		// 1st way

		List<WebElement> drip = drivv.findElements(By.xpath("//select[@id='month']/option"));

		System.out.println(drip.size());

		drip.get(7).click();

		// 2nd way by using selected class

		WebElement dm=drivv.findElement(By.xpath("//select[@id='month']"));

		Select monthm = new Select(dm);

		Thread.sleep(2000);

		monthm.selectByVisibleText("Apr");

		Thread.sleep(2000);

		monthm.selectByValue("11");// nov

		Thread.sleep(2000);

		monthm.selectByIndex(6);


		// 3rd way

		List<WebElement> dropp = monthm.getOptions();

		for (WebElement element : dropp) {


			if(element.getText().equalsIgnoreCase("mar")) {

				element.click();

			}


		}


		//4th way

		dm.sendKeys("Feb");

		//5th way
		Thread.sleep(2000);
		drivv.findElement(By.xpath("//select[@id='month']")).sendKeys("Jan");



		// check drop down supports multiple selection

		System.out.println(monthm.isMultiple());

	}


	/*


		void openchro() throws Exception {


			drop_test t=new drop_test();

			t.Call();

			WebDriver drivv =new ChromeDriver();

			drivv.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();

			Thread.sleep(1500);


			drivv.findElement(By.xpath("//select[@id='day']")).click();


		}

	 */


}

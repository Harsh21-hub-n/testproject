package Sunday_P;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class R_N_C {

	public static void main(String[] arg) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		Radi(driver);

		check(driver);

	}

	static void Radi(WebDriver DD) {

		String rado = "Radio1";

		DD.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		DD.get("https://rahulshettyacademy.com/AutomationPractice/");

		/*
		 * DD.findElement(By.xpath("//input[@value='radio1']")).click();
		 *
		 *
		 * String name =DD.findElement(By.xpath("//input[@value='radio1']")).getText();
		 *
		 * System.out.println(name);
		 */

		List<WebElement> radiooptions = DD.findElements(By.cssSelector(".radioButton")); // for this we need to find
																							// common attribute so we
																							// get list of options

		System.out.println(radiooptions.size());

		Assert.assertFalse(DD.findElement(By.xpath("//input[@value='radio1']")).isSelected());

		// Assert.assertTrue(
		// DD.findElement(By.xpath("//input[@value='radio3']")).isSelected()); //failed

		radiooptions.get(2).click();

		Assert.assertTrue(DD.findElement(By.xpath("//input[@value='radio3']")).isSelected());

		/*
		 * for(int i=0; i<radiooptions.size();i++) {
		 *
		 *
		 * this option is only available if there is text present
		 *
		 * if (radiooptions.get(i).getText().equalsIgnoreCase(rado)) {
		 *
		 *
		 * radiooptions.get(i).click();
		 *
		 * System.out.println(
		 * DD.findElement(By.xpath("//input[@value='radio1']")).isSelected());
		 *
		 *
		 *
		 * }
		 *
		 * // if there is not text present then
		 *
		 *
		 * DD.findElement(By.xpath("//input[text()='"+rado+"']")).click();
		 *
		 * }
		 *
		 */

	}

	static void check(WebDriver DS) {

		DS.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		DS.findElement(By.id("checkBoxOption2")).click();

		System.out.println(DS.findElement(By.id("checkBoxOption2")).getText());

	}

}

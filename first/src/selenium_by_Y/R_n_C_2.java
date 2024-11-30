p
ackage selenium_by_Y;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class R_n_C_2 {


	public static void main(String[]arg) throws Exception {


		WebDriver drive = new ChromeDriver();

		drive.get("https://rahulshettyacademy.com/dropdownsPractise/");

		drive.manage().window().maximize();

		Thread.sleep(2000);

		check1(drive);

		//check2(drive);

		//radio1(drive);
	}
	  // how to click and check check box is selected or not

	/*


	 */

	    static void check1(WebDriver drive)
	    {

	    	Assert.assertFalse(drive.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected());

	    //System.out.println(drive.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected()); // false

	    System.out.println(drive.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isEnabled()); // true

	    	drive.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).click();

	    //	System.out.println(drive.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected()); // true

	    	Assert.assertTrue(drive.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected());

	    }



	    // find count of check box and select on the basis of index

	    static void check2(WebDriver drive) {

	    	List<WebElement>optio= drive.findElements(By.xpath("//input[@type=\"checkbox\"]"));

	    	System.out.println(optio.size());

	    	optio.get(1).click();





	    }

		// radio


	    static void radio1(WebDriver drive) throws Exception {


	    	List<WebElement> radiop = drive.findElements(By.xpath("//input[@type=\"radio\"]"));

	    	System.out.println(radiop.size());

	    	radiop.get(1).click();

	    	Thread.sleep(2000);

	    	radiop.get(0).click();

	    }









}

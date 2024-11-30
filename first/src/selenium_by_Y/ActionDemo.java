package selenium_by_Y;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[]arg ) throws Exception {


		WebDriver driver = new ChromeDriver();


		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



		//mouseh(driver);

		windoswitch(driver);

	}

	static void mouseh(WebDriver DD) throws Exception {


		DD.navigate().to("https://www.flipkart.com/");

		Actions act = new Actions(DD);

		//move to specific element and with build and perform it's not working

		act.moveToElement(DD.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[2]/div[2]/div/div/div/div/a"))).build().perform();

		Thread.sleep(2000);

		//perform click  and add input value  and double click

		//act.click(DD.findElement(By.xpath("//input[@name='q']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

		// another way not need to click method two times

		act.click(DD.findElement(By.xpath("//input[@name='q']"))).keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();


	}


	static void windoswitch(WebDriver ss) throws Exception {


		ss.get("https://rahulshettyacademy.com/loginpagePractise/#/");

		ss.findElement(By.xpath("//a[@class='blinkingText']")).click();

		// through set we get number windows are open

	          Set<String>windows =	ss.getWindowHandles();

	          // pull the id from set data structure

	         Iterator<String> N=  windows.iterator();

	     String one=    N.next();

	     String two=    N.next();



	          ss.switchTo().window(two);

	          Thread.sleep(2000);

	     System.out.println(ss.findElement(By.xpath("//p[@class='im-para red']")).getText());

	 String email =ss.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];

	   //  System.out.println(ss.findElement(By.xpath("//p[@class='im-para red']/strong/a")).getText());

	   //     String email = ss.findElement(By.xpath("//p[@class='im-para red']/strong/a")).getText();

	       // ss.navigate().back()

	        ss.switchTo().window(one);

	        Thread.sleep(2000);

	        ss.findElement(By.id("username")).sendKeys(email);

		// there is another way to bring email id from text through split and trim method also.
	}
}

package Sunday_P;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_n_js {

	public static void main(String[]arg) throws Exception {


		WebDriver d =new ChromeDriver();

		d.get("https://www.google.com");

		d.manage().window().maximize();

		Thread.sleep(2000);

		js(d);

		//alertt(d);

	}

	static void js(WebDriver h) throws Exception {

		h.get("https://rahulshettyacademy.com/AutomationPractice");

		//  JavascriptExecutor jse = (JavascriptExecutor)drivert;

		  JavascriptExecutor jse =(JavascriptExecutor)h;

		//  jse.executeScript("window.scrollBy(0,500)");

		  alertt(h);
	}

	     static void alertt(WebDriver driver) throws Exception {


	    	 driver.findElement(By.id("confirmbtn")).click();

	    	 String text = driver.switchTo().alert().getText();

	    	 System.out.println(text);

	    	 Thread.sleep(2000);

	    	 driver.switchTo().alert().accept();

	     }


}

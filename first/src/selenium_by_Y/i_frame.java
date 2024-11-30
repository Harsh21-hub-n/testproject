package selenium_by_Y;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class i_frame {

	public static void main(String []arg) throws Exception {

		WebDriver driver= new ChromeDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		frme(driver);
	}


	/*Selenium WebDriver operates within a single frame at a time.
	 If a web page contains multiple frames, Selenium needs to switch to the desired frame before interacting with elements inside it.

	# Selenium provides three methods to switch to a frame:

	1. Switch by Index: You can switch to a frame using its index (starting from 0).
	 This is useful when frames don't have unique identifiers
	 e.g. driver.switchTo().frame(0);

	 2.Switch by Name or ID: You can switch to a frame using its name or id attribute, if they are available.

	 e.g. driver.switchTo().frame("frameName");

	 3.Switch by WebElement: You can also switch to a frame using a WebElement representing the frame.

	 e.g  WebElement frameElement = driver.findElement(By.id("frameID"));
             driver.switchTo().frame(frameElement);

      # Switching Back to the Default Content: After interacting with the frame, you may need to switch
          back to the default content of the page using the following method

          driver.switchTo().defaultContent();



	*/
	static void frme(WebDriver w) throws Exception {

		w.navigate().to("https://jqueryui.com/");

		w.findElement(By.xpath("//div[@id='sidebar']/aside[1]/ul[1]/li[2]")).click();

		Thread.sleep(2000);

		//

		w.switchTo().frame(w.findElement(By.xpath("//iframe[@class='demo-frame']")));



		Thread.sleep(2000);

	     Actions act = new Actions(w);

	     WebElement trigger = w.findElement(By.id("draggable"));

	     WebElement target = w.findElement(By.id("droppable"));

	     // this action only excute when we add build and perform methos

	    // act.dragAndDrop(trigger, target);

	     act.dragAndDrop(trigger, target).build().perform();
	     System.out.println("done");

	    /* w.findElement(By.xpath("//div[@id='sidebar']/aside[1]/ul[1]/li[1]")).click();

	         we need to switch back to default page .

	          */

	     w.switchTo().defaultContent();

	     w.findElement(By.xpath("//div[@id='sidebar']/aside[1]/ul[1]/li[1]")).click();




	}

	static void drag(WebDriver R) throws Exception {

      R.navigate().to("https://jqueryui.com/");

		R.findElement(By.xpath("//div[@id='sidebar']/aside[1]/ul[1]/li[1]")).click();

		Thread.sleep(2000);

		 JavascriptExecutor jse = (JavascriptExecutor)R;


	}

}

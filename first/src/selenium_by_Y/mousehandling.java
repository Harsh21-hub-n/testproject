package selenium_by_Y;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehandling {

	public static void main(String[]arg) throws Exception {


		WebDriver drivery = new ChromeDriver();

		drivery.get("https://www.google.com");

		drivery.manage().window().maximize();

		drivery.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*

		drivery.navigate().to("https://flipkart.com");

		Thread.sleep(2000);


		//drivery.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[2]/div/div/div/div/div[1]/a[5]")).click();

		drivery.findElement(By.xpath("//div[@class='_3sdu8W emupdz']/a[3]")).click();


		Thread.sleep(1000);

		//  //div[@class='bpjkJb']/span[1]

		// create electronic web element ref

	//	WebElement electron = drivery.findElement(By.xpath("//div[@class='bpjkJb']/span[1]"));

		WebElement electron = drivery.findElement(By.xpath("//*[text()='Electronics']"));

		//mouse simulation using action class

		Actions act =new Actions(drivery);

		// mouse hover to electronics

		Thread.sleep(2000);

		act.moveToElement(electron).build().perform();



		// keyboard operations

		Thread.sleep(1000);

		drivery.navigate().refresh();

		drivery.navigate().back();

		Thread.sleep(1000);

		//drivery.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[1]/div/div/span/span[2]")).click();

		Thread.sleep(1000);

		WebElement fash =drivery.findElement(By.xpath("//*[text()='Fashion']"));

		act.sendKeys(fash, Keys.ENTER).build().perform();

		System.out.println("done");


		// right click on web page

		Thread.sleep(500);

		act.contextClick().build().perform();

		*/

		drivery.navigate().to("https://jqueryui.com/");

		drivery.findElement(By.xpath("//*[@id='sidebar'	]/aside[1]/ul/li[2]")).click();


		// switch frame

		drivery.switchTo().frame(0);

		System.out.println("switch to the frame");


		// draggable  element

		WebElement drag = drivery.findElement(By.id("draggable"));


		// dropable

		WebElement drop = drivery.findElement(By.id("droppable"));


		// drag and drop by actions class

		Thread.sleep(2000);

		Actions act1 = new Actions(drivery);

		act1.dragAndDrop(drag, drop).build().perform();

		act1.dragAndDropBy(drag	, -100, -100).build().perform();



	}
}

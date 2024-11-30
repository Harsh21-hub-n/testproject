package selenium_by_Y;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {


	public static void main(String []arg) {


		WebDriver Driv = new ChromeDriver();

		Driv.get("https://rahulshettyacademy.com/locatorspractice/");

		Driv.manage().window().maximize();

		// Locator by Id

		Driv.findElement(By.id("inputUsername")).sendKeys("harshad");

		// locator by name

		Driv.findElement(By.name("inputPassword")).sendKeys("H@rsh321");

		//locator by class name

		Driv.findElement(By.className("submit")).click();


		// locator by css selector
		/*
		    Css Selector :

		    class name > tagname.classname

		    Id > tagname#Id

		    Tagname[attribute='value']



		 */

		Driv.findElement(By.cssSelector("button.ghost")).click();











	}


}

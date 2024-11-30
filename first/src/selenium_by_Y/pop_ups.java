package selenium_by_Y;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pop_ups {

	public static void main(String[]arg) throws Exception {

		WebDriver drivers= new ChromeDriver();

		drivers.manage().window().maximize();

		drivers.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		drivers.get("https://demoqa.com/browser-windows");

		Thread.sleep(1000);

		// Tab handling

		drivers.findElement(By.xpath("//button[@id='tabButton']")).click();

		// get the total no of open tabs/windows

		Set<String> allwindowsID =drivers.getWindowHandles();

		System.out.println(allwindowsID);

		Iterator<String>abd = allwindowsID.iterator();

		String win1= abd.next();
		String win2 = abd.next();

		// parent the title of parent window

		drivers.switchTo().window(win1); //parent id

		System.out.println("parent id ="+ win1); //id

		System.out.println(drivers.getTitle()); // title of parent

		//print current url of child

		Thread.sleep(2000);

		drivers.switchTo().window(win2);




		System.out.println(drivers.getCurrentUrl()); //current url

		System.out.println(drivers.getTitle()); // child title

		//drivers.close();

		// step 2 - windows/popup handling

		Thread.sleep(2000);
		drivers.switchTo().window(win1);

		Thread.sleep(1000);

		drivers.findElement(By.id("windowButton")).click();








	}


}

package selenium_by_Y;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope_N_Kry {

	public static void main(String[]arg) throws Exception {

		WebDriver driv= new ChromeDriver();

		driv.get("https://www.google.com");

		driv.manage().window().maximize();

		Thread.sleep(2000);


		scor(driv);


  }

	  static void scor(WebDriver g) throws Exception {

		  g.get("https://rahulshettyacademy.com/AutomationPractice/");

		  // 1. to find all links on page

		 System.out.println(g.findElements(By.tagName("a")).size());

		 // 2.to find links at bottom of page only

	WebElement allblink	= g.findElement(By.id("gf-BIG"));

	        System.out.println(allblink.findElements(By.tagName("a")).size());

	     // 3.open each link in new tab



	        WebElement   columnlinks =       allblink.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));

	        for(int i=1 ; i<columnlinks.findElements(By.tagName("a")).size(); i++) {

	        	// to open new tab we use keys class in selenium

	     String clcikonlink =   Keys.chord(Keys.CONTROL, Keys.ENTER);

	        	CharSequence clickonlink = clcikonlink;
				columnlinks.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);

	        //	System.out.println("done loop");

	        	Thread.sleep(3000);

	        }

	        // open all the tabs and get title


	          Set<String> tabs =  g.getWindowHandles();

	          Iterator <String> it =tabs.iterator();

	          // hasnext() help to find next tab and next () help to switch on that tab


	          while(it.hasNext()) {


	        	  g.switchTo().window(it.next());

	        	  System.out.println(g.getTitle());



	          }




	  }

}

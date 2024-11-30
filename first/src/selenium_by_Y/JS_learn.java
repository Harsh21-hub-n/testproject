package selenium_by_Y;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_learn {


	/*

	  java script

	  it is scripting language

	  javascriptExecutor is an interface and it contain excuteScript() method.

	  In Selenium, JavaScript is often used to perform actions or retrieve information that might not be easily achievable
	  using the standard WebDriver methods.


       javaScript is particularly useful for scrolling actions, both within elements and the entire page.

       When to Use JavaScript in Selenium :-

       1.  When WebDriver�s built-in methods are not sufficient.
         2. To perform actions that involve complex interactions or dynamic content.
            3.  When you need to manipulate the DOM directly or perform tasks that WebDriver does not support natively.

	 */


	     public static void main(String[]arg) throws Exception {


	    	 WebDriver drivert = new ChromeDriver();

	    	 drivert.get("https://www.google.com");

	    	 drivert.manage().window().maximize();

	    	 drivert.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    	 drivert.navigate().to("https://wwww.facebook.com");

	    	 //javascriptExecutor

	    	 JavascriptExecutor jse = (JavascriptExecutor)drivert;  // down casting

	    	 //locate web element using javascript

	    	 jse.executeScript("document.getElementById('email').value = 'abc@gmail.com'");

	    	 jse.executeScript("document.getElementById('pass').value='H@rsh321'");
	    	 
	    	 
	    	 //scroll down through JS

	    	 // we use scrollBy method

	    	 Thread.sleep(2000);
	    	  jse.executeScript("window.scrollBy(0,500)");

	    	  // scroll up

	    	  Thread.sleep(2000);
	    	  jse.executeScript("window.scrollBy(0,-250 )");

	    	  // scroll left

	    	  jse.executeScript("window.scrollBy(-1000,0)");


	    	 //Scroll right

	    	  Thread.sleep(200);

	    	//  jse.executeScript("window.sccrollBy(1000,0)");

	    	  // for table scroller we use document.querySelector("").scrollTop=5000;

	    	  drivert.get("https://rahulshettyacademy.com/AutomationPractice/");

	    	  jse.executeScript("window.scrollBy(0,500)");


	    	 jse.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

	     }









}

 package selenium_by_Y;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitt {

	/*
	 *  when person wants to achieve his goal , he will do whatever he can to achieve it... he will work hard
	 *
	 *
	 *
	 */
	private static final String ExpectedCondtions = null;




	/*
	      What is Selenium Waits?

	       Waits in Selenium is one of the important pieces of code that executes a test case.

	       Elaborately, Selenium Waits helps the user to troubleshoot various issues while page redirection across different web pages.
	        It is achieved by refreshing the entire web page and reloading it with new elements.

	        there are 3 types

	         1.implicit wait- it will be used only once through out the project.

	         2.explicit wait - it will be used in conditional wait.

	         3.Fluent  wait - it is used for pulling .










	 */

	    public static void main(String []arg) throws Exception {


	    	WebDriver driver2= new ChromeDriver();

	    	driver2.get("https://www.google.com");

	    	driver2.manage().window().maximize();

	    	driver2.navigate().to("https://www.facebook.com");


	    	driver2.navigate().back();


	    	// implicit wait

	    	/*
	    	 *
	    	 * It is implemented by WebDriverWait class.
	    	 */

	    	driver2.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); // implicit wait- it will be used only once through out the project

	    	driver2.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("how stuff work");

	    	// handling auto suggestion


	    	List<WebElement> Allsuggestion = driver2.findElements(By.xpath("//ul[@role='listbox']/li"));


	    	for (WebElement element : Allsuggestion) {

	    		String expresult= "how stuff works quiz";

	    		if (element.getText().equalsIgnoreCase(expresult)){

	    			element.click();

	    			break;


	    		}
	    	}

	    	driver2.close();

	    	waitt t =new waitt();

	    //	t.explicit();

	    	t.dynamic_web();



	    }


	/*  Explicit wait
	 *
	 * Explicit Waits also known as Dynamic Waits because it is highly specific conditioned.
	 *
	 *  It is implemented by WebDriverWait class.
	 *
	 */

	       void explicit() {

	         	WebDriver d= new ChromeDriver();

	                    	d.get("https://www.google.com");

	         	d.manage().window().maximize();

	         	d.navigate().to("https://wwww.facebook.com");

	         	//enter user name

	         	d.findElement(By.xpath("//input[@id='email']")).sendKeys("harshad@gmail.com");

	         //	d.findElement(By.id("email")).sendKeys("abc@gmail.com");

	         	//fetch input box attribute value

		    System.out.println (d.findElement(By.id("email")).getAttribute("value"));

		         //get hight of box

		    System.out.println (d.findElement(By.id("email")).getSize().height);

		    // get width of box

		    System.out.println (d.findElement(By.id("email")).getSize().width);


		// explicit wait :  by default polling time of explicit wait - 500 milliseconds

	 // Explicit Waits also known as Dynamic Waits because it is highly specific conditioned.


		    WebDriverWait wt = new WebDriverWait(d,30);

		   wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("passse"))).sendKeys("abcd");

	}



	// Dynamic webtable handling

	       void dynamic_web() throws Exception {


	    	   WebDriver driver3= new ChromeDriver();

	    	   driver3.get("https://www.google.com");

	    	   driver3.manage().window().maximize();

	    	   driver3.navigate().to("https://money.rediff.com");

	    	   List<WebElement> allcompanies = driver3.findElements(By.xpath("//ul[@class='ul_top_tabs']/li[6]/a"));
	    	   int a=6;




	    	  allcompanies.get(5).click();

	    	  Thread.sleep(2000);

	    	  List<WebElement> allcompanies1 = driver3.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));

	    	  System.out.println("allcompanies ="+allcompanies.size() );

	    	  // find expected company

	    	  String expcompnay ="Betex India Ltd";



	    	  // session 26


	    	  for (WebElement element : allcompanies) {

	    		//  int expcompany= "Suraj";
				if(element.getText().equalsIgnoreCase(expcompnay)) {

					System.out.println(element.getText());

					element.click();
					break;



				}


	    	  }

	    	 //  driver3.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[6]/a")).click();

	       }











}

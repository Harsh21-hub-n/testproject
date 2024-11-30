package selenium_by_Y;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_dtest_2 {

	public static void main(String[]arg) throws Exception {

		WebDriver d = new ChromeDriver();

		static_drop1(d);

		Drop_1(d);

		drop_2(d);

		autosuggest_drop(d);



	}

	static void static_drop1(WebDriver d) throws Exception {

		d.get("https://rahulshettyacademy.com/dropdownsPractise/");

		d.manage().window().maximize();

		Thread.sleep(2000);

		WebElement staticdrop = d.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(staticdrop);

		// select option through index.

		dropdown.selectByIndex(2);

		Thread.sleep(2000);

		//dropdown.deselectByIndex(2);

	   System.out.println(dropdown.getFirstSelectedOption().getText());

	   // select option through visible options

	   dropdown.selectByVisibleText("USD");

	   System.out.println(dropdown.getFirstSelectedOption().getText());


	   // select option through value

	   dropdown.selectByValue("INR");

		}

	    static void Drop_1(WebDriver d) throws Exception {


	    	d.findElement(By.id("divpaxinfo")).click();

	    	Thread.sleep(2000);

	    //	d.findElement(By.id("hrefIncAdt")).click();

	    	// if we perform click option for number of times we use loop to click

	    	int i=1;

	    	while(i<5)

	    	{

	    		d.findElement(By.id("hrefIncAdt")).click();


	    		i++;

	    	}

	    	d.findElement(By.id("btnclosepaxoption")).click();





	    }

	    // if there is one drop down dependent on other drop down

	     static void drop_2(WebDriver d) throws Exception {


	    	 d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();

	    	 d.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[6]")).click();

	    	 Thread.sleep(2000);

	     d.findElement(By.xpath("//*[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]//*[@id=\"dropdownGroup1\"]/div/ul[4]/li[2]/a")).click();

	     Thread.sleep(2000);

	     d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[5]/a")).click();


	     }

	     // auto suggest drop down

	     static void autosuggest_drop(WebDriver d) throws Exception {

	    	 d.findElement(By.id("autosuggest")).sendKeys("ind");

	    	 Thread.sleep(2000);

	    	List<WebElement>dd = d.findElements(By.cssSelector("li[class='ui-menu-item'] a")); // a[id='ui-id-118']


	    	  for(WebElement option :dd)
	    	{
	    		if(option.getText().equalsIgnoreCase("india"))
	    		{

	    			option.click();

	    			break;
	    		}


	    	}



	     }



}

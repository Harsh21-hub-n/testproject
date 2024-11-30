package Sunday_P;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_D {

	public static void main(String[] arg) throws Exception {
		
	//	 WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//select[@id=\"ctl00_mainContent_DropDownListCurrency\"]")).click();
		
	WebElement options = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select selecttop = new Select(options);
		
		// by index
		
		selecttop.selectByIndex(2);
		
		// by value
		
		selecttop.selectByValue("USD");
		
		// select visible text
		
		Thread.sleep(2000);
		
		selecttop.selectByVisibleText("INR");
		
		Thread.sleep(1000);
		
	// another drop down type 
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		
		
		
		
		
		
		
		
		
		
		

	}
}

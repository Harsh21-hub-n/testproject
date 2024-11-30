package Sunday_P;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;


public class Calender {
	
	public static void main(String[]arg) throws Exception {
	
	WebDriver driver = new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("ctl00_mainContent_view_date1")).click();

	
	}
}

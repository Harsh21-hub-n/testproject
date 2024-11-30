package selenium_by_Y;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allret {

	public static void main(String[]arg) throws Exception {

		WebDriver XX= new ChromeDriver();

		XX.get("https://rahulshettyacademy.com/AutomationPractice/");

	    XX.manage().window().maximize();

	    Thread.sleep(2000);

		N1(XX);
	}
	// handle alert pop-up message

	static void N1(WebDriver z) throws Exception

	{
		String name="Rahul";

		String text1= "Hello rahul, share this practice page and share your knowledge";

		z.findElement(By.id("name")).sendKeys(name);

		z.findElement(By.id("alertbtn")).click();


// to focus on pop-up we switch from main page to pop-up by using switchTO()
	String text =	z.switchTo().alert().getText();

	Thread.sleep(2000);

		z.switchTo().alert().accept();

		if (text1.equals(text)) {

			System.out.println("Both strings are equal");
		}

	}

}

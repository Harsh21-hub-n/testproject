package selenium_by_Y;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_1 {

	// in case of frame , inside the DOM we can see iframe tag.


	public static void main(String[]arg) throws Exception {

		WebDriver driverq = new ChromeDriver();

		driverq.get("https://www.google.com");

		driverq.manage().window().maximize();

		driverq.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driverq.navigate().to("https:/www.paytm.com");

		//driverq.findElement(By.xpath("//div[@class='_1YPz_']/span")).click();

		driverq.findElement(By.xpath("//*[text()= 'Sign In']")).click();

		// 1st we find total number of iframe

		int allframe = driverq.findElements(By.tagName("iframe")).size();

		System.out.println("total frame ="+ allframe);

		// go inside of each frame and check if the element is present

		for(int i=0; i<allframe; i++) {

			driverq.switchTo().frame(i);

			Thread.sleep(2000);

			driverq.findElement(By.xpath("//*[contains text()='close']")).click();



		}

		// Alert message handling

		// alert interface using accept() and dismiss() method

		driverq.navigate().to("https://demoqa.com/alerts");

		Thread.sleep(2000);

		// alert handling

		driverq.findElement(By.id("confirmButton")).click();

		// verify alert text

		String alerttext = driverq.switchTo().alert().getText();

		String expectext = "Do you confirm action?";

		//Assert.assertEquals(alerttext , expectext); need testNG

		System.out.println("verfied");

		//accept alert

		driverq.switchTo().alert().accept();

		System.out.println("accepted");


		 //dismiss alert

		driverq.switchTo().alert().dismiss();





	}







}

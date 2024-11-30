package selenium_by_Y;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

public class Handling_HTTP {
	/*
	    Handling HTTPS certificates in automated browsers is crucial for testing secure websites,
	    as HTTPS (HyperText Transfer Protocol Secure) ensures that communication between the client (browser) and
	    the server is encrypted. In automation, handling these certificates allows testing in environments
	    where the certificate may not be trusted by default, such as development or staging environments.


	   This approach lets automated tests run smoothly on secure sites,
	    ensuring that HTTPS certificate issues don't interrupt test execution.
	 */


	public static void main(String[]arg) throws Exception {

		ChromeOptions options = new ChromeOptions();

		// add external plug-in

		Proxy proxy = new Proxy();

		proxy.setHttpProxy("ipaddress:4444");

		options.setCapability("proxy", proxy); // pass here proxy value we need to create proxy instance




		options.setAcceptInsecureCerts(true); // to bypass the certificate warning.

		// chromedriver.chromium.org/capabilities

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://expired.badssl.com");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();


		//takescreenshot(driver);

		//brok_url(driver);

		 brok_url1(driver);
	}

	static void takescreenshot(WebDriver Driver) throws Exception {


		Driver.get("https://www.google.com");

		File src=     ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE); //((TakesScreenshot)Driver) is a way to cast the driver instance to the TakesScreenshot interface in Selenium WebDriver. This casting enables the driver object to use the getScreenshotAs() method

		// D:\Test_j\Harsh_TJ\screenshot/ "screenshot.png" need to add this after file path

		FileUtils.copyFile(src,new File("D://Test_j/Harsh_TJ/screenshot/screenshot.png"));

	}

	  static void brok_url(WebDriver FG) throws Exception, IOException {

		  /*
		        broken url:

		        1.is to get all urls tied up to the links using selenium

		        java method will call urls and get status code

		        if status code >400 then that url isn't working > link which is tied to url  is broken



		   */





		   FG.get("https://rahulshettyacademy.com/AutomationPractice/");

		  String url = FG.findElement(By.cssSelector("a[href*=\"soapui\"]")).getAttribute("href");

		   System.out.println(url);

		   // open connection methd to get status code of url


		//   HttpURLConnection conn=     (HttpURLConnection) new URL().openConnection();

		   HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();

		   conn.setRequestMethod("HEAD"); // we set our request method

		   conn.connect();

		int num =   conn.getResponseCode() ; // what kind of response we want

		System.out.println(num );
	  }


	  static void brok_url1(WebDriver SA) throws Exception{

		  // two ways to find broken link


		  SA.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> links = SA.findElements(By.xpath("//li[@class=\"gf-li\"]/a"));

		SoftAssert a = new SoftAssert();



		for (WebElement link : links) {

		       String url =	link.getAttribute("href");



			HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();

			   conn.setRequestMethod("HEAD"); // we set our request method

			   conn.connect();

			int num =   conn.getResponseCode() ; // what kind of response we want


			// 1st way

			a.assertTrue(num<400, "\"the link text \"+links.get(i).getText() + \" the status code \"+ num");
			// it can store all fail cases and after complete loop then it's showing


			/*
			// 2nd way
			if (num>400) {

				System.out.println("the link text "+links.get(i).getText() + " the status code "+ num);

				//Assert.assertTrue(false);
			}
			*/
			//System.out.println(num );


		}

		a.assertAll();  // if there is no any fail case then it's all get pass our case and vice versa

	  }
}

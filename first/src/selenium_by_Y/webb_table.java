package selenium_by_Y;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class webb_table {

	public static void main(String[]arg) {


		WebDriver driver1= new ChromeDriver();

		driver1.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver1.manage().window().maximize();

		//table(driver1);

	//	custom_M(driver1);

		pagination(driver1);
	}

	static void table(WebDriver driverr)

	{

		/*
		  Steps to Perform Web Table Sorting with Java Streams
		  1.Locate the Table Column Elements: Use Selenium to locate all elements in the specific column you want
		  to sort.

		  2.Extract Text: Retrieve the text from each cell and store it in a
		  list.

		  3.Sort Using Streams: Use Java Streams to sort the list.

		  4.Verify Sorting: Compare the sorted list to the original list to determine if the column is
		  correctly sorted.

		 */

		// we need to invoke that particular site

		  driverr.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		  driverr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		  driverr.findElement(By.xpath("//a[@class=\"cart-header-navlink\"][1]")).click();

		  // set and iterator to switch to next tab

		  Set<String> windows = driverr.getWindowHandles();

		  Iterator<String> tabs = windows.iterator();


		String s1=  tabs.next();

		String s2 = tabs.next();


		  System.out.println(tabs);

		  driverr.switchTo().window(s2);


			// click on that cloumn

			 driverr.findElement(By.xpath("//span[@class=\"sort-icon sort-descending\"]")).click();

			driverr.findElement(By.xpath("//tr/th[1]")).click();

			// capture all webelement in list

			List<WebElement> webelements = driverr.findElements(By.xpath("//tr/td[1]"));

			// capture text from all webelement into new list

			// here we need to capture text one by one so we have two option one is for loop
			// and 2nd streams

			List<String> original_list = webelements.stream().map(s -> s.getText()).collect(Collectors.toList());

			// sort on original list --> sorted list

			List<String> sorted_list = original_list.stream().sorted().collect(Collectors.toList());

			// compare original(new) list to sorted list

			Assert.assertTrue(original_list .equals(sorted_list));



	}

	static void custom_M(WebDriver driver) {

		// Build Custom Selenium methods using Streams Mapper

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@class=\"cart-header-navlink\"][1]")).click();

		// switch window

		Set<String> windows = driver.getWindowHandles();

		 Iterator<String>Tabs= windows.iterator();

		 String one = Tabs.next();

		 String Two = Tabs.next();

		 driver.switchTo().window(Two);

		 System.out.println("start");
		 driver.findElement(By.xpath("//li[6]/a[@role=\"button\"]")).click();

		 System.out.println("end");

			List<WebElement> allelements = driver.findElements(By.xpath("//tr/td[1]"));

			List<String> orignal_list = allelements.stream().map(s -> s.getText()).collect(Collectors.toList());

			// Scan the name column with get text -> Beans and prinnt the price of rice and also create custom method

			List<String> veggi = allelements.stream().filter(s -> s.getText().contains("Apple")).map(s ->getveggis(s))
					.collect(Collectors.toList());

			veggi.forEach(a->System.out.println(a));



	}

	private static String getveggis(WebElement s) {

	String pricevalue=	s.findElement(By.xpath("//tr/td[1]/following-sibling::td[1]")).getText();

		return pricevalue;
	}

	static void pagination(WebDriver drivver) {



		 drivver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		  drivver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		  drivver.findElement(By.xpath("//a[@class=\"cart-header-navlink\"][1]")).click();

		  // set and iterator to switch to next tab

		  Set<String> windows = drivver.getWindowHandles();

		  Iterator<String> tabs = windows.iterator();


		String s1=  tabs.next();

		String s2 = tabs.next();


		  System.out.println(tabs);

		  drivver.switchTo().window(s2);


			// click on that cloumn

			 drivver.findElement(By.xpath("//span[@class=\"sort-icon sort-descending\"]")).click();

			drivver.findElement(By.xpath("//tr/th[1]")).click();

			// capture all webelement in list

			List<WebElement> webelements = drivver.findElements(By.xpath("//tr/td[1]"));

			// capture text from all webelement into new list

			// here we need to capture text one by one so we have two option one is for loop
			// and 2nd streams

			List<String> original_list = webelements.stream().map(s -> s.getText()).collect(Collectors.toList());

			// sort on original list --> sorted list

			List<String> sorted_list = original_list.stream().sorted().collect(Collectors.toList());

			// compare original(new) list to sorted list

			//Assert.assertTrue(original_list .equals(sorted_list));




			List<String> veggi;

			do



			{	veggi = webelements.stream().filter(s -> s.getText().contains("Orange")).map(s ->getveggis(s))

					.collect(Collectors.toList());

			veggi.forEach(a->System.out.println(a));

			if(veggi.size()<1) {


				drivver.findElement(By.xpath("//ul/li[5]")).click();
			}

			}
		while(veggi.size()<1);

	}

}

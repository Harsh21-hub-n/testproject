package Framework_2;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;


public class StandAlone {
	
	
public static void main(String[]arg) throws Exception {
		
		
		WebDriver dd = new ChromeDriver();
		
		dd.get("https://google.com");
		
		dd.manage().window().maximize();
		
		m(dd);
		
	}
	
	public static void m(WebDriver driver) throws Exception {
		
		String gmail = "harshadmashal@gmail.com";
		
		String passw = "H@rsh321";
	
	   driver.get("https://rahulshettyacademy.com/client");
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	   driver.findElement(By.id("userEmail")).sendKeys(gmail);
	   
	   landing_page p = new landing_page(driver);
	   
	   driver.findElement(By.id("userPassword")).sendKeys(passw);
	   
	   driver.findElement(By.id("login")).click();
	   
	   // find all list of products and click on particular one product
	   
	  List<WebElement> products= driver.findElements(By.xpath("//div[@class=\"col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1 mb-3 ng-star-inserted\"]"));
		
	 //div[@class="card-body"]
	   
	 //  List<WebElement> products= driver.findElements(By.xpath("div[@class=\"card-body\"]"));
		
	   
	  String pro_name1= "ADIDAS ORIGINAL";
	/*  
	Stream <String> p=  Stream.of("ADIDAS ORIGINAL", "IPHONE 13 PRO");
	  
	  WebElement test=  products.stream().filter(pro-> 
	  pro.findElement(By.cssSelector("b")).getText().equals(p)).findFirst().orElse(null);
	  test.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	  
	  */
	  // we can add multiple products at time
	  List<String> productNames = Arrays.asList("ADIDAS ORIGINAL", "IPHONE 13 PRO");

	  for (String pro_name : productNames) {
		  
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // selenium 4
		//  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5), Duration.ofMillis(500));
		  
		  WebDriverWait wait = new WebDriverWait(driver, 5); // selenium 3

  
	      WebElement filterd_name = products.stream().filter(pro -> pro.findElement(By.cssSelector("b")).getText().equals(pro_name))
	          .findFirst()
	          .orElse(null);
	      
	      if ( filterd_name!= null) {
	    	  filterd_name.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	          
	          wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#ng-animating")));
	    	   
	    	  Thread.sleep(5000);
	    	   
	      } else {
	          System.out.println("Product " + pro_name + " not found.");
	      }
	  }

	  
	  // to check toast msg by explicit wait
	  
	 // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	  
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  
	  

	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
	  
	 
	  
	  //ng-animating
	  
	  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#ng-animating")));
	  
	 

	  
          //   Thread.sleep(3000);	  
	  driver.findElement(By.xpath("//button[@routerlink=\"/dashboard/cart\"]")).click();
	  
	  // after enter in cart to check right items are visible or not
	  
	 List<WebElement> cart_prod= driver.findElements(By.xpath("//div/ul/li/div/div/h3"));
	 
	 Boolean match=   cart_prod.stream().anyMatch(cartp-> cartp.getText().equalsIgnoreCase(pro_name1));
	    
	   // Assert.assertsTrue(match);
	 
	 Assert.assertTrue(match);
	 
	 
	
	 }

}

package Framework_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_2.Abastractcomponent.AbstractComponent;

public class ProductCathlog extends AbstractComponent{
	
	WebDriver driver;
	
	public ProductCathlog(WebDriver driver) {
		
		super(driver);
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}
	
// List<WebElement> products= driver.findElements(By.xpath("//div[@class=\"col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1 mb-3 ng-star-inserted\"]"));	
	
   // here if it's findElements then
	
	//@FindBy(xpath="//div[@class=\\\"col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1 mb-3 ng-star-inserted\\")
	//List<WebElement> products;
	
	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	   By addtocart = By.cssSelector(".card-body button:last-of-type");
	
	public List<WebElement> getProductList() throws Exception {
		
		Thread.sleep(2000);
		
		return products;
	}
	/*
	 
	    WebElement test=  products.stream().filter(pro-> 
	  pro.findElement(By.cssSelector("b")).getText().equals(p)).findFirst().orElse(null);
	  test.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	 
	 */
	
	public WebElement productGetByName(String pn) throws Exception {
		
		WebElement prodname=  getProductList().stream().filter(pro-> 
		  pro.findElement(By.cssSelector("b")).getText().equals(pn)).findFirst().orElse(null);
		
          return prodname;
		
	}
	
	public void addToCartProduct(String prodname) throws Exception {
		
	WebElement prod =	productGetByName(prodname);
		
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	}
	
}

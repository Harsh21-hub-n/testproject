package Framework_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_2.Abastractcomponent.AbstractComponent;

public class landing_page extends AbstractComponent{
	
	WebDriver driver;
	
	public landing_page(WebDriver d) {
		
		super(d);
		
		this.driver =d;
		
		PageFactory.initElements(driver, this);
	}
	
 // WebElement email=	driver.findElement(By.id("userEmail")); instead of this we use page factory
  
  // the concept of page-factory -
  /*
       It provides a convenient way to initialize web elements and improves readability and maintainability
       
       @FindBy Annotation: Page Factory uses @FindBy annotations to locate elements.
       
       initElements Method: Page Factory provides the initElements method to initialize all 
       the elements annotated with @FindBy
       
       PageFactory.initElements(driver, this) initializes the elements, making them ready to use in the class.
       and we add this line of code in constructor.
    */
  
       @FindBy(id="userEmail")
       WebElement email;//
       
       @FindBy(id="userPassword")
       WebElement pass;
       
       @FindBy(id="login")
       WebElement loggedin;
       
       public void loginapp(String gmail, String pword) {
    	   
    	   
    	   email.sendKeys(gmail);
    	   
    	   pass.sendKeys(pword);
    	   
    	   loggedin.click();
    	   
    	   
       }
  // invoke login page
       
       public void loginpage() {
    	   
    	   driver.get("https://rahulshettyacademy.com/client");
       }
  

}

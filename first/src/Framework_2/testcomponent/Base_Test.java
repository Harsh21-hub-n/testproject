package Framework_2.testcomponent;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Test {
	
	public WebDriver driver;
	
	public Base_Test() {
		
	}

	public void initializeDriver() throws IOException {
		
		
		
		// properties class
		
		Properties pro = new Properties();
		
		FileInputStream file = new FileInputStream("D:/Test_j/Harsh_TJ/first/src/Framework_2/resource/GlobalData.properties");
		pro.load(file);
		
	String browsername=	pro.getProperty("browser");
	
	if(browsername.equalsIgnoreCase("chrome")) {
		
		
		
	//	WebDriver.Chromedriver().setup();
		
         driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//m(dd);
	    } 
	
	else if(browsername.equalsIgnoreCase("firefox")) {
		
		// firefox
		
		
	}
	else if(browsername.equalsIgnoreCase("edge")) {
		
		//edge
		
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	}
	 
}

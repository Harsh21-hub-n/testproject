package selenium_by_Y;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class open_chroma {

	public static void main(String []arg) throws Exception {

		//WebDriver drive = new ChromeDriver();

		open_chroma a= new open_chroma();

		//a.Call(drive);
		
		

	}
	
	
	{
		
		System.out.println("test instance block");
	}

	open_chroma(){
		
		System.out.println("print constructor");
	}
	
	
	
	void Call(WebDriver drive) throws Exception{





		drive.get("https://facebook.com");

		//drive.navigate().to("https://www.google.com");

		drive.manage().window().maximize();

		Thread.sleep(2000);







	}

}

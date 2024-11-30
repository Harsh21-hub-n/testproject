package selenium_by_Y;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class r_N_c {

	// radio and check box

	// we handle radio and check box by using click method

	// in radio button case find always value tag or type

	public static void main(String[]arg) throws Exception {


		WebDriver driver1= new ChromeDriver();

		driver1.get("https://facebook.com");

		driver1.manage().window().maximize();

		Thread.sleep(2000);

		driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();

		Thread.sleep(2000);

		// 1st way to select radio

		//driver1.findElement(By.xpath("//input[@value='2']")).click();

		Thread.sleep(500);

	//	driver1.findElement(By.xpath("//input[@value='1']")).click();

		// 2nd way to select radio

	   List<WebElement> radios = driver1.findElements(By.xpath("//input[@type ='radio']"));

	   System.out.println("total number of radio button " +radios.size());

	   System.out.println(radios.get(0).isSelected()); // false

	   System.out.println(radios.get(1).isSelected()); //false

	   System.out.println(radios.get(0).isEnabled()); //true

	   System.out.println(radios.get(1).isEnabled()); // true

	   System.out.println(radios.get(0).isDisplayed()); //true

	   System.out.println(radios.get(1).isDisplayed()); //true

	   radios.get(2).click();

	   System.out.println(radios.get(0).isSelected()); // false

	   Thread.sleep(2000);

	  // 3rd way

	   List<WebElement> radio =driver1.findElements(By.xpath("//label[@class ='_58mt']"));

	   System.out.println(radio.size());

	   String exresult = "female";

	   for (WebElement element : radio) {

		   if(element.getText().equalsIgnoreCase(exresult)){

			   element.click();

			   System.out.println("clicked");

			   break;

		   }


	   }














	}

}

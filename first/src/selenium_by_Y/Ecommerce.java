package selenium_by_Y;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {


	public static void main(String[] arg) throws Exception {

		WebDriver t1 = new ChromeDriver();

		t1.get("https://rahulshettyacademy.com/seleniumPractise/");

		t1.manage().window().maximize();

		Thread.sleep(2000);

		// add_cart(t1);

		add_Num_Products(t1);

	}

	// to add particular one item

	static void add_cart(WebDriver t2) {

		// we get common id's so we have to make list and find one out

		List<WebElement> products = t2.findElements(By.cssSelector("h4.product-name"));



		// find right product and add to cart

		for(int i=0 ; i<products.size(); i++) {

			String name = products.get(i).getText();



			// now we have to perform click opration

			if(name.contains("Cucumber"))
			{
				System.out.println(name);

				t2.findElements(By.xpath("//button[text()=\"ADD TO CART\"]")).get(i).click();

				break;


				}


		}

	}

	static void add_Num_Products(WebDriver t3) throws Exception
	{


		String [] items = {"Beetroot", "Cauliflower", "Carrot"};

		List<WebElement> products = t3.findElements(By.cssSelector("h4.product-name"));


		for(int i=0; i<products.size(); i++) {


			// if there is another name in attributes value then we have to user split method



		String [] productsN = products.get(i).getText().split("-");

	       //  System.out.println(productsN);

	         String updatedN = productsN[0].trim();

	      //   System.out.println(updatedN);

				List itemsP = Arrays.asList(items);

		Thread.sleep(1000);

	     if(itemsP.contains(updatedN))	{


	    	 System.out.println(updatedN);

	    	 t3.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

	     }






		}



	}

}

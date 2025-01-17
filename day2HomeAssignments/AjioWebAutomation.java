package week4.day2HomeAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioWebAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com/"); //To launch the URL
		driver.manage().window().maximize(); //To Maximize the window.
		
		//To Push "bags" into ajio search box.
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		
		//To click the search button.
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		//Screen freeze 3 seconds to load
		Thread.sleep(3000);
		
		//- Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[contains(@for,'Fashion')] ")).click();
		
		//Screen freeze 3 seconds to load
		Thread.sleep(5000);
		
		//Print the count of the items found. 
		String counts = driver.findElement(By.xpath("//div[@class='length']")).getText();
		
		System.out.println(counts);
		
		//- Get the list of brand of the products displayed in the page and print the list
		List<WebElement> brandsOfProduct = driver.findElements(By.xpath("//div[@class='brand']"));
		
		//To get the count of bags
		int brand = brandsOfProduct.size();
	
		//Get the list of names of the bags and print it
		for(int i=0; i<brand; i++)
		{
			
			System.out.println(brandsOfProduct.get(i).getText());
		}
		
		driver.close();

	}

}

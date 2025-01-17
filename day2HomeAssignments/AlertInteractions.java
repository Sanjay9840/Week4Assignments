package week4.day2HomeAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//- Load the URL
		driver.get("https://www.leafground.com/alert.xhtml");
		//- Maximize the browser window
		driver.manage().window().maximize();
		//- Click on the "Prompt Box" button to trigger the alert.
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		//Switch to the alert and type a message in the alert box.
		Alert alert = driver.switchTo().alert();
		
		//To message in alert box
		String sentMessage = "Sanjay";
		alert.sendKeys(sentMessage);
		alert.accept();
		
		//Retrieve the typed text from the alert and verify it.
		String name = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		
		//Created empty string to get the typed text
		String verifyMessage = "";
		
	
		for(int i=22; i<name.length(); i++) {
			
			verifyMessage = verifyMessage + name.charAt(i);
			
		}
		
		//Finally matching the typed text with displayed text
		System.out.println("Sent message and Displayed message result is : "+verifyMessage.equals(sentMessage));
		
		driver.close();
		
	}

}

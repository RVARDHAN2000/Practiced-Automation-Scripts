package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoExtra {
 
	public static void main(String[] args) {
	FirefoxDriver driver= new FirefoxDriver();
	 driver.get("https://www.google.com");
	 WebElement searchField = driver.findElement(By.name("q"));
     searchField.sendKeys("Sharuk khan");
     driver.manage().window().maximize();
     searchField.submit();
     try {
         Thread.sleep(5000); // You can adjust the sleep time as needed
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
     driver.close();
	}
}

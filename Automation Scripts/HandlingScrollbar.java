package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingScrollbar {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j= (JavascriptExecutor) driver;
	
//		USING THE JAVA SCRIPTEXICUTER CLASS TO DOWNCAST BEACUSE AVOIDING THE ACCESS TO THE OTHER METHODS OF REMOTEWEBDRIVER CLASS

		driver.manage().window().maximize();
//      SCROLL THE PAGE FOT 2000 PX VERTICALLY 
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,2000)");
		
//		SCROLL THE PAGE FOT 2000 PX HORIZONATALLY
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,-2000)");
		
//		SCROLL TO THE TOP OF PAGE 
		Thread.sleep(2000);

//tO SCROLL HORIZONTALLY (X-AXIS)
		j.executeScript("window.scrollBy(2000,0)"); 
		
		
		
		
//SCROLLING PAGE BY USING SCROLL TO METHODE 
		
		
		
//USING ACTIONS CLASS SCROLLING THE PAGE 		

	Actions a= new Actions(driver);
	
	WebElement i =driver.findElement(By.className("planet--title"));
	
	a.scrollToElement(i);
	
	
	}

}

package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingScrollBar_2000px {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		Actions a= new Actions(driver);
		
	WebElement i =driver.findElement(By.className("planet--title"));
	
	//SCROLL THE PAGE USING BUILT IN METHOD IN ACTIONS CLASS 
	
	//SCROLLTOELEMENT
	
	a.scrollToElement(i).perform();
	
	
	//SCROLLBYAMMOUNT
	
    a.scrollByAmount(0, 2000).perform();
	
	
	WebElement t= driver.findElement(By.xpath("//a[contains(text(),'Technology of Business')]"));
	
	a.scrollToElement(t).perform();
	}

}

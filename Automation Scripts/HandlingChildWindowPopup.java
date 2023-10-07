package Qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-google-button")).click();
	
	    String wh = driver.getWindowHandle();
	   
	    //To Perform action on child window 
	    System.out.println();
	    Set<String> whs = driver.getWindowHandles();
	   
	    
	    for(String wh1 : whs) {
	    	Thread.sleep(2000);
	    	if(!wh1.equals(wh)) {
	    		Thread.sleep(2000);
	    		System.out.println("operations by ID "+wh1);
	    		driver.switchTo().window(wh1);
	    		
	    		driver.findElement(By.id("identifierId")).sendKeys("Vardhan");
	    		Thread.sleep(2000);
	    		driver.findElement(By.xpath("//span[.='Next']")).click();
	    		Thread.sleep(2000);
	    		driver.close();
	    	    System.out.println("Test is pass");
	    		
	    	 }
	    	
	    	Thread.sleep(2000);
    		
	    }
	    
	   driver.quit();
	}

}

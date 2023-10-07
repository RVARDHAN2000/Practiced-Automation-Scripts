package Qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseRemainingThanSelected {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	    System.out.println("enter the desired Title to close ");
	    String etitle = sc.nextLine();
	    
		WebDriver driver =new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
	
		String pwh = driver.getWindowHandle();
		
		Set<String> whs = driver.getWindowHandles();
		
		
		for (String wh : whs) {
			
			driver.switchTo().window(wh);
			String stitle = driver.getTitle();
			if(!(stitle.contains(etitle))) {
				
			driver.close();
			}
			}
	}

}

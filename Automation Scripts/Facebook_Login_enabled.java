package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login_enabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement Login_button = driver.findElement(By.xpath("//button[.='Log in']"));
		Login_button.isDisplayed();
		 boolean b =Login_button.isEnabled();
	if (b==true) {
		System.out.println("Login_button is Enabled");
	}
	else
		System.out.println("Login_button is Disabled ");
	
	
	
	driver.close();
	}

}

package Qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitilyWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demo.actitime.com/");
	
		WebElement username = driver.findElement(By.id("username"));
		username.isEnabled();
		username.isDisplayed();
		username.sendKeys("admin");

		WebElement password = driver.findElement(By.xpath("//input[@type='password'and@name='pwd']"));
		password.isEnabled();
		password.isDisplayed();
		password.sendKeys("manager");

		WebElement Login = driver.findElement(By.id("loginButton"));
		Login.isEnabled();
		Login.isDisplayed();
		Login.click();
		

	System.out.println(driver.getTitle());
	WebElement logout = driver.findElement(By.id("logoutLink"));
	logout.click();
	driver.close();
	}

}

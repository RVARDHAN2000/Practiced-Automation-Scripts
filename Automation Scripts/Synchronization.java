package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("username"));
		username.isEnabled();
		username.isDisplayed();
		username.sendKeys("admin");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@type='password'and@name='pwd']"));
		password.isEnabled();
		password.isDisplayed();
		password.sendKeys("manager");
		Thread.sleep(2000);
		WebElement Login = driver.findElement(By.id("loginButton"));
		Login.isEnabled();
		Login.isDisplayed();
		Login.click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
	}

}

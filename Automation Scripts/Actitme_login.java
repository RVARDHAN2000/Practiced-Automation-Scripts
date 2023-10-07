package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitme_login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
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
		WebElement text = driver.findElement(By.xpath("//td[.='Enter Time-Track']"));
         boolean b=text.isDisplayed();
         
         if(b==true) {
        	 System.out.println("Test case is pass");}
         else {
        	 System.out.println("Test case is fail");}
         
         driver.close();
}}

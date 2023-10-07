package Qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopperstack_Login {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("rvardhanrathod@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Vardhan@00");
		driver.findElement(By.xpath("//span[.='Login']")).click();
		
		System.out.println(driver.findElement(By.xpath("//a[.='Home']")).isDisplayed()+" and scrippt is pass");
		driver.close();
		
		
		
	}

}

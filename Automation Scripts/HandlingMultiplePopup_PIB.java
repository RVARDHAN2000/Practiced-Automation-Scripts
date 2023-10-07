package Qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HandlingMultiplePopup_PIB {

	public static void main(String[] args) {
		
		ChromeOptions option= new ChromeOptions();
	
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://pib.gov.in/indexd.aspx");
		driver.manage().window().maximize();
		driver.switchTo().alert().accept();
		driver.findElement(By.partialLinkText("Eduction")).click();
		Actions a = new Actions(driver);
		WebElement We = driver.findElement(By.partialLinkText("Ministry of Education"));
		a.scrollToElement(We).perform();
		
		
		
		
	}

}

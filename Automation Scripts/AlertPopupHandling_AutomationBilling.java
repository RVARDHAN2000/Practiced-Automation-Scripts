package Qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandling_AutomationBilling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().dismiss();
		boolean b = driver.findElement(By.xpath("//p[contains(text(),'Cancel')]")).isDisplayed();
		if(b==true) 
			System.out.println("confirmation message is displayed and pass");
		
		else
			System.out.println("confirmation message is not  displayed and fail");
		
		driver.quit();
		
	}

}

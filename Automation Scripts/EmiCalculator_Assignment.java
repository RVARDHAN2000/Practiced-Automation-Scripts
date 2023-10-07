package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EmiCalculator_Assignment {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("(//*[.='Balance'])[4]"));
		a.scrollToElement(target).perform();
	 List<WebElement> allpointer = driver.findElements(By.xpath("//*[@fill='#B8204C'and@class='highcharts-point']"));
		for (WebElement we : allpointer) {
	
			a.moveToElement(we).pause(500).perform();
			
			
		}
		
		
	}

}

package Qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_ListBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		WebElement createNA = driver.findElement(By.xpath("//a[contains(text(),'Create new')]"));
		createNA.click();
		 WebElement day = driver.findElement(By.id("day"));
		Select s =new Select(day);
		s.selectByValue("28");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByValue("4");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("2000");
		//driver.close();
		
		
		
		
	
	
	}

}

package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Status {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
		WebElement cb= driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
		boolean b = cb.isSelected();
	 
		if (b==true)	
		{System.out.println("status is checked ");
		}
		else
		{	System.out.println("status is unchecked ");}
		driver.close();

	}

}

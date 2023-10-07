package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuery_assignment {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement tgt = driver.findElement(By.id("droppable"));
		
		Actions a= new Actions(driver);
		a.dragAndDrop(src, tgt).perform();
		
		
		
	}

}

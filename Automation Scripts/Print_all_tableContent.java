package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_all_tableContent {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/asus/Desktop/Demo.html");
		
		Thread.sleep(2000);
		List<WebElement> tablecontent = driver.findElements(By.tagName("td"));
		int count=tablecontent.size();
		for(WebElement a: tablecontent )
		{
		
			System.out.println(a.getText());
			
		}
		driver.close();
		
	}

}

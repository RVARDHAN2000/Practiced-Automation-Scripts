package Qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_BBC_Print_news_console {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.bbc.com/");
		List<WebElement> news = driver.findElements(By.className("top-list-item__headline"));
		
		int count =news.size();
		
for(int i=0;i<5;) {
	
	System.out.println(++i+") "+news.get(i).getText());}
	
	driver.close();
	
	}

}

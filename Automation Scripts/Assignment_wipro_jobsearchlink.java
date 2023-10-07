package Qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_wipro_jobsearchlink {

	

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	driver.get("https://www.google.com/");
	WebElement search = driver.findElement(By.id("APjFqb"));
	search.sendKeys("Wipro job search");

	 List<WebElement> allinks = driver.findElements(By.xpath("//a"));
	 int count = allinks.size();
	 for(int i=0;i<count;i++) {
			
			System.out.println(i+") "+allinks.get(i).getAttribute("href"));}
			
			driver.close();
			
	
	}

}

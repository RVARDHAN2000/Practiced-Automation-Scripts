package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;



// navigate flipkart application 
//search for  iphone 14 pro max(16 matches)
//print the name==> price of all the mobiles

public class Assignment_flipkart_price_name{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.name("q"));
		
		search.sendKeys("iphone 14 pro max"+Keys.ENTER);
	
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[.='✕']")).click();
		List<WebElement> allname = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro')]"));
	  
		List<WebElement> allprice = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro')]/../../div[2]/div[1]/div[1]/div[1]"));
		
		//List<WebElement> allprice = driver.findElements(By.xpath("//div[contains(text(),'99')]"));
				int count =allname.size();
		//driver.findElement(By.xpath("//button[.='✕']")).click();
		
		for(int i=0;i<count;) {
		
		System.out.println(++i+") "+allname.get(i).getText()+"=====>"+allprice.get(i).getText());
		}
		
		driver.close();
		
		 }

}

package Qsp;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.xpath("//input[@type='password'and@name='pwd']"));
		password.sendKeys("manager");
		WebElement Login = driver.findElement(By.id("loginButton"));
		Login.click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.partialLinkText("About your")).click();
		driver.findElement(By.partialLinkText("Service Agreemen")).click();
		String pwh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();	
		 for (String wh : allwh)      {
			 if(!wh.equals(pwh)) {
				driver.switchTo().window(wh);
				
			List<WebElement> wes = driver.findElements(By.xpath("//h2"));
		Thread.sleep(2000);
			int count =wes.size();
			System.out.println(count);
			for(WebElement w : wes )		{	
				System.out.println(w.getText());
			}}
			}
		
		}
		}



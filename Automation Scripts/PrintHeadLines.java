package Qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class PrintHeadLines {
	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver d=new ChromeDriver();
		 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 d.get("https://demo.actitime.com/login.do");
		 d.findElement(By.id("username")).sendKeys("admin");
		 d.findElement(By.name("pwd")).sendKeys("manager");
		 d.findElement(By.id("loginButtonContainer")).click();
		 d.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		 d.findElement(By.linkText("About your actiTIME")).click();
		 d.findElement(By.linkText("Read Service Agreement")).click();
		 String pwh=d.getWindowHandle();
		java.util.Set<String> wh = d.getWindowHandles();
		 for(String s:wh){
			 d.switchTo().window(s);
		 List<WebElement> sa = d.findElements(By.xpath("(//h2)"));
			 int count=sa.size();
			 Thread.sleep(500);
	 		 System.out.println(count);
			 for(WebElement m:sa) {
				 Thread.sleep(500);
				 System.out.println(m.getText());
				  }
		 }
			 
		}
	
}
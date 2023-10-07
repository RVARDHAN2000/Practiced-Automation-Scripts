package Qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Bing {
	public static void main(String[] args) throws AWTException, InterruptedException {
	
	
		WebDriver driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bing.com/news");
		Thread.sleep(2000);
		Robot r= new Robot();
		     r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		 
		driver.manage().window().maximize();
	
		driver.findElement(By.id("id_n")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Switch to a personal account']")).click();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.name("loginfmt")).sendKeys("rvardhanrathod@gmai.com");
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("sb_form_q")).sendKeys("AB");

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("sb_form_q")).clear();
		for(char i='A';i<'z';i++) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		String st ="article ";
		
		driver.findElement(By.id("sb_form_q")).sendKeys(st+i);
	
	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(300);
		
		driver.findElement(By.id("sb_form_q")).clear();
	}
	}
}

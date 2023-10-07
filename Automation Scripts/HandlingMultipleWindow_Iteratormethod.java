package Qsp;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HandlingMultipleWindow_Iteratormethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(2000);
		
		String pwh = driver.getWindowHandle();
		
		Set<String> allwh = driver.getWindowHandles();
		
		java.util.Iterator<String> i =  allwh.iterator();
		
		while(i.hasNext()) {
			String s = i.next();
			if(!s.equals(pwh)) {
			driver.switchTo().window(s);
			driver.close();
			
	     	}
			driver.switchTo().window(pwh);
			driver.close();
			
			}
		
		
	}

}

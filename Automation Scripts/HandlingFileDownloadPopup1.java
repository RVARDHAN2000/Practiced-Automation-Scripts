package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFileDownloadPopup1 {

	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		
		//We cannot handle the file download popup in the newer version of the browsers
		
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//p[.='Java']/../p[2]/a")).click();
		
		
	}

}

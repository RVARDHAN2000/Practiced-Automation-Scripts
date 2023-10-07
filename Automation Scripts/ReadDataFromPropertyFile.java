package Qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		String path ="./Data/CommonData.property";
		FileInputStream fis = new FileInputStream(path);
		
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		
		System.out.println(url);
		
		String un= p.getProperty("un");
		
		System.out.println(un);
		
        String pw= p.getProperty("pw");
		
		System.out.println(pw);
		
	/*	WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.quit();  
		*/
		
	}

}

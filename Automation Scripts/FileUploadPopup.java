package Qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/asus/Desktop/Nokri.html");
		File f= new File(".\\File\\resumeUD1.pdf");
		String absPath = f.getAbsolutePath();
		
		driver.findElement(By.id("cv")).sendKeys(absPath);
		Thread.sleep(2000);
		System.out.println(" Pass ");
		driver.quit();
		
		
	}

}

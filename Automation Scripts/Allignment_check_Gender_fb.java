package Qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allignment_check_Gender_fb {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		WebElement create_new_acc=driver.findElement(By.linkText("Create new account"));
		create_new_acc.click();
		Thread.sleep(2000);
		WebElement rk_f=driver.findElement(By.xpath("//input[@value=1]"));
		WebElement rk_m=driver.findElement(By.xpath("//input[@value=2]"));
		WebElement rk_c=driver.findElement(By.xpath("//input[@value=-1]"));
		
		
		int f=rk_f.getLocation().getY();
		int m=rk_m.getLocation().getY();
		int c=rk_c.getLocation().getY();
		
		if(f==m&&m==c) {
			System.out.println("The gender radio keys are aligned properly");
			
		}
		else 
			System.out.println("The gender radio keys are not aligned properly");
		
		
		driver.quit();
	}

}

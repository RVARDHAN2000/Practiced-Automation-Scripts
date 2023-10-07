package Qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Careinsurance_negative_test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		WebElement policynumber = driver.findElement(By.className("form-control"));
		policynumber.sendKeys("123");
	 

		WebElement dob = driver.findElement(By.id("dob"));
		dob.click();
		 
		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
		Select s = new Select(month);
	 
		s.selectByValue("3");
		WebElement year = driver.findElement(By.className("ui-datepicker-year"));
		Select s11 = new Select(year);
		s11.selectByValue("2000");
 
		
		driver.findElement(By.linkText("28")).click();
		 
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
	 
		driver.findElement(By.id("renew_policy_submit")).click();
		 
		
		boolean b = driver.findElement(By.id("policynumberError")).isDisplayed();
		
		if (b==true)
			System.out.println(" error message is displayed and pass ");
		else
			System.out.println("error message is not displayed fail");
		driver.quit();
		
		
	}

}

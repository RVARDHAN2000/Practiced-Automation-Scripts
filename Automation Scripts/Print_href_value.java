package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_href_value {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
		WebElement forgot_pwd = driver.findElement(By.id("toPasswordRecoveryPageLink"));
		System.out.println(forgot_pwd.getAttribute("href"));
		driver.close();
	}

}

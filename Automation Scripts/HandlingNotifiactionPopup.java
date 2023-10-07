package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingNotifiactionPopup {

	public static void main(String[] args) {
		// Disable the notification before using the browser with method called getArguments();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		//Use/pass the reference variable as an parameter to the ChroDriver constructor 
		
		WebDriver driver =new ChromeDriver(option);
		driver.get("https://www.yatra.com/");
		
	}

}

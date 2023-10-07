package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlNavigation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
        String url= driver.getCurrentUrl() ;
        if (url.equals("https://www.selenium.dev/")) {
        	System.out.println("Pass");
        }
        else
        	System.out.println("fail");
	
        driver.quit();
	}

}

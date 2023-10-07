package Qsp;

import org.openqa.selenium.WebDriver;

public class DemoA {
	 public static void testA(WebDriver driver)
	 {
	driver.get("https://www.google.co.in/");
	String title =driver.getTitle();
	System.out.println(title);
	driver.quit();
	 }

}

package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoB {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		DemoA.testA(driver);
	}

}

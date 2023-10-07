package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_X_and_Y_axis_button {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement Login_button = driver.findElement(By.xpath("//button[.='Log in']"));
		int x_Axis=Login_button.getLocation().getX();
		int y_Axis=Login_button.getLocation().getY();
		System.out.println("x_Axis = "+x_Axis+" px");
		System.out.println("y_Axis = "+y_Axis+" px");
		driver.quit();
	}

}

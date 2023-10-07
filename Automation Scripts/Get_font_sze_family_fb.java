package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_font_sze_family_fb {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement fpwd=driver.findElement(By.xpath("//a[.='Forgotten password?']"));
	    String	size=fpwd.getCssValue("font-size");
		String style=fpwd.getCssValue("font-family");
		System.out.println("size = "+size);
		System.out.println("font 	"
				+ ".type = "+style);
		driver.quit();
	}

}

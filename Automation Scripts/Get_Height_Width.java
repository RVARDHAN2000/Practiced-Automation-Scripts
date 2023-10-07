package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Height_Width {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.xpath("//input[@type='password'and@name='pwd']"));

		int height_1 =username.getSize().getHeight();
		int Width_1 =username.getSize().getWidth();
		int height_2 =password.getSize().getHeight();
		int Width_2 =password.getSize().getWidth();
		
		
	
		if (height_1==height_2&&Width_2==Width_1  ) 
		{System.out.println("The Username and the password textfields are alligned properly & pass ");}
      	
	   else  {
		System.out.println("The Username and the password textfields are  not alligned properly & pass ");}
		driver.close();
}

}

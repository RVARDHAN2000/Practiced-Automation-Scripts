package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/asus/Desktop/Hotels.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlistbox);
		//firstmethod
		
		s.selectByIndex(0);
		
		//second Method
		
		s.selectByValue("i");
		
		//Third method
		
		s.selectByVisibleText("vada");
		
		//fourth method
		
		WebElement fOption = s.getFirstSelectedOption();
		System.out.println(fOption.getText());
		
		//fifth method
		
		s.deselectByIndex(0);
		
		//sixth method
		
		s.deselectByValue("i");
		
		//seventh method
		
		s.deselectByVisibleText("idly");
		
		//eight method
		
		s.deselectAll();
		
		//nineth method
		
		String text = s.getWrappedElement().getText();
		
		System.out.println(text);
		
				
		
		
		
		
		
		

	
	
	}

}

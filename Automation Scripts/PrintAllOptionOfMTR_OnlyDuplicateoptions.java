package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionOfMTR_OnlyDuplicateoptions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/asus/Desktop/Hotels.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlistbox);
		List<WebElement>  alloptions= s.getOptions();
		
		
		for(int i=0;i<alloptions.size();i++)
			for(int j=i+1;i<alloptions.size();j++){
				{
					String t1 = alloptions.get(i).getText();
					String t2 = alloptions.get(j).getText();
			if(t1.equals(t2)) {
			System.out.println(t1);	
			
			}
			}
			
				   
		}
		  driver.quit();
		
	}

}

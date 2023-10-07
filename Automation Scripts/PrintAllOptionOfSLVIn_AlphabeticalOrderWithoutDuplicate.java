package Qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionOfSLVIn_AlphabeticalOrderWithoutDuplicate {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/asus/Desktop/Hotels.html");
		WebElement slvlistbox = driver.findElement(By.id("slv"));
		Select s = new Select(slvlistbox);
		List<WebElement>  alloptions= s.getOptions();
        TreeSet<String> t= new TreeSet();
			
        for(int i=0; i<alloptions.size() ; i++) {
        	
        	String text = alloptions.get(i).getText();
        	t.add(text);
        }   
        System.out.println(t);
        driver.quit();
	}
	

}

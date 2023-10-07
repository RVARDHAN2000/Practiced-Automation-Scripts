package Qsp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionOfSLVIn_AlphabeticalOrder {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/asus/Desktop/Hotels.html");
		WebElement slvlistbox = driver.findElement(By.id("slv"));
		Select s = new Select(slvlistbox);
		List<WebElement>  alloptions= s.getOptions();
		alloptions.sort((Comparator<? super WebElement>) alloptions);
		System.out.println(alloptions);
		} 
		
	}



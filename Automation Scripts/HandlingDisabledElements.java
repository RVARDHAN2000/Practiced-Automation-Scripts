package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElements {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.get("file:///C:/Users/asus/Desktop/dem.html");
		 
		 // if we add input to the element which is disabled 
		 
		 // driver.findElement(By.id("d2")).sendKeys("123");
		 
		 driver.findElement(By.id("d1")).sendKeys("123");
		 
		 //USING THE JAVA SCRIPTEXICUTER CLASS TO DOWNCAST BEACUSE AVOIDING THE ACCESS TO THE OTHER METHODS 
		 
		 JavascriptExecutor j = (JavascriptExecutor) driver;
		 j.executeScript("document.getElementById(\"d2\").value=\"srxdg\"");
		 
		 
		 
	}

}

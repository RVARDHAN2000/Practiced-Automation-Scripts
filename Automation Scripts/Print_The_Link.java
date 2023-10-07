package Qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_The_Link {

	public static void main(String[] args) throws InterruptedException {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the link ");
		String link= s.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.get(link);
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		int count=alllinks.size();
		
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String st=alllinks.get(i).getText();
			System.out.println(st);
		}
		driver.close();
	}

}

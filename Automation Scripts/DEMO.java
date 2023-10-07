package Qsp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import java.util.TreeSet;

public class DEMO {
public static void main(String[] args) {


	
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

	        // Initialize the WebDriver
	        WebDriver driver = new ChromeDriver();

	        // Open the webpage with the list box
	        driver.get("file:///C:/Users/asus/Desktop/Hotels.html"); // Replace with the actual URL of the page

	        // Locate the list box element
	        WebElement listBox = driver.findElement(By.id("mtr")); // Replace with the actual ID of your list box

	        // Get all the text from the list box and store it in a TreeSet for automatic sorting
	        TreeSet<String> listBoxTextSet = new TreeSet<>();

	        for (WebElement option : listBox.findElements(By.tagName("select"))) {
	            listBoxTextSet.add(option.getText());
	        }

	        // Print the sorted text
	        System.out.println("Text from the list box in alphabetical order:");
	        for (String text : listBoxTextSet) {
	            System.out.println(text);
	        }

	        // Close the WebDriver
	        driver.quit();
	    

}
}

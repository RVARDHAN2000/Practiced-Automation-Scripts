package Qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTGroupMemberImpl;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		FileInputStream fis = new FileInputStream("./File/customer.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		int count = wb.getSheet("actitime").getLastRowNum();
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com");
		
		
		
		for(int i =1 ; i<=count;i++) {
			
	 String uns =wb.getSheet("actitime").getRow(i).getCell(0).getStringCellValue();
	 String pws =wb.getSheet("actitime").getRow(i).getCell(1).getStringCellValue();
	 //System.out.println(uns+"\t"+pws);
		
	 
	 driver.findElement(By.id("username")).sendKeys(uns);
	 driver.findElement(By.name("pwd")).sendKeys(pws);
	 driver.findElement(By.xpath("//div[.='Login ']")).click();
	  boolean b = driver.findElement(By.xpath("//span[contains(text(),'invalid')]")).isDisplayed();
	 if(b==true) { System.out.println(uns+"\t"+pws+" is passed ");
		}
		else
			System.out.println("failed " +uns+"  "+pws);
	}
        // driver.navigate().back();
		Thread.sleep(2000);
		
		 driver.findElement(By.id("username")).clear();
		 driver.findElement(By.name("pwd")).clear();
	//	driver.navigate().back();
}
}
package Qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {

		//get the java representative object of physical file 
		FileInputStream fis = new FileInputStream("./File/customer.xlsx");
		
		//open the workbook 
		Workbook wb = WorkbookFactory.create(fis);
		
		//get the control of the sheet ,row,cell,getcellvalue
		
		String customername =wb.getSheet("Create Customer").getRow(1).getCell(1).getStringCellValue();
		
		String description =wb.getSheet("Create Customer").getRow(1).getCell(2).getStringCellValue();
		System.out.println(customername+" "+description);
		
		
		//REWRITE IN TO THE EXCEL FILE IMPLICITLY
		
		wb.getSheet("Create Customer").getRow(1).getCell(3).setCellValue("fail");
		
		FileOutputStream fos = new FileOutputStream("./File/customer.xlsx");
		
		wb.write(fos);
		
		
	}


}

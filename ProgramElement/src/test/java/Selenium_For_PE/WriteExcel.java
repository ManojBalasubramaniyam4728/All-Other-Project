package Selenium_For_PE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel {
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException  {
		
		       //Writing into excel
		
	 	File file=new File("C:\\Users\\user\\Downloads\\Book1.xlsx");
	 	FileInputStream fis = new FileInputStream(file);
	 	
	 	     //getting into cells and row 
	 Workbook workbook=  WorkbookFactory.create(fis);
	   Sheet sheet=workbook.getSheet("Sheet1");
	   Row row=sheet.createRow(0);
	   Cell cell=row.createCell(0);
	 
	          //writing know
	 
	   FileOutputStream fos=new FileOutputStream(file);
	   cell.setCellValue("Srinivas");
	   workbook.write(fos);
           
	 	
	 	
	
	 	
		
	}

}


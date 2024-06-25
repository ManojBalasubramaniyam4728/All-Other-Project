package Selenium_For_PE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Wrting_Excel_Looping_DataEntery {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		Scanner sc=new Scanner(System.in);

	File file=new File("C:\\Users\\user\\Downloads\\Book1.xlsx");
 	FileInputStream fis = new FileInputStream(file);
 	
 	     //getting into cells and row 
 Workbook workbook=  WorkbookFactory.create(fis);
   Sheet sheet=workbook.getSheet("Sheet1");
   //looping 
      
   for(int i=0;i<10;i++) {
    Cell cell=sheet.createRow(i).createCell(0);
	String name=sc.nextLine();
	  cell.setCellValue(name);
	    }
   FileOutputStream fos=new FileOutputStream(file);
   workbook.write(fos);
       }
	}



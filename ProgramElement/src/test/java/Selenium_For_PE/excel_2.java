package Selenium_For_PE;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excel_2 {
	
	public static ArrayList<String> getData() throws IOException {
		ArrayList<String> values=new ArrayList<String>();
		FileInputStream fis = new FileInputStream("C:\\Users\\user\\Downloads\\ticketReport_Jun_01-2023_to_Jun_06-2023.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("ticket report")) {
				XSSFSheet sheet=workbook.getSheetAt(i);
				//identify testcase coloumn by scanning the entire 1 st row
				Iterator<Row> rows=sheet.rowIterator();//sheet is collection of rows
				Row  firstRow  =rows.next();
				Iterator<Cell> cell=firstRow.cellIterator();//row is collection of cell
				int k=0;
				int coloumn=0;
				while(cell.hasNext()) {
				Cell value=	cell.next();
				if(value.getStringCellValue().equalsIgnoreCase("Ticket No")) {
					coloumn=k;
				}

				k++;
				}
				System.out.println(coloumn);
				//onec coloumn is identified then scan entier test case coloumn to identify purchase testcase row
	
						//afrer you grab purchase test case row=pull all the data of that row and feed test
					Iterator<Cell>	cv=firstRow.cellIterator();
					while(cv.hasNext()) {
						Cell c=cv.next();
						if(c.getCellType()==CellType.STRING) {
						values.add(c.getStringCellValue());
					       }
						else {
							values.add(NumberToTextConverter.toText(c.getNumericCellValue()));
						}
					}
				}
			}
 
	
		return values;
	
	}

	}

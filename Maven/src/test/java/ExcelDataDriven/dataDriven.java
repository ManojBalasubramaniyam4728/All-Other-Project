package ExcelDataDriven;

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

public class dataDriven {
	
	public static ArrayList<String> getData(String testCase) throws IOException {
		ArrayList<String> values=new ArrayList<String>();
		FileInputStream fis = new FileInputStream("C:\\Users\\user\\Downloads\\samplePractice.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet=workbook.getSheetAt(i);
				//identify testcase coloumn by scanning the entire 1 st row
				Iterator<Row> rows=sheet.rowIterator();//sheet is collection of rows
				Row  firstRow  =rows.next();
				Iterator<Cell> cell=firstRow.cellIterator();//row is collection of cell
				int k=0;
				int coloumn=0;
				while(cell.hasNext()) {
				Cell value=	cell.next();
				if(value.getStringCellValue().equalsIgnoreCase("TestCase")) {
					coloumn=k;
				}
				k++;
				}
				System.out.println(coloumn);
				//onec coloumn is identified then scan entier test case coloumn to identify purchase testcase row
				while(rows.hasNext()) {
					Row r=rows.next();
					if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testCase)){
						//afrer you grab purchase test case row=pull all the data of that row and feed test
					Iterator<Cell>	cv=r.cellIterator();
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
 
		 }
	}
		return values;
	
	}

	}

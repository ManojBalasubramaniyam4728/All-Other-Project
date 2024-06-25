package ExcelDataDriven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class KeyValueIntoExcel {
	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Student Data");
		Map<String, String> data = new HashMap<String, String>();
		
		data.put("Name", "Johny");
		data.put("Password", "John@123");
		
		int rowno = 0; // to store the row in excel sheet

		for (Map.Entry entry : data.entrySet()) { // to read the data from hash map we use this method,entry contains
													// two value(key,value)

			XSSFRow row = sheet.createRow(rowno++); // to create new row

			// Create new cell in particular row and we are storing the value using Setcell
			// value method i,e key and value we are storing

			row.createCell(0).setCellValue((String) entry.getKey());

			row.createCell(1).setCellValue((String) entry.getValue());

		}

		FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Documents\\keyvalue.xlsx");
		workbook.write(fos);
		fos.close();
		System.out.println("Excel written succesfully");

	}

}

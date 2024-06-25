package ExcelDataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Colouring_Excel {
	public static void main(String[] args) throws IOException {
		String FilePath = "C:\\Users\\user\\Desktop\\ticketReport_Jun_01-2023_to_Jun_06-2023.xlsx";
		String SheetName = "Ticket Report";
		String headerName = "Priority";
		String RowName = "ASC-0806";
		String UiValue = "Medium";

		File file = new File(FilePath);
		FileInputStream fis = new FileInputStream(file);
		Workbook work = WorkbookFactory.create(fis);
		Sheet sheet = work.getSheet(SheetName);

		// To get header index
		Row headerRow = sheet.getRow(0);
		int headerIndex = -1;
		int rowIndex = -1;
		String desiredHeader = headerName;
	System.out.println(sheet.getLastRowNum());
		// to find rowindex
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
		String row = sheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println(row);
			if (row.equalsIgnoreCase(RowName)) {
				rowIndex = i;
				break;
			}
		}
		System.out.println(rowIndex);
		
		for (int i = 0; i < headerRow.getLastCellNum(); i++) {
			String header = sheet.getRow(0).getCell(i).getStringCellValue();
			if (header.equalsIgnoreCase(headerName)) {
				headerIndex = i;
				break;
			}
		}
		System.out.println(headerIndex);
	
		String old = sheet.getRow(rowIndex).getCell(headerIndex).getStringCellValue();
	System.out.println(old);
		String New = UiValue;
		if (!(old.toLowerCase().contains(New.toLowerCase()))) {
			Cell r = sheet.getRow(rowIndex).getCell(headerIndex);
			FileOutputStream fos = new FileOutputStream(file);
		
			r.setCellValue(old + " != " + New);
		
			CellStyle style = work.createCellStyle();
			// style.setFillBackgroundColor(IndexedColors.RED.getIndex());
			style.setFillPattern(FillPatternType.THIN_BACKWARD_DIAG);
			style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
			// style.setFillBackgroundColor(IndexedColors.RED.getIndex());
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			r.setCellStyle(style);
			work.write(fos);
			
			fos.close();
		}
		fis.close();
		work.close();
		System.out.println("sdfcvgbhn m");
	}
}

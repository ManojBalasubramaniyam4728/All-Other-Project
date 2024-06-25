package ExcelDataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHighlighted {
   
	public static void main(String[] args) {
        String excelFilePath = "C:\\Users\\user\\OneDrive\\Documents\\Book2.xlsx";
        String sheetName = "Sheet1";
        
        try  {

    		File file = new File(excelFilePath);
    		FileInputStream fis = new FileInputStream(file);
    		Workbook work = WorkbookFactory.create(fis);
    		Sheet sheet = work.getSheet(sheetName);
    		
            DataFormatter dataFormatter = new DataFormatter();
            for (Row row : sheet) {
                Cell cell1 = row.getCell(0); 
                Cell cell2 = row.getCell(1);
	
            if (cell1 != null && cell2 != null) {
                String value1 = dataFormatter.formatCellValue(cell1);
                String value2 = dataFormatter.formatCellValue(cell2);
                if (value1==(value2)) 
                {
                	FileOutputStream fos = new FileOutputStream(excelFilePath);
    					CellStyle style = work.createCellStyle();
    					// style.setFillBackgroundColor(IndexedColors.RED.getIndex());
    					style.setFillPattern(FillPatternType.THIN_BACKWARD_DIAG);
    					style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
    					// style.setFillBackgroundColor(IndexedColors.RED.getIndex());
    					style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    					cell1.setCellStyle(style);
    					cell2.setCellStyle(style);
    					work.write(fos);
    					fos.close();
                	System.out.println("Are same");
					
				}
                else {
					System.out.println("Are different");
				}
            }
            }
            fis.close();
    		work.close();
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
            }
	
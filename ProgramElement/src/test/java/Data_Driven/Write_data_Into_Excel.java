package Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_data_Into_Excel {
	
	public static void WriteDataInToExcel(String excelPath, String sheetName, String uniqueData, String header,String data,boolean isTableVertical ) throws EncryptedDocumentException, IOException, InvalidFormatException {
		FileInputStream excelFile = new FileInputStream(new File(excelPath));
		Workbook workbook =  WorkbookFactory.create(excelFile);
		Sheet sheet = workbook.getSheet(sheetName);
		DataFormatter df=new DataFormatter();
		boolean flag = false;
		String actualTestCaseName="";
		String actualKey="";
		
		//For Horizontal Data Write Into Excel
		if (isTableVertical==false) {
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			try {
				actualTestCaseName =df.formatCellValue(sheet.getRow(i).getCell(0));
			} catch (Exception e) {
			       }
			if (actualTestCaseName.equalsIgnoreCase(uniqueData)) {
				for (int j = 1; j <= sheet.getRow(i).getLastCellNum(); j++) {
					try {
						actualKey =df.formatCellValue( sheet.getRow(i - 1).getCell(j));
					} catch (Exception e) {
					}
					if (actualKey.equalsIgnoreCase(header)) {
						try {
							sheet.getRow(i).createCell(j).setCellValue(data);
						} catch (Exception e) {
						     }
						flag = true;
						break;
					}
				}
			}
			if (flag==true) {
				break;
			}
		  }
		}
		//For Vertical Data Write Into Excel
		else if (isTableVertical==true) {
			for (int i = 1; i <= sheet.getRow(i).getLastCellNum(); i++) {

				try {
					actualTestCaseName = df.formatCellValue(sheet.getRow(0).getCell(i));

				} catch (Exception e) {
				}
				if (actualTestCaseName.equalsIgnoreCase(uniqueData)) {
					for (int j = 0; j <= sheet.getLastRowNum(); j++) {

						try {
							actualKey = df.formatCellValue(sheet.getRow(j).getCell(i-1));
						} catch (Exception e) {
						}
						if (actualKey.equalsIgnoreCase(header)) {
							try {
								sheet.getRow(j).createCell(i).setCellValue(data);
							} catch (Exception e) {
							     }
							flag = true;
							break;
						    }
						}
					}
				if (flag==true) {
					break;
				}
		    }
		}
		FileOutputStream fos = new FileOutputStream(excelPath);
		workbook.write(fos);
		fos.close();
		workbook.close();
		excelFile.close();
	} 
}

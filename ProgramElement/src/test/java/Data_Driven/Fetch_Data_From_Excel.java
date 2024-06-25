package Data_Driven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Data_From_Excel {
	
public static LinkedHashMap<String,String> getDataFromExcel(String excelPath, String sheetName, String uniqueData,boolean isTableVertical) throws EncryptedDocumentException, IOException, InvalidFormatException {
		FileInputStream fisExcel=new FileInputStream(excelPath);
		Workbook workbook = WorkbookFactory.create(fisExcel);
		DataFormatter df=new DataFormatter();
		LinkedHashMap<String, String> map=new LinkedHashMap<>();
		Sheet sheet = workbook.getSheet(sheetName);
		int lastRowNumber = sheet.getLastRowNum(); //return index ==> index

		String value="";
		String actualTestCaseName = "";
		String actualKey = "";
		
		//For Horizontal Data Featching In Key Value Pair
		if (isTableVertical==false) {
		for (int i = 0; i <=lastRowNumber; i++) {
			String actualTestcase = df.formatCellValue(sheet.getRow(i).getCell(0));
			if (actualTestcase.equals(uniqueData)) {
				short lastcellNumber = sheet.getRow(i).getLastCellNum(); //return count/size ==> count-1
				for (int j = 1; j < lastcellNumber-1; j++) {
					actualKey = df.formatCellValue(sheet.getRow(i-1).getCell(j));
					value = df.formatCellValue(sheet.getRow(i).getCell(j));
					map.put(actualKey, value);
				}
				break;
		     	}
		    }
		}
		
		//For Vertical Data Featching In Key Value Pair
		else if(isTableVertical==true) {
			for (int i = 1; i <= sheet.getRow(i).getLastCellNum(); i++) {

				try {
					actualTestCaseName = df.formatCellValue(sheet.getRow(0).getCell(i));

				} catch (Exception e) {
				}
				if (actualTestCaseName.equalsIgnoreCase(uniqueData)) {
					for (int j = 0; j <= sheet.getLastRowNum(); j++) {

						try {
							actualKey = df.formatCellValue(sheet.getRow(j).getCell(i-1));
							try {
								value = df.formatCellValue(sheet.getRow(j).getCell(i));
							} catch (Exception e) {
							}

							if ((actualKey.isEmpty()&&value.isEmpty()) ||actualKey.isEmpty()) {
							} else {
								map.put(actualKey, value);
							}
						} catch (Exception e) {
						}
					}
					break;
				}
			}
		 }
		workbook.close();
		fisExcel.close();
		return map;
   }
}

package base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {

	public static String filePath="C:\\Users\\user\\eclipse-workspace\\RestAssured\\src\\main\\resources\\DataProvider API.xlsx";
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	//Getting The Row Count
	public static int getRowCount(String XLfile,String XLSheet) throws IOException {
		fi=new FileInputStream(XLfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(XLSheet);
		int rowCount=ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowCount;
	}
	
	//Getting The Cell Count
	public static int getCellCount(String XLfile,String XLSheet,int rownum) throws IOException {
		fi=new FileInputStream(XLfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(XLSheet);
		row=ws.getRow(rownum);
		int cellcount=row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
	}
	
	//Getting The Data Present Inside The Cell
	public static String getCellData(String XLfile,String XLSheet,int rownum,int column) throws IOException {
		fi=new FileInputStream(XLfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(XLSheet);
		row=ws.getRow(rownum);
		cell=row.getCell(column);
		String data;
		try {
			DataFormatter formatter=new DataFormatter();
			String cellData=formatter.formatCellValue(cell);
			return cellData;
		  } 
		catch (Exception e) {
			data=" ";
		}
		wb.close();
		fi.close();
		return data;
	}
	
	//Writing The Data Inside The Cell
	public static void setCellData(String XLfile,String XLSheet,int rownum,int column, String data) throws IOException {
		fi=new FileInputStream(XLfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(XLSheet);
		row=ws.getRow(rownum);
		cell=row.getCell(column);
		cell.setCellValue(data);
		fo=new FileOutputStream(XLfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	

}

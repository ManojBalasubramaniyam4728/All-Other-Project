package Data_Driven;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class Test {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException {
		LinkedHashMap<String, String> keyValue = new LinkedHashMap<>();
		keyValue = Fetch_Data_From_Excel.getDataFromExcel("C://Users/user/Downloads/Fireflink 14 APPS TestData IOS (1).xlsx", "Ageas", "AG002", false);
		System.out.println(keyValue);
		String keysValue=Fetch_Data_From_Map.fetchDatFromMap(keyValue,"Status_Connected_verification" );
		System.out.println(keysValue);
		Write_data_Into_Excel.WriteDataInToExcel("C://Users/user/Downloads/Fireflink 14 APPS TestData IOS (1).xlsx", "Test Config", "Test", "Device_Name", "This manoj", true);
		System.out.println("successfully written");
	}
}



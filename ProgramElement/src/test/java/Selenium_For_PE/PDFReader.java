package Selenium_For_PE;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PDFReader {
	public static void main(String[] args) throws IOException {
		//System.setProperty("weddriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe")
        File file=new File("C:/Users/user/Downloads/ABP PRIVATE LIMITED_advanced_report.pdf");
		PDDocument pdf=  PDDocument.load(file);
		int pageNo = pdf.getNumberOfPages();
		System.out.println(pageNo);
		System.out.println("======================");
		PDFTextStripper strip=new PDFTextStripper();
		strip.setStartPage(1);
		strip.setEndPage(1);
		String stripText=strip.getText(pdf);
		System.out.println(stripText);
		System.out.println("======================");
		String number=stripText.replaceAll("[^0-9?]", "");
		System.out.println(number);
		System.out.println("======================");
	    String date1=(String) number.subSequence(0, 8);//it is in subSequence so down casting to string is mandatory
		System.out.println(date1);
		System.out.println("======================");
		String date2= number.substring(8, 12);//it is in substing so no need to down cast 
		System.out.println(date2);
		System.out.println("======================");
		Integer date= Integer.parseInt(date1);//Instead of down casting we can go with this
		System.out.println(date);
	
	
	}

}

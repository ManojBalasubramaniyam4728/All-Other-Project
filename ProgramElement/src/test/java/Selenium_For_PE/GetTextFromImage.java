package Selenium_For_PE;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

import java.io.File;

public class GetTextFromImage {
    public static void main(String[] args) {
        Tesseract tesseract = new Tesseract();
        
        // Set the Tesseract data path
        File tessDataFolder = LoadLibs.extractTessResources("tessdata");
        tesseract.setDatapath(tessDataFolder.getAbsolutePath());
        
        try {
            // Perform OCR on an image
            String text = tesseract.doOCR(new File("C:\\Users\\user\\Pictures\\Screenshots\\Screenshot (88).png"));
            
            // Print the recognized text
            System.out.println("Recognized text: " + text);
        } catch (TesseractException e) {
            System.err.println("Tesseract Exception: " + e.getMessage());
        }
    }
}

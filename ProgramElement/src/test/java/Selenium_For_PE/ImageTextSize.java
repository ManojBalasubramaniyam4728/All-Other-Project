package Selenium_For_PE;

    	import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
    	import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

    	public class ImageTextSize {
    		public static void main(String[] args)
    		{
    			
    			/*
    			Tesseract tesseract = new Tesseract();
    			try {

    				tesseract.setDatapath("C:\\FireFlinkClient\\resources\\flinko-client\\tessdata");

    				// the path of your tess data folder
    				// inside the extracted file
    				String text
    					= tesseract.doOCR(new File("C:\\Users\\User\\Downloads\\image_2023_07_14T11_21_55_989Z.png"));

    				// path of your image file
    				System.out.print(text);
    				System.out.println("sds");
    			}
    			catch (TesseractException e) {
    				e.printStackTrace();
    			}
    			
    			*/
    			
    			 File imageFile = new File("C:\\Users\\User\\Downloads\\screenshot (54).jpg");
     	        String desiredText = "We look forward to serving you";

     	        ITesseract tesseract = new Tesseract();
     	        tesseract.setDatapath(LoadLibs.extractTessResources("tessdata").getAbsolutePath());
                 boolean s=false;
     	        try {
     	            BufferedImage bufferedImage = ImageIO.read(imageFile);
     	            String result = tesseract.doOCR(bufferedImage);

     	            // Find the position of the desired text in the image
     	            String[] lines = result.split("\\r?\\n");
     	            int yPixel = 0;

     	            for (int i = 0; i < lines.length; i++) {
     	                System.out.println(lines[i]);
     	            }

    		}catch (Exception e) {
				// TODO: handle exception
			}

   
    		}   
}
package Selenium_For_PE;
import javax.imageio.ImageIO; 
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PNGImageDimensionReducer {
    public static void main(String[] args) {
        try {
            // Load the PNG image
            BufferedImage originalImage = ImageIO.read(new File("C:\\Users\\user\\AppData\\Local\\Temp\\screenshot7246809442673108684.png"));


            // Define the new dimensions
            int newWidth = 1080; // Set your desired width
            int newHeight = 807; // Set your desired height

            // Create a new BufferedImage with the desired dimensions
            BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);

            // Create a graphics object to draw the scaled image
            Graphics2D g = resizedImage.createGraphics();
            g.drawImage(originalImage, 0, 0, newWidth, newHeight, null);
            g.dispose();

            // Save the resized image to a PNG file
            ImageIO.write(resizedImage, "png", new File("C:\\Users\\user\\AppData\\Local\\Temp\\screenshot7246809442673108684.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

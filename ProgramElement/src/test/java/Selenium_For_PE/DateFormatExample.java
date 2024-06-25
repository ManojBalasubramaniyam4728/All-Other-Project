package Selenium_For_PE;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
    public static void main(String[] args) {
        // Get the current date
        Date currentDate = new Date();

        // Specify the desired date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");

        // Format the date and print it
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);
    }
}


package Selenium_For_PE;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DetroitRegionalTime {

    public static void main(String[] args) {
        // Set the time zone to "America/Detroit"
        ZoneId detroitTimeZone = ZoneId.of("America/Detroit");

        // Get the current time in the Detroit region
        ZonedDateTime detroitTime = ZonedDateTime.now(detroitTimeZone);

        // Define the format for the time
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy H:mm");

        // Format the time as a string
        String formattedDetroitTime = detroitTime.format(formatter);

        // Print the Detroit regional time
        System.out.println("Detroit Regional Time: " + formattedDetroitTime);
    }
}

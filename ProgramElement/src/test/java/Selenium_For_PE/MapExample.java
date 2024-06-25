package Selenium_For_PE;
import java.util.HashMap;

public class MapExample {

    public static void main(String[] args) {
        HashMap<String, String> data = new HashMap<>();
        data.put("m", "manoj");
        data.put("s", "sanjay");
        data.put("a", "alice");

        // Get the keys as an array
        String[] keys = data.keySet().toArray(new String[0]);

        int mapSize = keys.length;
        for (int i = 0; i < mapSize; i++) {
            String key = keys[i];
            System.out.println("Key: " + key );
        }
    }
}

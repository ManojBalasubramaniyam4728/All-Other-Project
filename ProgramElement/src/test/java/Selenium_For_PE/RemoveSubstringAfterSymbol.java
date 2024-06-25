package Selenium_For_PE;

//public class SplitAndRemoveValue {
//    public static void main(String[] args) {
//        String input = "<p>TestYantra Automation (vignesh@rezolve.ai)</p>";
//
//        // Split the string and remove the bracketed value
//        String result = input.replaceAll("\\((.*?)\\)", "");
//        
//        // Print the result
//        System.out.println(result);
//    }
//}
//public class ExtractValueInsideBrackets {
//    public static void main(String[] args) {
//        String input = "<p>TestYantra Automation (vignesh@rezolve.ai)</p>";
//
//        // Extract the value inside brackets
//        int startIndex = input.indexOf('(');
//        int endIndex = input.indexOf(')');
//        String result = input.substring(startIndex + 1, endIndex);
//
//        // Print the result
//        System.out.println("Result: " + result);
//    }
//}
public class RemoveSubstringAfterSymbol {
    public static void main(String[] args) {
        String input = "raghuram.p@testyantra.com";

        // Split the string at the @ symbol
        String[] parts = input.split("@");

        // Get the substring before the @ symbol
        String result = parts[0];

        // Print the result
        System.out.println("Result: " + result);
    }
}
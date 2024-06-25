package Selenium_For_PE;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaExample {
    public static void main(String[] args) {
    	 String input = "Select option from father education level dropdown in My Profile page whose value is education";
//   
//         // Use regex to extract the word after "Enter"
//         Pattern pattern = Pattern.compile("Select option from (\\w+)");
//         Matcher matcher = pattern.matcher(input);
//
//         if (matcher.find()) {
//             String extractedWord = matcher.group(1);
//             System.out.println("Extracted word: " + extractedWord);
//         } else {
//             System.out.println("No match found");
////         }
//    	 int a=input.indexOf("whose");
//          String bu=input.substring(a);
//    	  int h=bu.indexOf("is");
//    	  System.out.println(bu.substring(h+2).trim());
    	 String s1="manoj";
    	 String s2="manoj";
    	 boolean sd=s2.contains(s1);
    	 System.out.println(sd);
    	  
    }
}
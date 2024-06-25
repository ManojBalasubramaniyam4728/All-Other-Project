package Assignement;

import java.util.Scanner;

public class Chate_GPT {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    sc.close();

    if (isPalindrome(str)) {
      System.out.println("The string is a palindrome");
    } else {
      System.out.println("The string is not a palindrome");
    }
  }

  public static boolean isPalindrome(String str) {
    int length = str.length();
    for (int i = 0; i < length / 2; i++) {
      if (str.charAt(i) != str.charAt(length - i - 1)) {
        return false;
      }
    }
    return true;
  }
}
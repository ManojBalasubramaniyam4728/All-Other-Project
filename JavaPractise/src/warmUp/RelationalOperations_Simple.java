package warmUp;

import java.util.Scanner;

public class RelationalOperations_Simple {
public static void main(String[] args) {
  System.out.println("Write a Java program that compares two numbers entered by the user and prints whether the first number is greater than, equal to, or less than the second number.");
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the first number");
  int firstNumber=sc.nextInt();
  System.out.println("Enter the secound number");
  int secoundNumber=sc.nextInt();
  if(firstNumber>secoundNumber) {
	  System.out.println("First Number "+firstNumber+ " is grater than secound number "+secoundNumber);
  }
  else if(firstNumber>=secoundNumber) {
	  System.out.println("First Number "+firstNumber+ " is equal to secound number "+secoundNumber);
  }
  else if(firstNumber<secoundNumber) {
	  System.out.println("First Number "+firstNumber+ " is lesser than secound number "+secoundNumber);
  }
  sc.close();
  }
}

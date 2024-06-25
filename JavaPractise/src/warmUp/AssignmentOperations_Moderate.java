package warmUp;

import java.util.Scanner;

public class AssignmentOperations_Moderate {
    public static void main(String[] args) {
       System.out.println("Write a Java program that simulates a simple online shopping cart. Initialize a variable totalPrice with an initial value. Prompt the user to enter the price of an item, and add it to the total price. Repeat this process until the user decides to finish shopping. Display the final total price.");
       double totalPrice=0.0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the price of iteam if want to close shoping enter 0");
       while (true) {
		double iteamprice=sc.nextDouble();
		if(iteamprice==0) {
			break;
		}
		totalPrice+=iteamprice;
	}
       System.out.println("The Final price is : "+ totalPrice);
       sc.close();
    }
    
}

package warmUp;

import java.util.Scanner;

public class RelationalOperations_Moderate {
public static void main(String[] args) {
	System.out.println("Write a Java program that determines whether a given year is a leap year. The year is a leap year if it is divisible by 4 but not divisible by 100, or if it is divisible by 400. Prompt the user to enter a year and display the result.");
	System.out.println("Enter the year as to check whether leap year are not");
	Scanner sc=new Scanner(System.in);
	int year=sc.nextInt();
	
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("The Year "+year+" Is Leap year");
		}
	
	else {
		System.out.println("The Year "+year+" Is Not A Leap year");
	}
		sc.close();
}
}

package warmUp;

import java.util.Scanner;

public class LogicalOperations_Moderate {
public static void main(String[] args) {
	System.out.println("Write a Java program that checks whether a year entered by the user is a leap year and whether it has 365 or 366 days. Use logical operators to make the determination.");
	System.out.println("Enter the year");
	Scanner sc=new Scanner(System.in);
	int year=sc.nextInt();
	if(year%4==0&&year%100==0||year%400==0) {
		System.out.println("The year "+year+" Is a leap year with 366 days");
	}
	else {
		System.out.println("The year "+year+" Is not a leap year with 365 days");
		}
    sc.close();
 }
}

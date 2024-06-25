package warmUp;

import java.util.Scanner;

public class LogicalOperations_Simple {
public static void main(String[] args) {
	System.out.println("Write a Java program that checks whether a given number is both divisible by 2 and 3. Prompt the user to enter a number and display whether the condition is met.");
	System.out.println("Enter the Number nee to check whethe it is divisible by 3 and 2");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	if(num%2==0&&num%3==0) {
		System.out.println("The Number "+num+" Is divisible by both 2and 3");
	}
	else {
		System.out.println("The Number "+num+" Is Not divisible by both 2and 3");
		}
	sc.close();
}
}

package warmUp;

import java.util.Scanner;

public class DoWhileLoop_Complex {
public static void main(String[] args) {
	System.out.println("Write a Java program to explore the Collatz sequence for a given starting number. The Collatz sequence is defined as follows:\r\n"
			+ "\r\n"
			+ "If the current number is even, divide it by 2.\r\n"
			+ "If the current number is odd, multiply it by 3 and add 1.\r\n"
			+ "The sequence continues until the number becomes 1. Count and display the number of steps it takes to reach 1.\r\n"
			+ "\r\n"
			+ "Implement the program using a do-while loop and allow the user to input the starting number. Ensure that the user's input is a positive integer.\r\n"
			+ "\r\n"
			+ "Display the generated Collatz sequence and the number of steps it took to reach 1.");
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the n number");
	int n=sc.nextInt();
	int sum=0;
	int currentNumber =n;
	if (n<0) {
		System.out.println("Please enter a positive integer for the end point.");
	}
	do {
		if(currentNumber%2==0) {
			currentNumber/=2;
		}
		else {
			currentNumber=3*currentNumber+1;
		}
		System.out.print(currentNumber +" ");
		sum++;
	} while (currentNumber!=1);
	System.out.println("Number of steps to reach "+sum);
	sc.close();
  }
}


package warmUp;

import java.util.Scanner;

public class WhileLoop_Complex {
public static void main(String[] args) {
	System.out.println("Create a Java program that generates and prints the first N prime numbers, where N is entered by the user. Implement the program using a while loop to iterate until N prime numbers are generated.\r\n"
			+ "\r\n"
			+ "Include the following features in your program:\r\n"
			+ "\r\n"
			+ "Allow the user to enter the value of N.\r\n"
			+ "Validate that the user's input is a positive integer. If not, prompt the user to enter a valid input.\r\n"
			+ "Write a function to check whether a given number is prime.\r\n"
			+ "Use the while loop to generate and print the first N prime numbers.\r\n"
			+ "Implement error checking, efficient prime number checking, and a user-friendly interface in your program.");
	
	System.out.println("Enter the range of number");
    Scanner sc = new Scanner(System.in);
    int range = sc.nextInt();

    if (range <= 0) {
        System.out.println("Please enter a positive integer.");
    }

    int count = 0;
    int number = 2;

    while (count < range-1) {
        if (isPrime(number)==true) {
            System.out.println("Prime Number Is : " + number);
        }
        count++;
        number++;
    }
    sc.close();
}
private static boolean isPrime(int num) {
    if (num <2) {
        return false;
    }
    for (int i = 2; i <num; i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}
}



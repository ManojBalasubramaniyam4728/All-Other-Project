package warmUp;

import java.util.Scanner;

public class ControlTransferStatement_Complex {
	public static void main(String[] args) {
		System.out.println("Write a Java program to find and display the first N prime numbers. Implement the program using a do-while loop. Allow the user to input the value of N.\r\n"
				+ "\r\n"
				+ "However, add the following conditions:\r\n"
				+ "\r\n"
				+ "If a prime number is a palindrome (reads the same backward as forward), skip it and continue searching for the next prime.\r\n"
				+ "If the sum of the digits of a prime number is greater than 10, break out of the loop.\r\n"
				+ "Ensure that the user's input for N is a positive integer.\r\n"
				+ "\r\n"
				+ "Display the list of prime numbers found and the reasons for skipping or breaking out of the loop.");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range number");
		int range=sc.nextInt();
		int count=0;
	    int number=2;
	    int digit=0;
	    if (range<0) {
			System.out.println("Please enter a positive integer.");
		}
		do {
			if (isPrime(number)==true) {
				digit=digit+number;
				int data=number;
				int sum=0;
				while (data>0) {
					int rem=data%10;
					sum=(sum*10)+rem;
					data=data/10;
				}
				if (sum!=number) {
					System.out.println("The number is prime and not a plandrom "+number);
				}
				if (digit>10) {
					break;
				}
			}
			count++;
			number++;
		} while (count<=range-1);
		
		sc.close();
	}
		private static boolean isPrime(int num) {
			if (num<=2) {
				return false;
			}
			for (int i = 2; i <num; i++) {
				if (num%2==0) {
					return false;
				}
			}
			return true;
		}
}

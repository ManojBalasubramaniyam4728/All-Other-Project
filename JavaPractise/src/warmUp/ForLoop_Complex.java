package warmUp;

import java.util.Scanner;

public class ForLoop_Complex {
public static void main(String[] args) {
	System.out.println("Write a Java program to generate the Fibonacci series with a twist. The twist is that the series should skip any numbers that are divisible by 5 but not divisible by 3.\r\n"
			+ "\r\n"
			+ "Implement the program using a for loop to generate the first N numbers in this series. Allow the user to input the value of N. Ensure that the user's input is a positive integer.\r\n"
			+ "\r\n"
			+ "Display the generated Fibonacci series with the specified twist.");
	
	Scanner sc = new Scanner(System.in);

    System.out.println("Enter the starting point ");
    int start = sc.nextInt();

    System.out.println("Enter the end point ");
    int end = sc.nextInt();

    if (end <= 0) {
        System.out.println("Please enter a positive integer for the end point.");
        sc.close();
        return;
    }

    int sum = 0;
    int a = 0;
    int b = 1;

    for (int i = start; i < end; i++) {
        if (i == 0 || i == 1) {
            System.out.println(i);
        } else {
            sum = a + b;
            a = b;
            b = sum;
        }

        if (sum % 5 == 0 && sum % 3 != 0) {
            continue;
        } else {
            System.out.println(sum);
        }
    }
    sc.close();
   }
}

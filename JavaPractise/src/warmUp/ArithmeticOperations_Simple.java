package warmUp;

import java.util.Scanner;

public class ArithmeticOperations_Simple {
public static void main(String[] args) {
	System.out.println("Write a Java program that calculates and prints the area of a rectangle. Prompt the user to enter the length and width of the rectangle. Use the formula area = length * width to compute the area.");
	Scanner sc=new Scanner(System.in);
     double area;
	System.out.println("Enter the length ");
	double length=sc.nextDouble();
	System.out.println("Enter the width ");
	double width=sc.nextDouble();
	area=length*width;
	System.out.println("The Are of the rectangle is "+area);
	sc.close();
}
}

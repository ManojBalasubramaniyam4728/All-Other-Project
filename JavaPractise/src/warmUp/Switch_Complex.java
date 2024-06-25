package warmUp;

import java.util.Scanner;

public class Switch_Complex {
public static void main(String[] args) {
	System.out.println("Create a Java program for a menu-based calculator that supports addition, subtraction, multiplication, and division. Prompt the user to enter two numbers and then display a menu with the following options:\r\n"
			+ "\r\n"
			+ "Addition\r\n"
			+ "Subtraction\r\n"
			+ "Multiplication\r\n"
			+ "Division\r\n"
			+ "Based on the user's choice, perform the corresponding operation and display the result. Additionally, handle the following scenarios:\r\n"
			+ "\r\n"
			+ "If the user selects an invalid option (not 1, 2, 3, or 4), display an error message.\r\n"
			+ "If the user selects division (option 4), check if the second number is zero. If it is, display an error message indicating that division by zero is not allowed.");
	System.out.println("Enter the Input if you want to do Addition press->1,for Subtraction->2,For Multiplication->3 or for Division-> 4");
	Scanner sc=new Scanner(System.in);
	String input=sc.next();
	System.out.println("Enter the operand1 value");
	double operand1=sc.nextDouble();
	System.out.println("Enter the operand2 value");
	double operand2=sc.nextDouble();
	double result;
	switch (input) {
	case "1": result=operand1+operand2;
	System.out.println("The Result Of Addition Is: "+result);
		break;
	case "2":result=operand1-operand2;
	System.out.println("The Result Of Subtraction Is: "+result);
		break;
	case "3":result=operand1*operand2;
	System.out.println("The Result Of Multiplication Is: "+result);
	      break;
	case "4":if(operand2!=0.0) {
		result=operand1/operand2;
		System.out.println("The Result Of Division Is: "+result);
          break;
	       }
	else {
		 System.out.println("Division by zero is not allowed");
	     }
	default:
		System.out.println("You Have enter invalid input");
	}
		sc.close();	
}
}

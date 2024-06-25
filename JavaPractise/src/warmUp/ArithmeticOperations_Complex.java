package warmUp;

import java.util.Scanner;

public class ArithmeticOperations_Complex {
public static void main(String[] args) {
	System.out.println("Write a Java program that simulates a basic calculator. Prompt the user to enter two numbers and an arithmetic operation (addition, subtraction, multiplication, division). Perform the specified operation and display the result. Ensure to handle division by zero and invalid operations gracefully.");
     double result = 0;
	 Scanner sc=new Scanner(System.in);
     System.out.println("Enter the operator has to perform");
     String operator=sc.nextLine();
     System.out.println("Enter the operand1");
     double operand1=sc.nextDouble();
     System.out.println("Enter the operan2");
     double operand2=sc.nextDouble();
     
     if(operator.equals("+")) {
    	 result=operand1+operand2;
     }
     else if(operator.equals("-")) {
    	 result=operand1-operand2;
     }
     else if(operator.equals("/")) {
    	 System.out.println(operand2);
    	 if(operand2==0) {
    		 System.out.println("invalid operations gracefully");
    	 }
    	 result=operand1/operand2;
     }
     else if(operator.equals("%")) {
    	 result=operand1%operand2;
     }
     else if(operator.equals("*")) {
    	 result=operand1*operand2;
     }
     System.out.println(result);
     sc.close();
   }
}

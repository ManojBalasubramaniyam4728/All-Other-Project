package warmUp;

import java.util.ArrayList;
import java.util.Scanner;

public class AssignmentOperations_Complex {
public static void main(String[] args) {
	System.out.println("Write a Java program that simulates a bank account. Implement the following functionalities using assignment operations:\r\n"
			+ "\r\n"
			+ "Initialize a variable balance with an initial amount.\r\n"
			+ "Prompt the user to enter a transaction type (deposit or withdrawal) and an amount.\r\n"
			+ "Update the balance based on the transaction type and amount.\r\n"
			+ "Keep track of the transaction history (use an array or list).");
	Double balance=20.0;
	Scanner sc=new Scanner(System.in);
	ArrayList<String> transactionHistory=new ArrayList<>();
	int index=0;
	while(true) {
		System.out.println("Enter the transaction type deposit, withdrawl or exit");
		String transactionType=sc.next();
		if(transactionType.equalsIgnoreCase("exit")) {
			break;
		     }
		System.out.println("Enter the transaction amount");
		Double transactionAmount=sc.nextDouble();
	if(transactionType.equalsIgnoreCase("deposit")) {
		balance+=transactionAmount;
		String balanceToString=Double.toString(transactionAmount);
		transactionHistory.add(index++,"+"+balanceToString);
		System.out.println("The balnce after deposit is :"+balance);
		System.out.println("The Transaction History after deposit is : "+transactionHistory);
	}
	else if(transactionType.equalsIgnoreCase("withdrawl")) {
		balance-=transactionAmount;
		if (balance<=0) {
		System.out.println("Due to Low balance transaction cancled");
		break;
		}
		else {
			String balanceToString=Double.toString(transactionAmount);
			transactionHistory.add(index++,"-"+balanceToString);
			System.out.println("The balnce after withdrwal is :"+balance);
			System.out.println("The Transaction History after withdrwal is : "+transactionHistory);
		}
	}
	}
	sc.close();
 }
}

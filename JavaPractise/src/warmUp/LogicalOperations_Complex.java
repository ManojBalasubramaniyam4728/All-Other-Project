package warmUp;

import java.util.Scanner;

public class LogicalOperations_Complex {
public static void main(String[] args) throws InterruptedException {
	System.out.println("Write a Java program that simulates a user authentication system. Prompt the user to enter a username and password. Grant access if the entered username is \"admin\" and the password is either \"admin123\" or \"securePwd\". Display appropriate messages for successful and unsuccessful login attempts. Implement a maximum attempt limit and lock the account for 30 seconds after three unsuccessful attempts.");
	Scanner sc=new Scanner(System.in);
	int numberofattment=0;
	while(true) {
		System.out.println("Enter The username");
		String userName=sc.next();
		System.out.println("Enter The Password");
		String password=sc.next();
		if (userName.equalsIgnoreCase("admain")&& password.equalsIgnoreCase("password@123")) {
			System.out.println("User is successfully logined");
			break;
		}
		else {
			System.out.println("User Name And Password Is incorrect please check : attempts "+numberofattment++);
			if (numberofattment==3) {
				System.out.println("maximum attempt limit exceed and The account is lock  for 30 seconds try after 30 seconds");
				Thread.sleep(30000);
			}
			System.out.println("Enter yes if you want to close");
			String close=sc.next();
			if (close.equalsIgnoreCase("yes")) {
				break;
		}
		
		} 
  }
	sc.close();
}
}


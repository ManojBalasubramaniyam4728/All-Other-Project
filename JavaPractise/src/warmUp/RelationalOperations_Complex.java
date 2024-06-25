package warmUp;

import java.util.Scanner;

public class RelationalOperations_Complex {
public static void main(String[] args) {
	System.out.println("Write a Java program that simulates a simple login system. Ask the user to enter a username and password. Check if the entered username is \"admin\" and the password is \"password123\". Print a message indicating whether the login is successful or not.");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the user name");
	String username=sc.nextLine();
	System.out.println("enter the password");
	String password=sc.nextLine();
	if(username.equalsIgnoreCase("admain")&&password.equalsIgnoreCase("password@123")) {
		System.out.println("User logged in successful");
	}
	else {
		System.out.println("User enter username or password is wrong");
	}
	sc.close();
}
}

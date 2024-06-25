package warmUp;

import java.util.Scanner;

public class ifelse_Complex {
public static void main(String[] args) {
	System.out.println("You are tasked with creating a Java program to calculate the bonus for employees based on their performance. Prompt the user to enter the following information for an employee:\r\n"
			+ "\r\n"
			+ "Employee's monthly salary.\r\n"
			+ "Number of years with the company.\r\n"
			+ "Number of projects completed during the last year.\r\n"
			+ "The company has the following bonus policy:\r\n"
			+ "\r\n"
			+ "If an employee has been with the company for more than 5 years and has completed at least 3 projects in the last year, the bonus is 10% of the annual salary.\r\n"
			+ "If an employee has been with the company for more than 5 years but has completed fewer than 3 projects, the bonus is 5% of the annual salary.\r\n"
			+ "If an employee has been with the company for 1 to 5 years, the bonus is 2% of the annual salary.\r\n"
			+ "If an employee has been with the company for less than 1 year, there is no bonus.\r\n"
			+ "Implement the program to calculate and display the bonus based on the given conditions.");
	System.out.println("Enter Employee's monthly salary");
	Scanner sc=new Scanner(System.in);
	double employeesSalary=sc.nextDouble();
	System.out.println("Number of years with the company.");
	double numberOfYear=sc.nextDouble();
	System.out.println("Number of projects completed during the last year.");
	double numberOfProjectInLastYear=sc.nextDouble();
	double totalsalary=0.0;
	if(numberOfYear==5&&numberOfProjectInLastYear>=3) {
		totalsalary=employeesSalary*10/100;
		totalsalary+=employeesSalary;
		System.out.println("The Total salary of the employee after giving bonse is "+totalsalary);
	}
	else if(numberOfYear==5&&numberOfProjectInLastYear<3) {
		totalsalary=employeesSalary*5/100;
		totalsalary+=employeesSalary;
		System.out.println("The Total salary of the employee after giving bonse is "+totalsalary);
	}
	else if(numberOfYear>=1&&numberOfYear<=5) {
		totalsalary=employeesSalary*2/100;
		totalsalary+=employeesSalary;
		System.out.println("The Total salary of the employee after giving bonse is "+totalsalary);
	}
	else  {
		System.out.println("The Total salary of the employee after giving No bonse is");
	}
	sc.close();
}
}

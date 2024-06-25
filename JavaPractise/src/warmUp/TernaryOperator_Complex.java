package warmUp;

import java.util.Scanner;

public class TernaryOperator_Complex {
public static void main(String[] args) {
	System.out.println("Create a Java program that calculates the grade for a student based on their exam score and attendance. Prompt the user to enter the exam score (out of 100) and the number of classes attended (out of 30).\r\n"
			+ "\r\n"
			+ "The grading system is as follows:\r\n"
			+ "\r\n"
			+ "If the exam score is 80 or above and the attendance is 25 or above, assign grade 'A'.\r\n"
			+ "If the exam score is between 60 and 79 (inclusive) and the attendance is 20 or above, assign grade 'B'.\r\n"
			+ "If the exam score is between 40 and 59 (inclusive) and the attendance is 15 or above, assign grade 'C'.\r\n"
			+ "If the exam score is below 40 or the attendance is below 15, assign grade 'F'.\r\n"
			+ "Implement the program using the ternary operator to determine the grade and then display the grade along with a message indicating whether the student passed or failed.");
	
	System.out.println("Enter The exam score bleow 100 marks");
	Scanner sc=new Scanner(System.in);
	double examScore=sc.nextDouble();
	System.out.println("Enter the attendance below 30 days");
	double attendance=sc.nextDouble();
	String result= (examScore>=80 && attendance>=25)?"grad is A":
		(examScore>=60&&examScore<=79&& attendance>=20)?"grad is B":
		(examScore>=40&&examScore<=59&& attendance>=15)?"grad is c":"grad is f";
	System.out.println(result);
	sc.close();
}
}

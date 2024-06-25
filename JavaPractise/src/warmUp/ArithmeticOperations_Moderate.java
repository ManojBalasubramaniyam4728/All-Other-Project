package warmUp;

public class ArithmeticOperations_Moderate {
	
public static void main(String[] args) {
	System.out.println("Write a Java program that calculates and prints the sum of the first 100 natural numbers. Use a loop to iterate through the numbers and accumulate the sum.");
    int sum =0;
    for (int i = 1; i <=100; i++) {
		sum+=i;
	}
    System.out.println(sum);
 }
}

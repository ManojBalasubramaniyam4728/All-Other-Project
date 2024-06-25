package Test;

import java.util.Random;

public class GeneratedNumbers {
public static void main(String[] args) {
	Random rand = new Random();
	int length=3;
	// Generate  random Numbers with user given inputs
     String GeneratedNumbers="";
	for(int i=1;i<=length;i++) {
		int num = (int) (rand.nextInt(9) + 0);    
		GeneratedNumbers+=num;     
	}
	System.out.println(GeneratedNumbers);
}
}

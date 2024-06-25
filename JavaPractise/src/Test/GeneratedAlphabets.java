package Test;

import java.util.Random;

public class GeneratedAlphabets {
public static void main(String[] args) {
	Random rand = new Random();
	int length=3;
	// Generate  random alphabets with user given inputs
     String GeneratedAlphabets="";
	for(int i=1;i<=length;i++) {
		char alphabet1 = (char) (rand.nextInt(26) + 'A');     
            GeneratedAlphabets+=alphabet1;        
	}
	System.out.println(GeneratedAlphabets);
}
}

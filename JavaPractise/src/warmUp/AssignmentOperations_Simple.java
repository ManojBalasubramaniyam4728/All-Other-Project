package warmUp;

public class AssignmentOperations_Simple {
	public static void main(String[] args) {
		System.out.println("Write a Java program that initializes two variables, x with a value of 10 and y with a value of 5. Swap the values of x and y using assignment operations.");
		
		//First way with using temp
		int x=10;
		int y=5;
		int temp=x;
		System.out.println("Befour swaping: "+x);
		System.out.println("Befour swaping: "+y);
		x=y;
		y=temp;
		System.out.println("After swaping: "+x);
		System.out.println("After swaping: "+y);
		
		
		//secound way with out useing temp
	     y=x+y;
	     x=y-x;
	     y=y-x;
	     System.out.println("After swaping: "+x);
		 System.out.println("After swaping: "+y);
	}

}

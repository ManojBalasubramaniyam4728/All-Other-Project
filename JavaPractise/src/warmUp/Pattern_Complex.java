package warmUp;

public class Pattern_Complex {
	public static void main(String[] args) {
		System.out.println("Write a Java program to print a zigzag pattern of numbers. The pattern should be based on user input for the number of rows and columns. The numbers should start from 1 and increase sequentially.\r\n"
				+ "\r\n"
				+ "Example:\r\n"
				+ "\r\n"
				+ "For input values rows = 4 and columns = 5, the output should be:\r\n"
				+ "\r\n"
				+ "Copy code\r\n"
				+ "1   2   3   4   5\r\n"
				+ "10  9   8   7   6\r\n"
				+ "11  12  13  14  15\r\n"
				+ "20  19  18  17  16");
	System.out.println();
	int a=1;
	int count=0;
	//outer for loop
	for(int i=1;i<=4;i++) {
		
			int l=count+5;
			if (i!=1) {
				 a=count+1;
			}
		
		//inner for loop
		for(int j=1;j<=5;j++) {
			if (i%2==0) {
				System.out.print(l-- + " ");
				count++;
			   }
			else {
				System.out.print(a++ + " ");
				count++;
			}
			}
		System.out.println();
		}
	}
 
	}



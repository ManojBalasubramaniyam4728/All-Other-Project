package Array;

import java.util.Scanner;

public class TwoDArray3 {

public static void main(String[] args) {
	System.out.println("Enter number of Row");
	Scanner scanner=new Scanner(System.in);
	int f=scanner.nextInt();
	System.out.println("Enter number of Coloumn");
	int g=scanner.nextInt();
	int a[][]=new int[f][g];
	System.out.println("Enter The Matric");
	for (int i = 0; i < f; i++) {
		for (int j = 0; j < g; j++) {
		   a[i][j]=scanner.nextInt();
		}
	}
	for (int i = 0; i < f; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
}
/*Here row is fine Bur column is defecutle so you have
to give 0th index length or column value*/
package Assignement;

public class PatternA6 {
public static void main(String[] args) {
	for(int a=1;a<=4;a++) {
		for(int b=4;b>=a;b--) {
			System.out.print(" ");
		}
		for(int c=1;c<=a;c++) {
		System.out.print("*");
			
		}
		for(int b=2;b<=a;b++) {
			System.out.print("*");
		}
	
	
			System.out.println();
	}
}
}



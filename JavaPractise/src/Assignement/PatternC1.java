package Assignement;

public class PatternC1 {
public static void main(String[] args) {
	for(int row=1;row<=4;row++) {
		for(int col=1;col<=row;col++) {
			System.out.print("*");
		}
		System.out.println();
	     }
	for(int row=1;row<=4;row++) {
		for(int col=3;col>=row;col--) {
			System.out.print("*");
	      }
		System.out.println();
	     }
  }
}
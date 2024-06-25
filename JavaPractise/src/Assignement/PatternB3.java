package Assignement;

public class PatternB3 {
public static void main(String[] args) {
	char c='A';
	for(int row=1;row<=4;row++) {
		for(int space=4;space>=row;space--) {
			System.out.print(" ");
		}
		for(int col=1;col<=row;col++) {
			System.out.print(c++);
		}
		System.out.println();
		c='A';
	}
  }
}

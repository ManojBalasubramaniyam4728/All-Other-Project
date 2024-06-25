package Assignement;

public class PatternB4 {
public static void main(String[] args) {
	int a=1;
	char c='A';
	for(int row=1;row<=5;row++) {
		for(int col=1;col<=5;col++) {
			if(row==col) {
				System.out.print("@");
			}
			else if(row<col) {
				System.out.print(c++);
			}
			else {
				System.out.print(a++);
			}
		}
		System.out.println();
		a=1;
		c='A';
	}
  }
}


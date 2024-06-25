package Assignement;

public class PatternB2 {
public static void main(String[] args) {
	int a=1;
	for(int row=1;row<=4;row++) {
		for(int space=4;space>=row;space--){
			System.out.print(" ");
		}
		for(int col=1;col<=row;col++) {
			System.out.print(a++);
		}
		System.out.println();
		a=1;
	}
  }
}

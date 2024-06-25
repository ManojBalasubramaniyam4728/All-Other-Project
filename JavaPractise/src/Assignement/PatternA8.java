package Assignement;

public class PatternA8 {
public static void main(String[] args) {
	for(int row=1;row<=4;row++) {
		for( int space=4;space>=row; space--) {
			System.out.print(" ");
		}
		for (int column=1;column<=row;column++) {
			System.out.print("*");
		}
		System.out.println();
	   }
    }
}

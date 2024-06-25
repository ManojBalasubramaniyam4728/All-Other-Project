package Assignement;

public class PatternB8 {
public static void main(String[] args) {
	int a=1;
	char b='A';
	for(int row=1;row<=4;row++) {
		for(int space=4;space>=row;space--) {
			System.out.print(" ");
		}
		for(int col=1;col<=row;col++) {
			if(row%2==1) {
			System.out.print(b++);
		         }
			else {
				System.out.print(a++);
			}
		}
			for(int col=2;col<=row;col++) {
				if(row%2==1) {
					System.out.print(b++);
				         }
					else {
						System.out.print(a++);
					}
			}
		System.out.println();
		a=1;
		b='A';
     }
  }
}


package Assignement;

public class Pattern7 {
     public static void main(String[] args) {
		int a=1;
		char c='A';
		for(int b=1;b<=4;b++) {
			for(int k=1;k<=4;k++) {
				if(b%2!=0) {
					System.out.print(a++);
				}
				else {
					System.out.print(c++);
				}
			}
			System.out.println();
			a=1;
			c='A';
		}
	}
}


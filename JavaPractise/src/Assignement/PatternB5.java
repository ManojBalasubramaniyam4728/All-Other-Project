package Assignement;

public class PatternB5 {
	public static void main(String[] args) {
		int c=1;
	for(int a=1; a<=5;a++) {
		for(int b=5;b>=a;b--) {
			if(b%2!=0) {
			System.out.print(c++);
	          	}
			else {
				System.out.print("*");
			}
		}
		System.out.println();
	}
  }
}



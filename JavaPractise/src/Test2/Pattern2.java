package Test2;

public class Pattern2 {
	public static void main(String[] args) {
		int c=1;
		char d='A';
	for(int a=1; a<=5;a++) {
		for(int b=5;b>=a;b--) {
			if(b%2!=0) {
				if(a%2==0) {
					System.out.print(d++ +" ");
				}
				else {
					System.out.print(d++ + " ");
				}
			
	          	}
			else {
				System.out.print(c++ +" ");
			}
		}
		System.out.println();
	}
  }
}

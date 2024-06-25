package Assignement;

public class Pattern8 {
    public static void main(String[] args) {
		char a='\u0000';
		int c=64;
		for(int b=1;b<=4;b++) {
			for(int k=1;k<=4;k++) {
				if(b%2!=0) {
					System.out.print((int)+(a+k));
				}
				else {
					System.out.print((char)+(c+k));
				}
			}
			System.out.println();
		}
	}
}

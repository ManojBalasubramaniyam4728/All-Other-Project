package JavaNewPractise;

public class pATTERN2 {
	public static void main(String[] args) {
		int a=1;
		char b='A';
		for(int num=1;num<=4;num++) {
			for(int num1=1;num1<=num;num1++) {
				if(num%2==0) {
				System.out.print(b++);
			}
				else {
					System.out.print(a++);
				}
				
				
			}
			System.out.println();
		}
	}
}

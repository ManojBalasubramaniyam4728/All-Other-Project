package Assignement;

public class M {
public static void main(String[] args) {
	int a=2;
	for(int b=1;b<=4;b++){
		for(int c=1;c<=8;c++) {
			if(b%2==0) {
				System.out.print(a++);
			}
			else {
					a++;
				}
			}
		   System.out.println();
		   a=2;
		}
		
	}
}


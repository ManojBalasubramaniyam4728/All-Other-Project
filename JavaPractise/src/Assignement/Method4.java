package Assignement;

public class Method4 {
public static int factriol(int num) {
	int fact=1;
	int sum=0;
	for( int a=num;a!=0;a=a/10) {
		int ld=a%10;
		if(ld%2!=0) {
			for(int c=ld;c>=1;c--) {
				fact=fact*c;
			
			}
		}
			else {
				fact=0;
			}
		sum=sum+fact;
		fact=1;
	     }
	return sum;
}
public static void main(String[] args) {
	System.out.println(factriol(12345));
   }
}

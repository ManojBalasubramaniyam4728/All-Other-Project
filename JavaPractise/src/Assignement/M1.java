package Assignement;

public class M1 {
public static void main(String[] args) {
	int num=12345;
	int sum=0;
	for(num=12345;num!=0;num=num/10) {
		int ld=num%10;
		if(ld%2==0) {
			sum=sum+ld;
		}
		
	}
	System.out.println(sum);
}
}

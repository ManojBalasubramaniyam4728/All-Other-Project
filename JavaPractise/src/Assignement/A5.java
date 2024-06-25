package Assignement;

public class A5 {
public static void main(String[] args) {
	int num=12345;
	int sum=0;
	while(num>0) {
		int ld=num%10;
		if(ld%2!=0) {
			sum=sum+ld;
		    }
		num=num/10;
       	}
	System.out.println(sum);
			
		}
	}
		



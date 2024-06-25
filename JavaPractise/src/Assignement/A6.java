package Assignement;

public class A6 {
public static void main(String[] args) {
	int num=12345;
	int fact=1;
	int sum=0;
	while(num!=0) {
	 int ld=num%10;
	 if(ld%2!=0) {
		 while(ld>=1) {
			 fact=fact*ld;
			 ld--;
	 	        }
	           }
	       else {
		        fact=0;
          	 }
           sum=sum+fact;
	       fact=1;
	       num=num/10;
             	}
	       System.out.println(sum);
	        }
           }



package Assignement;

public class Method3 {
public static int factriol(int num) {
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
	return sum ;

	}
	public static void main(String[] args) {
	System.out.println(factriol(12345));
	}
}


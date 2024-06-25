package Assignement;

public class Strong {
public static void main(String[] args) {
	int a=145;
	int sum=0;
	int fact=1;
	int temp=a;
	while(a>0) {
		int ld=a%10;
		for(int c=1;c<=ld;c++) {
			fact=fact*c;
		}
		sum=sum+fact;
		fact=1;
		a=a/10;
	}
	if(sum==temp) {
		System.out.println("it is strong number"+sum);
	}
	else {
		System.out.println("it is not astrong number"+sum);
	}
 }
}



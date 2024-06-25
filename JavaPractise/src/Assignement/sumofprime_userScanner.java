package Assignement;
import java.util.Scanner;

public class sumofprime_userScanner {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	int sum=0;

for(int i=2;i<=num;i++) {
	int a=i;
boolean key=true;
	for(int b=2;b<a;b++) {
		if(a%b==0) {
		key=false;
		break;
	}
	}
	
		if(key==true) {
			sum=sum+a;
    }
	}
System.out.println("sum of prime is :"+sum);
}

}
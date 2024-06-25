package Test2;

import java.util.Scanner;

public class Strong {
	public static String StrongNo(int a) {
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
			return "it is strong number"+sum;
		}
		else {
			return "it is not astrong number"+sum;
		}
	 }
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number");
		 int a=sc.nextInt();
		 System.out.println(StrongNo(a));
		}
	}

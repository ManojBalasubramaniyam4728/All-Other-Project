package JavaNewPractise;

import java.util.Scanner;

public class Scanner1 {
	public static int man(int start,int end) {
		int sum=0;
		for(int i=start;i<=end;i++) {
			if(i%2!=0) {
				sum=sum+i;
			}
          }
		return sum;
}
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter one number");
	int start=sc.nextInt();
	System.out.println("enter second number ");
	int end=sc.nextInt();
	Scanner1 s1=new Scanner1();
	System.out.println(s1.man(start, end));
         }
   }


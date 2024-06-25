package Assignement;

import java.util.Scanner;

public class Scanner1 {
		public static int man(int a) {
			int fact=1;
			while(a>=1) {
				fact=fact*a;
				a--;
				}
			return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter one number");
		int a=sc.nextInt();
		Scanner1 s1=new Scanner1();//object creating
		System.out.println(s1.man(a));
	         }
	   }



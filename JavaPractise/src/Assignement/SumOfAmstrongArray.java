package Assignement;

import java.util.Scanner;

public class SumOfAmstrongArray {
public static void main(String[] args) {
	int count=0;
	int sum=0;
	int sum1=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("enter the elements");
	for(int b=0;b<a.length;b++) {
		a[b]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		int c=a[i];
		int temp=c;
		int temp1=c;
		while(temp>0) {
		    count++;
		    temp=temp/10;
		}
		while(temp1>0) {
			int rem=temp1%10;
			sum=sum+((int)Math.pow(rem, count));
			temp1=temp1/10;
		}
		if(sum==c) {
			sum1=sum1+c;
		}
		
		sum=0;
		count=0;
	}
	System.out.println("The sum of amstrong from array is;"+sum1);
	}
}
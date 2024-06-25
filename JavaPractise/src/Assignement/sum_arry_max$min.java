package Assignement;

import java.util.Scanner;

public class sum_arry_max$min{
	public static int MaxAndMin(int a[]) {
		int min=0;
		int max=0;
		int sum=0;
		int com=0;
		for(int i=0;i<a.length;i++) {
			for(int j=1+i;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		max=max+a[a.length-1];
		min=min+a[0];
		com=min+max;
		sum=sum+com;
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	     System.out.println(MaxAndMin(a));
		}
		
	
}
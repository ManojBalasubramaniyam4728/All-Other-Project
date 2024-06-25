package Assignement;

import java.util.Scanner;

public class Sum_array_3max$2min {
	public static int SumMaxMin(int a[]){
		int sum=0;
		int thirdmax=0;
		int secondmin=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		thirdmax=thirdmax+a[a.length-3];
		secondmin=secondmin+a[1];
		sum=thirdmax+secondmin;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("the sum of third maximum and second minium is;"+" "+SumMaxMin(a));
	}
}


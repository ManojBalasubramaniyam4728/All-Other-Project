package Test3;

import java.util.Scanner;

public class MinAndMaxarray {
		public static int SumMaxMin(int a[]){
			int sum=0;
			int max=0;
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
			max=max+a[a.length-1];
			secondmin=secondmin+a[1];
			sum=max+secondmin;
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
			System.out.println("the sum of  maximum and second minium is;"+" "+SumMaxMin(a));
		}
	}



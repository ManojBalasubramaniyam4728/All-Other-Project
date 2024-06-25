package Assignement;

import java.util.Scanner;

public class Array4 {
public static int min(int a[]) {
	int min=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
	return min;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	 int size=sc.nextInt();
	 int a[]=new int[size];
	 System.out.println("enter the elements");
	 for(int j=0;j<a.length;j++) {
		 a[j]=sc.nextInt();
	 }
	 Array4 f1=new Array4();
	 System.out.println("the minium element is:-");
	 System.out.println(f1.min(a));
  }
}

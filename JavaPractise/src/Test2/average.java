package Test2;

import java.util.Scanner;

public class average {
	public static void main(String[] args) {
		int temp=0;
		int average=0;
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter the size");
		  int size=sc.nextInt();
		  int a[]=new int[size];
		  System.out.println("enter the elements");
		  for(int j=0;j<a.length;j++) {
			  a[j]=sc.nextInt();
		  }
		  for(int i=0;i<a.length;i++) {
			   temp=temp+a[i];
		  }
		  average=temp/size;
		  System.out.println("the average of an array is;-"+average);
		
	}

}

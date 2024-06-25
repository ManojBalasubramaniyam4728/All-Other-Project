package Test2;

import java.util.Scanner;

       public class Sumofarray {
		public static int sum(int a[]) {
			int add=0;
			for(int i=0;i<a.length;i++) {
				add=add+a[i];
			}
			return add;
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
	  Sumofarray f1=new Sumofarray();
	  System.out.print("the sum of the elements are:-");
	  System.out.println(f1.sum(a));
	    }
	  }
    

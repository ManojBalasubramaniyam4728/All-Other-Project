package Test2;

import java.util.Scanner;

public class MaxArrayreturn {
	public static int max(int a[]) {
		int max=0;
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
		return max;
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
  System.out.print("the max  elements is:-");
  System.out.println(max(a));
    }
}
 



package Assignement;
 import java.util.Scanner;

public class Array3 {
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
  Array3 f1=new Array3();
  System.out.println("the sum of the elements are:-");
  System.out.println(f1.sum(a));
}
}

    

package Assignement;
 
import java.util.Scanner;

public class Array5 {
		public static int add(int a[]) {
			int sum=0;
			
			for(int i=0;i<a.length;i++) {
				while(a[i]!=0) {
					int ld=a[i]%10;
					sum=sum+ld;
				    a[i]=a[i]/10;
					
				}
			
			}
			return sum;
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
	  System.out.println("the sum of the elements are:-");
	  System.out.println(add(a));
	}
	}


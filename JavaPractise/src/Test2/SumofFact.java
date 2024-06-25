package Test2;
  
import java.util.Scanner;

public class SumofFact{
	public static long sum(int a) {
		
		int add=0;
		int fact=1;
		for(int i=a;i>=1;i--) {
			for(int j=a;j>=1;j--) {
				fact=fact*j;
				
			}
			add=add+fact;
			fact=1;
		}
		
           	return add;
	
	}
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in) ;
			System.out.println("enter the range");
				int range=sc.nextInt();
			System.out.println(sum(range));
		}
	}


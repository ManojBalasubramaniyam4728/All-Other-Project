package Test2;

import java.util.Scanner;

public class Sumofevenodd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
			System.out.println("enter trhe size");
			int size=sc.nextInt();
			int a[]=new int [size];
			System.out.println("enter the elements");
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
			}
                int evensum=0;
				int oddsum=0;
				for(int i=0;i<a.length;i++) {
					if(a[i]%2==0) {
						evensum=evensum+a[i];
						
						}
					else {
						oddsum=oddsum+a[i];
					}
				}
				System.out.println("sum of even number is:-"+evensum);
				System.out.println("sum of odd number is:-"+oddsum);
				      }
                  }

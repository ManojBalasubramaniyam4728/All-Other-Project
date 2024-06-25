package Assignement;

import java.util.Scanner;

public class Sorrted_array {
public int[] sorrt(int b[]) {
	for(int i=0;i<b.length;i++) {
		for(int j=1+i;j<b.length;j++) {
			if(b[i]<b[j]) {
				int temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
		}
	}
			return b;
		}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size =sc.nextInt();
	int a[]=new int[size];
	System.out.println("enter the elementes");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	 Sorrted_array s1=new  Sorrted_array ();
	int result[]=s1.sorrt(a);
for(int i=0;i<result.length;i++) {
	System.out.print(result[i]);
            }
	}
 }



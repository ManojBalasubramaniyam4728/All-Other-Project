package Assignement; 

import java.util.Scanner;

public class sumofprimeArray {

public static void main(String[] args) {
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	int a[]=new int [size];
	System.out.println("enter the elementes");
	for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
	      }
	for(int b=0;b<a.length;b++) {
		boolean key=true;
		if(a[b]==1) {
			continue;
		}
		else {
	for(int c=2;c<a[b];c++) {
		if(a[b]%c==0) {
			key=false;
			break;
		     }
	       }
		}
	if (key==true) {
		sum=sum+a[b];
	  }
	}
	System.out.println("sum of prime number in array ia :"+sum);
}
}

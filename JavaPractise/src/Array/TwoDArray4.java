package Array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class TwoDArray4 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Row");
		int a=sc.nextInt();
		System.out.println("Enter the Number of Column");
		int b=sc.nextInt();
		int c[][]=new int[a][b];
		System.out.println("Enter the desired Matrix");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < b; j++) {
				c[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j <b; j++) {
				System.out.print(c[i][j]+"");
			}
			System.out.println();
		}
		
		int l[][]=new int[a][b];
		System.out.println("Enter second desired Matrix");
		for (int i = 0; i < l.length; i++) {
			for (int j = 0; j < b; j++) {
				l[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for (int i = 0; i < l.length; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(l[i][j]+"");
			}
			System.out.println();
		}
		HashMap<Integer, Integer> result= new LinkedHashMap<>();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < b; j++) {
				if(j%2!=0) {
				result.put(c[i][j], l[i][j]);
				}
			}
		}
		System.out.println(result);
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j <b; j++) {
				if(j%2!=0) {
					sum=sum+c[i][j]+l[i][j];
			     }
	         }
		}
		System.out.println(sum);
	}
}

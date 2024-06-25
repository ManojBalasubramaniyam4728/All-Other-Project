package JavaNewPractise;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("year of service");
		double service=sc.nextDouble();
		System.out.println("enter salary");
		Double sal=sc.nextDouble();
		double netsal=1;
		if(service>5) {
			netsal=sal+sal*0.05;
			System.out.println(netsal);
		}
		else {
			System.out.println("no bonus");
		}
		
	}

}

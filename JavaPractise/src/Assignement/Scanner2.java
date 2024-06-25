package Assignement;

import java.util.Scanner;

public class Scanner2 {
	public static String alpha(char a) {
		if((a>='A' && a<='Z')||(a>='a' && a<='z')){
			if(a>='A' && a<='Z') {
				if(a=='A'||a=='E'||a=='I'||a=='O' ||a=='U') {
					return "it is upper case vowel";
				}
				else {
					return "it is uperr case Consonent";
				}
			}
			else {
				if(a=='a'|| a=='e'||a=='i'||a=='o' ||a=='u') { 
					return("it is lower case vowel");
				}
				else {
					return "it is lower case Consonent";
				}
			}
		}
		else if(a>='1'||a<='9') {
			return "it is number";
		}
		else {
			return "it is spacial char";
		   }
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a character");
		char a=sc.next().charAt(0);
		Scanner2 m1=new Scanner2();
		System.out.println(m1.alpha(a));
	}
}
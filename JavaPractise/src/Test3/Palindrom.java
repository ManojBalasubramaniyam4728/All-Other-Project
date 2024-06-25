package Test3;

public class Palindrom {
	public static void main(String[] args) {
		int a=143;
		int sum=0;
		int temp=a;
		while(a>0) {
			int ld=a%10;
			sum=(sum*10)+ld;
			a=a/10;
		}
		if(sum==temp) {
			System.out.println(temp+" "+"it is a palindrom");
		}
		else {
			System.out.println(temp+" "+"it is not a plindrom");
		}
	 }
	}

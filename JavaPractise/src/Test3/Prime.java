package Test3;

public class Prime {
	public static void main(String[] args) {
		int a=3;
		boolean key=true;
		for(int b=2;b<a;b++) {
			if(a%b==0) {
			key=false;
			break;
		}
		}
			if(key==true) {
			System.out.println(a+" "+"it is prime number");
		}
		else {
			System.out.println(a+" "+"it is not a prime number");
		    }
		}
	}

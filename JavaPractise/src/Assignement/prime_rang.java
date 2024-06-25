package Assignement;

public class prime_rang {

public static void main(String[] args) {
	for(int i=2;i<=50;i++) {
	int a=i;
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

}

package Assignement;

public class A9 {
public static void main(String[] args) {
	int a=1;
	while(a<=20) {
		if(a%3==0 || a%5==0) {
			a++;
			continue;
		   }
		System.out.println(a);
		a++;
	}
  }
}

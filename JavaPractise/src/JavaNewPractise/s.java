package JavaNewPractise;

public class s {
public int num(int d) {
	int fact=1;
	for(int a=1;a<=d;a++) {
		fact=fact*a;
	}
		return fact;
	}
	public static void main(String[] args) {
		s a1=new s();
		System.out.println(a1.num(5));
	}
}

package Package2;

import Package1.ProtectedA;

public class ProtectedB extends ProtectedA{
	protected int sum=4;
	public static void main(String[] args) {
		ProtectedB b1=new ProtectedB ();
		System.out.println(b1.a);
		b1.man();
		System.out.println(b1.sum);

	}

}

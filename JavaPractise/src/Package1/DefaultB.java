package Package1;

public class DefaultB extends  DefaultA{
public static void main(String[] args) {
	DefaultB b1=new DefaultB();
	System.out.println(b1.a);
	System.out.println(b1.b);
	DefaultA a1=new DefaultA();
	System.out.println(a1.a);
	System.out.println(a1.b);
}
}

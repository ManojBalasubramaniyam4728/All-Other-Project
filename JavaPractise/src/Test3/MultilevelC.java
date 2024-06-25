package Test3;

public class MultilevelC extends MultilevelB{
	int e=50;
	int f=60;
public static void main(String[] args) {
	MultilevelC c1=new MultilevelC();
	System.out.println(c1.a);
	System.out.println(c1.b);
	System.out.println(c1.c);
	System.out.println(c1.d);
	System.out.println(c1.e);
	System.out.println(c1.f);
	MultilevelB c2=new MultilevelB();
	System.out.println(c2.a);
	System.out.println(c2.b);
	System.out.println(c2.c);
	System.out.println(c2.d);
	MultilevelA c3=new MultilevelA();
	System.out.println(c2.a);
	System.out.println(c3.b);
     }
}

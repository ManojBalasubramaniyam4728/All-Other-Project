package Interface1;

public class MultilevelC extends MultilevelB{
public void m() {
	System.out.println("hello Multilevel-2");
}
public void m1() {
	System.out.println("hello Multilevel-3");
}
public static void main(String[] args) {
	MultilevelA a1=new MultilevelC();
	a1.m();
	MultilevelB b1=new MultilevelC();
	b1.m();
	b1.m1();
}
}

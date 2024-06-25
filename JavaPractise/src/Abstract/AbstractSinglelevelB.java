package Abstract;

public class AbstractSinglelevelB extends AbstractSinglelevelA{
void man1() {
	System.out.println("Method2");
}
public static void main(String[] args) {
	AbstractSinglelevelA a1=new AbstractSinglelevelB();
	a1.man1();
	a1.man();
}
}

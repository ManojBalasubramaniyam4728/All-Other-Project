package Abstract;

public class AbstractMultilevelC extends AbstractMultilevelB{
void man2() {
	System.out.println("method3");
}
public static void main(String[] args) {
	AbstractMultilevelA a1=new AbstractMultilevelC();
	a1.man();
	a1.man1();
	AbstractMultilevelB b1=new AbstractMultilevelC();
	b1.man();
	b1.man1();
	b1.man2();
}
}

package Abstract;

public class AbstracthHirchicalC extends AbstracthHirchicalA {
	void man1() {
		System.out.println("method3");
	}
	public static void main(String[] args) {
		AbstracthHirchicalA a1=new AbstracthHirchicalC();
		a1.man();
		a1.man1();
		
	}
	}

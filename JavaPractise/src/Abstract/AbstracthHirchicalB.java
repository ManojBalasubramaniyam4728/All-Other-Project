package Abstract;

public class AbstracthHirchicalB extends AbstracthHirchicalA{
	void man1(){
		System.out.println("method 2");
	}

	public static void main(String[] args) {
		AbstracthHirchicalA a1=new AbstracthHirchicalB();
		a1.man();
		a1.man1();
	}

}


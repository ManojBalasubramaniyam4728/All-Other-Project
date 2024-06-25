package Interface1;

public class MultipleC implements MultipleA,MultipleB{
	public void son() {
		System.out.println("Hello Multiple-1");
	}
	public void father() {
		System.out.println("hello Multiple-2");
	}
	public static void main(String[] args) {
		MultipleA a1=new MultipleC();
		a1.son();
		MultipleB b1=new MultipleC();
		b1.father();
	}

}

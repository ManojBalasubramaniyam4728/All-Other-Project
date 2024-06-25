package Interface1;

public class SinglelevelA implements Singlelevel {
	public void m() {
		System.out.println("hello singlelevel");
	}
	public static void main(String[] args) {
		Singlelevel a1= new SinglelevelA();
		a1.m();
	}
	

}

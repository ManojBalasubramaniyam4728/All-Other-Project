package Interface1;

public class HirerachicalB implements HirerachicalA{
public void son() {
	System.out.println("Hello hirerchical-1");
}
public static void main(String[] args) {
	HirerachicalA a1=new HirerachicalB();
	a1.son();
}
}

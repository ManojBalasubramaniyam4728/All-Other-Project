package Interface1;

public class HirerachicalC implements HirerachicalA{
	public void son() {
		System.out.println("Hello Hirerachical-2");
}
public static void main(String[] args) {
	HirerachicalA b1=new HirerachicalC();
	b1.son();
}
}
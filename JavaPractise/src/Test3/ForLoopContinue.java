package Test3;

public class ForLoopContinue {
public static void main(String[] args) {
	for(int a=10;a<=100;a++) {
		if(a%3==0) {
			continue;
		}
		System.out.print(a +",");
	}
}
}




package Test;

public class Ternary {
public static void main(String[] args) {
	int num1=10;
	int num2=5;
	int num3=15;
	int a=((num1<num2)?((num1<num3)?num1:num3):(num2<num3)?num2:num3);
	System.out.println(a);
	
}
}

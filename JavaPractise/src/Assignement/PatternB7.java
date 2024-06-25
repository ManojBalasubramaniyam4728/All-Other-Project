package Assignement;

public class PatternB7 {
public static void main(String[] args) {
for(int row=1;row<=4;row++) {
	for(int space=1;space<=row;space++) {
		System.out.print(" ");
	}
	for(int column=4;column>=row;column--) {
		System.out.print("*");
	}
    for(int column=3;column>=row;column--) {
	System.out.print("*");
}
	System.out.println();
}
}
}
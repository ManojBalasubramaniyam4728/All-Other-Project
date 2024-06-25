package Assignement;

public class PatternA3 {
	public static void main(String[] args) {
	int i=64;
	for(int a=1;a<=5; a++) {
		for(int b=1;b<=5;b++) {
			if(a==1&&b==1||a==2&&b==2||a==3&&b==3||a==4&&b==4||a==5&&b==5) {
				System.out.print((char)+(i)+" ");
			}
			else {
				System.out.print("_"+" ");
			}
		}
			System.out.println();
		   }
	    }
    }





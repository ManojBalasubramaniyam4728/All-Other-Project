
public class Pattern3 {
	public static void main(String[] args) {
		for(int row=1;row<=4;row++) {
			for(int col=4;col>row;col--) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

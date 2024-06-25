package Test;

public class Pattern2 {
	public static void main(String[] args) {
		int a=1;
		char c='A';
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=row;col++) {
				if(row%2!=0) {
				System.out.print(a++ +" ");
			       }
				else {
					System.out.print(c++ +" ");
				}
		     }
			System.out.println();
			a=1;
			c='A';		
		}
	}

}

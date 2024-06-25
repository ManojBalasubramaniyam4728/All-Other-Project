package Test;

import java.util.Iterator;

public class Pattern3 {
	public static void main(String[] args) {
		for(int row=1;row<=4;row++) {
			for(int col=4;col>=row;col--) {
				System.out.print("*" +" ");
		     }
			System.out.println();
					
		}
		
	//***************************************************************************
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*" +" ");
		     }
			System.out.println();
					
		}
		
//***************************************************************************
		        int n = 0; 
		        for (int i = 1; i <= 4; i++) {
		        	int c=i+n;
		        	int d=c;
		        	n=c;
		            for (int j = 1; j <= i; j++) {
		            System.out.print(d);
		         d --;
		           
		        }
		            System.out.println();
		        }
 //***************************************************************************
		        int f = 64; 
		        for (int i = 1; i <= 4; i++) {
		        	char c=(char) (f+i);
		        	char e =c;
		        	f=c;
		            for (int j = 1; j <= i; j++) {
		            System.out.print(c);
		              c--;
		           
		        }
		            System.out.println();
		        }
		

	//***************************************************************************
		
		for(int row=1;row<=4;row++) {
			for(int col=1;col<row;col++) {
				System.out.print(" " +" ");
		     }
			for (int col=4;col>=row;col--) {
				System.out.print("*"+" ");
	            }
			System.out.println();
					
		}
		
	//***************************************************************************
		for(int row=1;row<=4;row++) {
			for(int col=4;col>row;col--) {
				System.out.print(" " +" ");
		     }
			for (int col=1;col<=row;col++) {
				System.out.print("*"+" ");
	            }
			System.out.println();
					
		}
		
	}

}



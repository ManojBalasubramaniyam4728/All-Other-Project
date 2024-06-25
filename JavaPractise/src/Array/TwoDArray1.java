package Array;

import java.util.HashMap;

public class TwoDArray1 {

	public static void main(String[] args) {
		int[][] a = { { 1, 2,  3,   4 },
				      { 5, 6,  7,   8 }, 
				      { 9, 10, 11, 12 },
				      { 13, 14, 15, 16 } };
		int[][] b = { { 1, 2,  3,   4 },
			        {   5,  6, 7,   8 }, 
			        {   9, 10, 11, 12 },
			        {  13, 14, 15, 16 } };
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			for (int j = 1; j <= a.length / 2; j++) {
				hm.put(a[i][k++], a[i][k++]);
			}

		}

		System.out.println(hm);
		
		int[][] c=new int[a.length][a.length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
			
		}
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
		
		
	}
	
}


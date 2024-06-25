package Array;

import java.util.ArrayList;

public class TwoDArray {

	public static void main(String[] args) {
		// create a 2d array 5 * 5
		// sum of the elements in odd position from each row and sum of sums of every
		// row

		// 4*4
		// make a 1 col as key and second as value

		int[][] a = { { 1, 2, 3, 4 }, { 8, 5, 6, 7 }, { 1, 2, 3, 4 }, { 6, 8, 3, 7 } };

		// displaying the array
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		// sum of the element in odd position
		int totalSum = 0;
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a.length; j++) {
				if (j % 2 != 0)
					sum = sum + a[i][j];
			}
			al.add(sum);
		}
		System.out.println(al);
		for (Integer i : al) {
			totalSum = totalSum + i;
		}
		System.out.println(totalSum);

	}

}

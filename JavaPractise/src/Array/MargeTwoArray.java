package Array;

import java.util.Arrays;

public class MargeTwoArray {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int c=a.length+b.length;
		int  d[]=new int[c];
		System.arraycopy(a, 0, d, 0, a.length);
		System.arraycopy(b, 0, d, a.length, b.length);
		System.out.println(Arrays.toString(d));
	}

}

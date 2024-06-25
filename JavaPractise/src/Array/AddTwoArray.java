package Array;

public class AddTwoArray {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {10,5,6};
		String s1="";
		String s2="";
		for (int i = 0; i < b.length; i++) {
			s1=s1+a[i];
			s2=s2+b[i];
		}
		System.out.println(Integer.valueOf(s1)+Integer.valueOf(s2));
	}

}

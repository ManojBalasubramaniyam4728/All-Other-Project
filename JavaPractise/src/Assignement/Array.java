package Assignement;

public class Array {
public static void main(String[] args) {
	double a[]= {1.1,2.3,4.7,3.9,5.6};
	 double sum=0;
	for(int i=0;i<a.length;i++ ) {
		sum=sum+a[i];
	}
	System.out.println(sum);
}
}

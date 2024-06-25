package Test;

public class evendigit {
	public static void main(String[] args) {
		int num=12345;
		int sum=0;
		for(int a=num;a!=0;a=a/10) {
			int ld=a%10;
			if(a%2==0) {
				sum=sum+ld;
			}
		}
		System.out.println(sum);
	}

}

package Test3;

public class Amstrong {
	public static void main(String[] args) {
		int a=153;
		int count=0;
		int sum=0;
		int temp=a;
		int temp1=a;
		while(temp>0) {
		    count++;
		    temp=temp/10;
		}
		while(temp1>0) {
			int rem=temp1%10;
			sum=sum+((int)Math.pow(rem, count));
			temp1=temp1/10;
		}
		System.out.println(sum);
		if(sum==a) {
			System.out.println("it is Arm strong");
			
		}
		else {
			System.out.println("it is not Arm strong");
		}
	}
	}




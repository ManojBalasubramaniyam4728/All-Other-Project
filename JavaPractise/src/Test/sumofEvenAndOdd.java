package Test;

public class sumofEvenAndOdd {
	public static void main(String[] args) {
		int evensum=0;
		int oddsum=0;
     for(int a=5;a<=15;a++) {
    	 if(a%2==0) {
    		 evensum=evensum+a;
    	 }
    	 else {
    		 oddsum=oddsum+a;
    	 }
     }
     System.out.println("sum of even number is:"+evensum);
     System.out.println("sum of odd number is:"+oddsum);
	}
}

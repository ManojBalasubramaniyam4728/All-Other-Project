package Assignement;

public class A4 {
	public static void main(String[] args) {
		int a=1;
		int evensum=0;
		int oddsum=0;
   while(a<=20) {
	   if(a%2==0) {
		  evensum =evensum+a;
	          }
	    else {
		   oddsum =oddsum+a;
	          }
	          a++;
          }         
    System.out.println( "sum of the even is " + evensum);
    System.out.println( "sum of the odd is " + oddsum);
          }
	  }


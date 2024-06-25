package Assignement;

public class B3 {
public static void main(String[] args) {
	int a=1;
	int evensum=0;
	int oddsum=0;
	for(a=1;a<=20;a++) {
	   if(a%2==0) {
	      evensum=evensum+a;
	   }
	   else {
		   oddsum=oddsum+a;
	       }
	     }
	System.out.println(evensum);
	System.out.println(oddsum);
	   }
	 }

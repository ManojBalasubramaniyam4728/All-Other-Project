package warmUp;

public class Test {
public static void pat1() {
	/* * * * *          n=4 and m=4 but here n is full
	     * * *           hear n-1 nothing but n-1 =3 here i want to print * rets Space
	       * *           hear n-1 nothing but n-1 =2 here i want to print *
	         *           hear n-1 nothing but n-1 =2* here i want to print * rets Space */
	
int n=4;
//outer for loop
	for(int i=4;i>=1;i--) {
		//inner for loop for printing Space
		 for(int j=1;j<=n-i;j++) {
			 System.out.print(" "+" ");
		 }
		//inner for loop for printing *
		 for(int j=1;j<=i; j++) {
			 System.out.print("*"+" ");
		 }
		 System.out.println();
	  }
	}

public static void pat2() {
	/*       *     n=4 and m=4 but here n is full
	       * *           hear n-1 nothing but n-1 =3 here i want to print Space rets *
	     * * *           hear n-1 nothing but n-1 =2 here i want to print Space
	   * * * *           hear n-1 nothing but n-1 =2* here i want to print Space rets * */
int n=4;
//outer for loop
for(int i=1;i<=n;i++) {
	//inner for loop for printing Space
	for(int j=1;j<=n-i;j++) {
		System.out.print(" "+" ");
	}
	//inner for loop for printing *
	for(int j=1;j<=i;j++) {
		System.out.print("*"+" ");
	}
   System.out.println();
  }
 }
public static void pat3() {
	/*  *     n=4 and m=4 but here n is full
	    * *           
	    * * *           
	    * * * *           */
int n=4;
//outer for loop
for(int i=1;i<=n;i++) {
	//inner for loop
	for(int j=1;j<=i;j++) {
		System.out.print("*"+" ");
	}
   System.out.println();
  }
 }

public static void pat4() {
	/*  * * * * n=4 and m=4 but here n is full
	    * * *   
	    * *           
	    *           */
int n=4;
//outer for loop
for(int i=n;i>=1;i--) {
	//inner for loop
	for(int j=1;j<=i;j++) {
		System.out.print("*"+" ");
	}
   System.out.println();
  }
 }

public static void pat5() {
	/*      *
	      * * *
	    * * * * *
	  * * * * * * *     
	            */
int n=4;
//outer for loop
for(int i=1;i<=n;i++) {
	//inner for loop for printing Space
		for(int j=1;j<=n-i;j++) {
			System.out.print(" "+" ");
		}
	//inner for loop for printing *
		for(int j=1;j<=i;j++) {
			System.out.print("*"+" ");
		}
  
				for(int j=1;j<=i-1;j++) {
					System.out.print("*"+" ");
				}
				 System.out.println();	
   }
}

public static void main(String[] args) {
	pat5();
	
}
}

package warmUp;

import java.util.Scanner;

public class ifCondition_Complex {
public static void main(String[] args) {
	/*Calculating formula for Simple intrest
	    Formula: Simple Interest (SI) = Principal (P) x Rate (R) x Time (T) / 100
	 */
	System.out.println("Create a Java program that simulates a tax calculator. Prompt the user to enter their annual income. Implement a tax calculation based on the following progressive tax rates:\r\n"
			+ "\r\n"
			+ "0-50,000: 5% tax\r\n"
			+ "50,001-100,000: 10% tax\r\n"
			+ "Above 100,000: 15% tax\r\n"
			+ "Display the calculated tax amount.");
	System.out.println("Enter the Aomunt");
      Scanner sc =new Scanner(System.in);
      double intrestAmount = 0.0;
      int amount=sc.nextInt();
      if(amount>=0&&amount<=50000){
    	  intrestAmount=amount*5*1;
    	  intrestAmount=intrestAmount/100;
    	  System.out.println("The rate of intrest for "+amount+" Is "+intrestAmount);
	}
      if(amount>=50001&&amount<=100000){
    	  intrestAmount=amount*10*1;
    	  intrestAmount/=100;
    	  System.out.println("The rate of intrest for "+amount+" Is "+intrestAmount);
	}
      if(amount>100000){
    	  intrestAmount=amount*15*1;
    	  intrestAmount/=100;
    	  System.out.println("The rate of intrest for "+amount+" Is "+intrestAmount);
	}
      
      sc.close();
}
}

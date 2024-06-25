package Test;

import java.awt.Point;
import java.util.ArrayList;

public class NumberExtractor {
	private static boolean isNumber(String value) {
        try {
           
            Double.parseDouble(value);
            return true; 
        } catch (java.lang.NumberFormatException e) {
            return false; 
        }
    }

	    public static void main(String[] args) {
	    	 String input = "[76,780][1004,848]";
   
	    	ArrayList<Integer> list=new ArrayList<Integer>();
	    	
	    	  char[]a=input.toCharArray();
	          String s="";
	    	  for (int i = 0; i < a.length; i++) {
				
	    		   if(Character.isDigit(a[i])) {
	    			   s=s+a[i];
	    			   continue;
	    		   }
	    		   else {   		   
	    			   if(isNumber(s)) {
	    				   list.add(Integer.parseInt(s));
	    			   }
	    			  
	    			   s="";
	    			   
	    		   }
			}
	    	
	    	  
	    	  int x=(list.get(0)+list.get(2))/2;
	          int y=(list.get(1)+list.get(3))/2;	
	          System.out.println(x+"    "+y);
	          
	         
	    			  
		}
	    
	    
	      
	       
	    }
	







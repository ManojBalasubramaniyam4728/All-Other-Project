package Selenium_For_PE;



public class Concepts_Of_String {
	public static void Substring() {
		String s="Ticket ASC-0286 - Re-assigned to You in Default-james";
	    String value=s.substring(7, 15);
	    System.out.println(value);
	}
	public static void TOcharArray() {
		String s="Ticket ASC-0240 has been created";
	    char ch[]=s.toCharArray();
	    for(int i=0;i<ch.length;i++) {
	    	System.out.print(ch[i]);
	          }
	       }
	public static void ToUpperCase() {
	    	String s="Ticket ASC-0240 has been created";
	    	String value=s.toUpperCase();
	    	System.out.println(value);
	          }
	public static void ToLowerCase() {
	    	String s="Ticket ASC-0240 has been created";
	    	String value=s.toLowerCase();
	    	System.out.println(value);
	         }
	public static void erualignorecase() {
	    	String s="Ticket ASC-0240 has been created";
	    	boolean value=s.equalsIgnoreCase("TICKET ASC-0240 has been created");
	    	System.out.println(value);
	    }
	public static void Contains() {
	    	String s="Ticket ASC-0240 has been created";
	    	String s1="Ticket ASC-0240 has BEEN created";
	    	boolean result=s.contains(s1);
	    	System.out.println(result);
	    }
	public static void ReplaceAll() {
		   String s="Ticket ASC-0240 has been created";
		   String result=s.replaceAll("Ticket", "hello");
		   System.out.println(result);
		   }
	public static void Trime() {
		String s="Ticket_ASC-0240_has_been_created";
		String result=s.trim();
		System.out.println(result);
	}
	public static void StartingWith() {
		String s="Ticket_ASC-0240_has_been_created";
		boolean results=s.startsWith("T");
		System.out.println(results);
	    }
     public static void EndsWtih() {
	   String s="Ticket_ASC-0240_has_been_created";
		boolean results=s.startsWith("d");
		System.out.println(results);
        }
     public static void Index() {
    	 String s="Ticket_ASC-0240_has_been_created";
 		  int results=s.indexOf('A');
 		System.out.println(results);
     }
     public static void main(String[] args) {
    	 Concepts_Of_String a1=new Concepts_Of_String();
    	     a1.Substring();
    	     a1.TOcharArray();
    	     a1.ToUpperCase();
    	     a1.ToLowerCase();
    	     a1.erualignorecase();
    	     a1.Contains();
    	     a1.ReplaceAll();
    	     a1.Trime();
    	     a1.StartingWith();
    	     a1.EndsWtih();
    	     a1.Index();
    	     
		
	}
				
		
	}
   


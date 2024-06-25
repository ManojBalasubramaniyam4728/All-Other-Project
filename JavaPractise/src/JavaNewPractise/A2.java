package JavaNewPractise;

public class A2 {
public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);//Add of two numbers
	
	
	String d="Testyantra Company added a \"Public Note\" on April 26th 2023, 9:30 pm";
	
	int s=d.indexOf("\"");
	String S1=d.substring(s+1);
	int b1=S1.indexOf("\"");
	System.out.println(S1.substring(0, b1));
	
	
}
}

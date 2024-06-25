package Assignement;

public class stringPalidrom {
public static void main(String[] args) {
	String s="manoj";
	char[] s2=s.toCharArray();
	String s3="";
	for (int i = s2.length-1; i>=0 ; i--) {
		s3=s3+s2[i]+"";
	}
	System.out.println(s3);
}
}

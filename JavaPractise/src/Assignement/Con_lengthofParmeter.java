package Assignement;

public class Con_lengthofParmeter {
public Con_lengthofParmeter(int a,int b) {
	System.out.println(" Con 1");
}
public Con_lengthofParmeter(int a,int b,int c) {
	System.out.println(" Con 2");
}

public static void main(String[] args) {
	Con_lengthofParmeter a2= new Con_lengthofParmeter(12,34,44);
	Con_lengthofParmeter a1= new Con_lengthofParmeter(12,34);
}
}

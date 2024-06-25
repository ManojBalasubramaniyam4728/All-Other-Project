package Assignement;

public class Con_datatype {
	public Con_datatype(int a,String b,double c) {
		System.out.println("con 1");
	}
	public Con_datatype(int a,String b,double c,float d) {
		System.out.println("con 2");
	}
	public static void main(String[] args) {
		Con_datatype s1=new Con_datatype(1,"man",1.2);
		Con_datatype s2=new Con_datatype(1,"man",1.2,1.2f);
	}
}

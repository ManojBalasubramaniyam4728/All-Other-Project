package Assignement;

public class Con_order {
	Con_order(int a,double d){
		System.out.println("Con 1");
	}
	Con_order(int a,double c,String s){
		System.out.println("Con 2");
	}
	public static void main(String[] args) {
		Con_order a1=new Con_order (12,3.4);
		Con_order a2=new Con_order (1,2.3,"hi");
	}
}

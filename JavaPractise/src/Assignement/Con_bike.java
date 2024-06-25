package Assignement;

public class Con_bike {
	String name;
	String cc;
	String brand;
	public Con_bike(String name,String cc,String brand) {
		this.name=name;
		this.cc=cc;
		this.brand=brand;
		System.out.println(this.name+" "+this.cc+" "+this.brand);
	}
	public static void main(String[] args) {
		Con_bike s1=new Con_bike("KTM","390cc","baja");
		Con_bike s2=new Con_bike("KTM","250cc","baja");
		Con_bike s3=new Con_bike("KTM","200cc","baja");
		Con_bike s4=new Con_bike("KTM","150cc","baja");
        Con_bike s5=new Con_bike("MT","390cc","yamaha");
	}
	}



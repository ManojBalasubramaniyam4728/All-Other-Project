package Assignement;

public class Con_college {
	String name;
	String attendance;
	int nob;
	String semester;
	public Con_college(String name,String attendance,int nob,String semester) {
		this.name=name;
		this.attendance=attendance;
		this.nob=nob;
		this.semester=semester;
		System.out.println(this.name+" "+this.attendance+" "+this.nob+" "+this.semester);
	}
	public static void main(String[] args) {
		Con_college s1=new Con_college("manoj","p",0,"8th sem");
		Con_college s2=new Con_college("parveen","p",0,"8th sem");
		Con_college s3=new Con_college("sanjay","p",0,"8th sem");
		Con_college s4=new Con_college("madhan","a",1,"8th sem");
        Con_college s5=new Con_college("dharani","p",0,"8th sem");
	}
	}

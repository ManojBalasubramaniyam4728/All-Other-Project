package Test;

public class EMP {
	String name;
	int eid;
	double sal;
	static String comp="test Yantra";
	public static void main(String[] args) {
		EMP a1=new EMP();
		a1.name="Manoj";
		a1.eid=1;
		a1.sal=10000;
		EMP a2=new EMP();
		a2.name="Praveen";
		a2.eid=2;
		a2.sal=12000;
		EMP a3=new EMP();
		a3.name="Sanjay";
		a3.eid=3;
		a3.sal=14000;
		EMP a4=new EMP();
		a4.name="Sanjana";
		a4.eid=4;
		a4.sal=16000;
		EMP a5=new EMP();
		a5.name="Sanu";
		a5.eid=5;
		a5.sal=18000;
		System.out.println(a1.name+" "+a1.eid+" "+a1.sal+" "+comp);
		System.out.println(a2.name+" "+a2.eid+" "+a2.sal+" "+comp);
		System.out.println(a3.name+" "+a3.eid+" "+a3.sal+" "+comp);
		System.out.println(a4.name+" "+a4.eid+" "+a4.sal+" "+comp);
		System.out.println(a5.name+" "+a5.eid+" "+a5.sal+" "+comp);
		
	}
	

}

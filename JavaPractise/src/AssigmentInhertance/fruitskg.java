package AssigmentInhertance;

public class fruitskg extends fruits{
	int mkg=50;
	int okg=60;
	int bkg=70;
	public static void main(String[] args) {
		fruitskg f1=new fruitskg();
		f1.mango="5 pices";
		f1.orrang="6 pices";
		f1.banna="7 pices";
		System.out.println(f1.mkg);
		System.out.println(f1.okg);
		System.out.println(f1.bkg);
		System.out.println(f1.mango);
		System.out.println(f1.orrang);
		System.out.println(f1.banna);
	}
}

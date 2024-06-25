package AssigmentInhertance;

public class PhoneDetail extends phone {
  public static void main(String[] args) {
	PhoneDetail a1=new  PhoneDetail();
	 a1.phonename="oneplus";
	 a1.ram=16;
		a1.camera="64MP";
		System.out.println(a1.phonename+" "+a1.ram+" "+a1.camera);
}
}

package AssigmentInhertance;

public class BikeDetails extends Bike{
public static void main(String[] args) {
	BikeDetails s1=new BikeDetails();
	s1.brandname="KTM";
	s1.cc="390cc";
	s1.abs="dueal Channal ABS";
	System.out.println(s1.brandname+" "+s1.cc+" "+s1.abs);
}
}

package Test2;

public class mobile {
	String ram;
	String rom;
	String mobileName;
	public mobile(String ram,String rom,String mobileName) {
		this.ram=ram;
		this.rom=rom;
		this.mobileName=mobileName;
		System.out.println("ram:"+this.ram+" "+"rom:"+this.rom+" "+"mobileName:" +this.mobileName);
	}
	public static void main(String[] args) {
		mobile m1=new mobile("8GB","128GB","one plus");
		mobile m2=new mobile("8GB","64GB","Vivo");
		mobile m3=new mobile("6GB","32GB","Oppo");
		mobile m4=new mobile("4GB","128GB","Redmi");
		mobile m5=new mobile("6GB","64GB","Honar");
	}
	}


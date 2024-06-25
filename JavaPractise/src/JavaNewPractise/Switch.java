package JavaNewPractise;

  public class Switch {
   public static void main(String[] args) {
	   
	   String FirstBalance="1xcvhbnm,2,34";
  String Credit="1";
  String ArthamaticOpertions="-";
  FirstBalance=FirstBalance.replaceAll("[^0-9?]", "");
    Integer FB=Integer.parseInt(FirstBalance);
    Integer CD=Integer.parseInt(Credit);
    String DeductedCredit =null;
	  switch (ArthamaticOpertions) {
	  
	  case "-": DeductedCredit=FB-CD+"";
	          break;
	  case "+": DeductedCredit=FB+CD+"";
            break;
	  case "/": DeductedCredit=FB/CD+"";
             break;
	  case "*": DeductedCredit=FB*CD+"";
             break;
	  case "%": DeductedCredit=FB%CD+"";
             break;
	  }

	  System.out.println(FB+" "+ArthamaticOpertions+" "+CD+" = "+DeductedCredit);
}
}

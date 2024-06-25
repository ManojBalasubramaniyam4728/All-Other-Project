package Test;

public class VowelConsonent {
	public static void main(String[] args) {
		char a='a';
			if((a>='A' && a<='Z')||(a>='a' && a<='z')){
				if(a>='A' && a<='Z') {
					if(a=='A'||a=='E'||a=='I'||a=='O' ||a=='U') {
						System.out.println( "it is upper case vowel");
					}
					else {
						System.out.println( "it is uperr case Consonent");
					}
				}
				else {
					if(a=='a'|| a=='e'||a=='i'||a=='o' ||a=='u') { 
						System.out.println("it is lower case vowel");
					}
					else {
					System.out.println( "it is lower case Consonent");
					}
				}
			}
			else if(a>='1'||a<='9') {
				System.out.println( "it is number");
			}
			else {
				System.out.println( "it is spacial char");
			   }
			}
	}




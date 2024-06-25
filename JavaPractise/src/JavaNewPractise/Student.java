package JavaNewPractise;

public class Student {
String name;
String Calss;
int roll;
double Percentage;
public Student(String name,String Class,int roll,double Percentage) {
	name=name;
	Class=Class;
	roll=roll;
    Percentage=Percentage;
	System.out.println(name+" "+Class+" "+roll+" "+Percentage+"%");
}
public static void main(String[] args) {
	Student s1=new Student("Manoj","12Th",1,99.91);
	Student s2=new Student("Sanjay","12Th",2,99.98);
	Student s3=new Student("Praveen","12Th",3,100.00);
	Student s4=new Student("Ranjith","12Th",4,98.99);
	Student s5=new Student("Anitha","12Th",5,75.00);
	
}
}


package JavaNewPractise;

public class College extends Object {
	String StudentName;
	String Semster;
	int Blog;
	College(String StudentName,String Semster,int Blog){
		this.StudentName=StudentName;
		this.Semster=Semster;
		this.Blog=Blog;
	}
		 public String toString() {
			 return "StudentName:"+this.StudentName+"Semster;"+this.Semster+"Blog;"+this.Blog+"";
			
			 
		 }
	public static void main(String[] args) {
		College c1=new College("raju","1sem",2);
		System.out.println(c1);
	}	
	}
	

  
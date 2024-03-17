package oopsassessment;

public class studentclassessment {
	int sid;
	String name;
	int phonenumber;
	static String course="FULL STACK JAVA DEVELOPMENT";
   studentclassessment(int i,String name,int phonenumber)
   {
	  this.sid=i;
	 this.name= name;
	 this.phonenumber=phonenumber;
   }
   void display( )
   {
	   System.out.println(sid+"  "+name+" "+phonenumber+" "+course);
   }
	public static void main(String[] args) {
		studentclassessment student1=new studentclassessment(201,"samyukta",1234567890);
		studentclassessment student2=new studentclassessment(202,"shyamala",987654321);
		student1.display( );
		student2.display( );
		
		

	}

}

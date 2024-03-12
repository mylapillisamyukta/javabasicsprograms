package constructors;

public class constructorexamplestudent {

	 int id;
     String sname;
     constructorexamplestudent(int i,String name)
     {
    	 id=i;
    	 sname=name;
     }
     void display( )
     {
    	 System.out.println(id+"  "+sname);
     }
	public static void main(String[] args) {
		constructorexamplestudent s1=new constructorexamplestudent(101,"samyukta");
		s1.display( );
	

	}
		

	}


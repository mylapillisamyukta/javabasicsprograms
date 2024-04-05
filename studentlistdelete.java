package collections;
import java.util.LinkedList;
import java.util.Scanner;

class student123
{
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    public student123(int sid,String name)
    {
    	super();
        this.sid=sid;
        this.name=name;
    }
     int sid;
     String name;
}

public class studentlistdelete {

	public static void main(String[] args) {
		student ob1=new student(1,"rama");
		student ob2=new student(2,"sita");
		student ob3=new student(3,"janakiram");
		LinkedList<student> s=new LinkedList<student>();
		s.add(ob1);
		s.add(ob2);
		s.add(ob3);
		// System.out.println(s); // here we get hashcode values
	/*	for(student s1:s)
		{
			System.out.println(s1.getName()+" "+s1.getSid()); //OUTPUT:rama 1
			                                                           sita 2
			                                                           janakiram 3
		}  */
		
	    for(int i=0;i<s.size();i++)
	    { 
	    	System.out.println(s.get(i).sid+" "+s.get(i).name); /* output:1 rama
	    	                                                             2 sita
	    	                                                             3 janakiram  */
	    }	
	
	    Scanner sc = new Scanner(System.in);
	    System.out.println(" enter name");
	    String name=sc.next();
	    System.out.println(" enter id ");
	    int id=sc.nextInt();
	    student ob4=new student(id,name);
	    s.add(ob4);
	    for(int i=0;i<s.size();i++)
	  {
	    	System.out.println(s.get(i).sid+" "+s.get(i).name);
	    }  
	    System.out.println("after removing");
	    s.remove(2);     
        for(int i=0;i<s.size();i++)
	    { 
	    	System.out.println(s.get(i).sid+" "+s.get(i).name); 
	    }
	    }
	}



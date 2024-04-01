package javaapplication;
import java.io.*;
class user
{
	String name;
	int age;
	Float salary;
	
	user( String name,int age,Float salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		
	}
 static	void display(user x[])
	{
	  for(int i=0;i<5;i++) {
		System.out.println(x[i].name+" "+x[i].age+" "+x[i].salary);
	}
	
}
}

public class bufferreaderarrayoutput { 

	public static void main(String[] args)throws IOException {
		user a[]=new user[5];
		int i;
		 InputStreamReader reader=new InputStreamReader(System.in);    
		    BufferedReader br=new BufferedReader(reader);   
		    for( i=0;i<5;i++)
		    {
		 System.out.println("enter name");
		 String name=br.readLine();
		 System.out.println("enter age");
		 int age=Integer.parseInt(br.readLine());
		 System.out.println("enter salary");
		 Float salary=Float.parseFloat(br.readLine());
			 a[i]=new user(name,age, salary);
		    }
			// a[i].display()
			 user.display(a);
		 }
		    
	}


package superkeyword;
class firstperson
{
	int id;
	String name;
	firstperson(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
class secondperson extends firstperson
{
	float salary;
	secondperson(int id,String name,float salary)
	{
		super(id,name);
		this.salary=salary;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+salary);
		
	}
}
public class superconstructor {
public static void main(String[] args) {
 secondperson ob=new secondperson(101,"samyukta",5000);
ob.display( );
}	
}

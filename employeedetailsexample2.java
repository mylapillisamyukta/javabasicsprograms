package aggregationhasa;
public class employeedetailsexample2 {
public employeedetailsexample2(int id,String name, Address a)
{
	this.id = id;
	this.name = name;
	this.a = a;
} 
    int id;
    String name;
    Address a;
    public String toString()
    {
    	return id+"*"+name+"*"+a.city+"*"+a.state;
    }
    
	public static void main(String[] args) {
	Address a1 = new Address("vizag","A.P");
	Address a2 = new Address("hyd","A.p");
	employeedetailsexample2 e1 = new employeedetailsexample2(101,"samyukta",a1);
	employeedetailsexample2 e2 = new employeedetailsexample2(102,"shyamala",a2);
	System.out.println(e1);
	System.out.println(e2);
	}
	}



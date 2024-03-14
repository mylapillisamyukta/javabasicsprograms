package aggregationhasa;
public class employeedetails {
public employeedetails(int id,String name, Address1 a) {
	this.id = id;
	this.name = name;
	this.a = a;
} 
    int id;
    String name;
    Address1 a;
void display()
{
	System.out.println(id + " "+ name + a.city + " "+a.state);
}

public static void main(String[] args) {
Address1 a1 = new Address1("vizag","A.P");
Address1 a2 = new Address1("hyd","A.p");
employeedetails e1 = new employeedetails(101,"samyukta",a1);
employeedetails e2 = new employeedetails(102,"shyamala",a2);
    e1.display();
    e2.display();
}
}


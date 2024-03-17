package interfaceexample;
interface Employee2
{
	  String company = "logistics"; 
	  // by default static and final
	  int calsal(); // by deafult abstract
	  void display();
	  int i = 50;

}
interface Address2
{
	String state = "A.p.";
	void display();
    int i = 60;
}
class EmployeeAddressCompany implements Employee2,Address2
{
public int calsal()
	{
	     int sal = 1000;
		return sal;
	}
public void display()
{
	System.out.println("stae is"+state);
	int z = Employee2.i+Address2.i;
	System.out.println(z);
}
}
public class interfaceexample2 {
	public static void main(String[] args) {
		Employee2 	 a = new EmployeeAddressCompany();
		a.display();
	System.out.println(a.calsal());
	Address2 b = new EmployeeAddressCompany();
	b.display();
	}
}


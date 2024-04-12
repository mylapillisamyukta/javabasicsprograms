package collections;
import java.util.ArrayList;
import java.util.Scanner;

class Employee
{
	int eid;
	String ename;
	double salary;
	
public Employee(int eid, String ename, double salary) {
	super();
    this.eid = eid;
    this.ename = ename;
    this.salary = salary;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public class employeecollectionassessment {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"samyukta",50000);
		Employee e2=new Employee(2,"ragini",50000);
		Employee e3=new Employee(3,"shyamala",50000);
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		for(int i=0;i<emp.size();i++)
		{
			System.out.println(emp.get(i).eid+" "+emp.get(i).ename+" "+emp.get(i).salary);
		}
		
    // from the user add
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int  eid=sc.nextInt();
		System.out.println("enter name");
		String ename=sc.next();
		System.out.println("enter salary");
		double salary=sc.nextDouble();
		Employee e4=new Employee(eid,ename,salary);
		emp.add(e4);
		for(int i=0;i<emp.size();i++)
		{
			System.out.println(emp.get(i).eid+" "+emp.get(i).ename+" "+emp.get(i).salary);
		}
		// to remove
	/*	System.out.println("enter employee id to remove:");
		int eidtoremove =sc.nextInt();
		for(Employee e: emp)
		{
			if(e.getEid() == eidtoremove)
			{
				emp.remove(e);
				System.out.println("employee id"+ eidtoremove +" removed successfully.");
				return;
			}
		}
		System.out.println("employee id"+ eidtoremove +" not found"); */
		
		// to update value

		System.out.println("enter employee id to update: ");
		int eidtoupdate = sc.nextInt();
		for(Employee e: emp)
		{
			if(e.getEid() == eidtoupdate) {
				System.out.println(" enter updated employee details:");
				sc.nextLine();
				System.out.println("enter name");
				String ename1=sc.nextLine();
				System.out.print("enter salary");
				double salary1=sc.nextDouble();
				
				e.setEname(ename1);
				e.setSalary(salary1);
				System.out.println("employee details updated successfully");
				return;	
				
			}
			}
		System.out.println("employee id"+eidtoupdate+"not found");
		}
		
	}

}

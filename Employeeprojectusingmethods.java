package employeeproject;

import java.util.*;

public class Employeeprojectusingmethods {

	public int eid;
	public String name;

	public Employeeprojectusingmethods(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}

	public int getId() {
		return eid;
	}

	public void setId(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static class EmployeeService {
		Scanner sc = new Scanner(System.in);
		HashSet<Employeeprojectusingmethods> s = new HashSet<Employeeprojectusingmethods>();

		public EmployeeService() {
			Employeeprojectusingmethods e1 = new Employeeprojectusingmethods(1, "samyukta");
			Employeeprojectusingmethods e2 = new Employeeprojectusingmethods(2, "ece");
			s.add(e1);
			s.add(e2);
		}

		public void addEmpl() {
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter id");
			int id = sc.nextInt();
			Employeeprojectusingmethods e3 = new Employeeprojectusingmethods(id, name);
			s.add(e3);
			System.out.println(s);
			for (Employeeprojectusingmethods x : s) {
				System.out.println(x.eid + " " + x.name);
			}
			System.out.println("Employee added");
		}

		public void deleteEmp() {
			System.out.println("Enter employee id to remove");
			int rid = sc.nextInt();
			boolean found = false;
			Employeeprojectusingmethods empdelete = null;
			for (Employeeprojectusingmethods ed : s) {
				if (ed.getId() == rid) {
					empdelete = ed;
					found = true;
				}
			}
			if (!found) {
				System.out.println("Not found");
			} else {
				s.remove(empdelete);
				System.out.println("Record deleted ");
			}
			System.out.println("Updated list after deletion");
			for (Employeeprojectusingmethods x : s) {
				System.out.println(x.eid + " " + x.name);
			}
		}

		public void updateEmployee() {
			System.out.println("Enter id to update: ");
			int lid = sc.nextInt();
			boolean found = false;
			for (Employeeprojectusingmethods emp : s) {
				if (emp.getId() == lid) {
					System.out.println("Enter name: ");
					String ename = sc.next();
					emp.setName(ename);
					System.out.println("Updated Details of employee are: ");
					System.out.println(emp.eid + " " + emp.name);
					found = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. Add Employee");
			System.out.println("2. Delete Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				employeeService.addEmpl();
				break;
			case 2:
				employeeService.deleteEmp();
				break;
			case 3:
				employeeService.updateEmployee();
				break;
			case 4:
				System.out.println("Exiting program...");
				break;
			default:
				System.out.println("Invalid choice! Please enter a valid option.");
			}
		} while (choice != 4);
	}
}

package employeeproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employeeprojectusingmaps {
	public int eid;
	public String name;

	public Employeeprojectusingmaps(int eid, String name) {
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

	public static class MAPEXAMPLE {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Employeeprojectusingmaps> m = new HashMap<Integer, Employeeprojectusingmaps>();
		Employeeprojectusingmaps e1 = new Employeeprojectusingmaps(1, "samyukta");
		Employeeprojectusingmaps e2 = new Employeeprojectusingmaps(2, "sita");

		public MAPEXAMPLE() {
			m.put(1, e1);
			m.put(2, e2);
		}

		public void addEmpl() {
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter id");
			int id = sc.nextInt();
			Employeeprojectusingmaps e3 = new Employeeprojectusingmaps(id, name);
			m.put(id, e3);
			System.out.println(m);
			for (Map.Entry<Integer, Employeeprojectusingmaps> x : m.entrySet()) {
				System.out.println(x.getKey() + " " + x.getValue().getId() + " " + x.getValue().getName());
			}
			System.out.println("Employee added");
		}

		public void deleteEmp() {
			System.out.println("Enter employee id to remove");
			int rid = sc.nextInt();
			if (m.containsKey(rid)) {
				m.remove(rid);
				System.out.println("Record deleted");
			} else {
				System.out.println("Employee not found");
			}
			System.out.println("Updated list after deletion");
			for (Map.Entry<Integer, Employeeprojectusingmaps> x : m.entrySet()) {
				System.out.println(x.getKey() + " " + x.getValue().getId() + " " + x.getValue().getName());
			}
		}

		public void updateEmployee() {
			System.out.println("Enter id to update: ");
			int lid = sc.nextInt();
			if (m.containsKey(lid)) {
				System.out.println("Enter name: ");
				String ename = sc.next();
				m.get(lid).setName(ename);
				System.out.println("Updated Details of employee are: ");
				System.out.println(m.get(lid).getId() + " " + m.get(lid).getName());
			} else {
				System.out.println("Employee not found");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MAPEXAMPLE ob1 = new MAPEXAMPLE();
		int choice;
		do {
			System.out.println("1. Add Employee");
			System.out.println("2. Delete Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				ob1.addEmpl();
				break;
			case 2:
				ob1.deleteEmp();
				break;
			case 3:
				ob1.updateEmployee();
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
